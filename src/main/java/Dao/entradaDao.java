/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Productos.Entradap;
import Productos.productos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class entradaDao{
    Entradap entrada=new Entradap();
    productoDao dao=new productoDao();
    PreparedStatement pst;
    DefaultTableModel modelo;
    
    public Connection conectar(){
        //String conexionurl="jdbc:mysql://localhost:3306/prueba";
        String conexionurl="jdbc:h2:file:.\\base\\inventario";
        String driver="org.h2.Driver";
        Connection conexion=null;
        try{
            Class.forName(driver);
            conexion=DriverManager.getConnection(conexionurl, "root", "");
        }catch(Exception e){
               JOptionPane.showMessageDialog(null,"Error en conexion");
               Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, e);  
        } 
        return conexion;
    }
    public void desconectar(Connection conexion) throws SQLException{
        conexion.close();
    }
    
    public String car(String palabra){
        String re = "";
        try {
            Connection conexion=conectar();
            String sql="SELECT MAX(id) AS id FROM "+palabra;
            PreparedStatement stat=conexion.prepareStatement(sql);
            ResultSet rs=stat.executeQuery();
            while(rs.next()){
            re=rs.getString("id");
            }
        } catch (SQLException ex) {
            Logger.getLogger(entradaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        if( re == null ){
            return "1";
        }else{
        int r=Integer.parseInt(re)+1;
        String t=String.valueOf(r);
        return t;
        }
    }
    
    //Tablas
    
    public String cargart(String sql,JTable tableNew,String palabra){
        Connection conexion=conectar();
        double total=0;
        String[] titulos={"Id "+palabra, "Fecha", "Id producto", "Nombre", "Cantidad", "Total"};
        modelo=new DefaultTableModel(null, titulos);
        tableNew.setModel(modelo);
        try {
            PreparedStatement stat=conexion.prepareStatement(sql);
            ResultSet rs=stat.executeQuery();
            int anchos[] = {20,135,40,135,40,65};
            for(int i = 0; i < 6; i++){
                tableNew.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while( rs.next() ){
                double tl=0;
                if( rs.getInt("idStatus") == 3 ){
                    modelo.addRow(new Object[]{"**","","","","",""});
                        try{
                        String s="SELECT * FROM det"+palabra+" WHERE id_"+palabra+"= '"+rs.getString("id")+"'";
                        PreparedStatement sta=conexion.prepareStatement(s);
                        ResultSet t=sta.executeQuery();
                        while(t.next()){
                            double uli=t.getDouble("costo_unitario")*t.getDouble("cantidad");
                            tl=uli+tl;
                        }
                        }catch ( Exception e ){
                            System.out.println("Problemas en cargar");
                        }
                        ExclusivoMod ( tl, rs.getInt( "id" ), palabra );
                }else{
                modelo.addRow(new Object[]{rs.getString("id"),rs.getString("fecha"),"","","",estatus(rs.getInt("idStatus"))});
                try{
                    String s="SELECT * FROM det"+palabra+" WHERE id_"+palabra+"= '"+rs.getString("id")+"'";
                    PreparedStatement sta=conexion.prepareStatement(s);
                    ResultSet t=sta.executeQuery();
                    while(t.next()){
                        productos producto=dao.cargar(Integer.parseInt(t.getString("id_producto")));
                        modelo.addRow(new Object[]{"",t.getString("id"),t.getString("id_producto"),producto.getNombre(),t.getString("cantidad"),""});
                        double uli=t.getDouble("costo_unitario")*t.getDouble("cantidad");
                        tl=uli+tl;
                    }
                }catch ( Exception e ){
                    System.out.println("Problemas en cargar");
                }
                ExclusivoMod ( tl, rs.getInt( "id" ), palabra );
                modelo.addRow ( new Object[]{"","","","","",tl} ) ;
                tableNew.setRowHeight(30);
                total=tl+total;
            }}
        desconectar(conexion);
        } catch (SQLException ex) {
            System.out.println("Problemas en cargar");
            Logger.getLogger(entradaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        String c=String.valueOf(total);
        return c;
    }
    
    public String cargartabla( String sql, JTable tableNew, String palabra ){
        Connection conexion=conectar();
        double total=0;
        String[] titulos={"Id "+palabra, "Fecha", "Id producto", "Nombre", "Cantidad", "Total"};
        modelo=new DefaultTableModel(null, titulos);
        tableNew.setModel(modelo);
        try {
            PreparedStatement stat=conexion.prepareStatement(sql);
            ResultSet rs=stat.executeQuery();
            int anchos[] = {20,135,40,135,40,65};
            for(int i = 0; i < 6; i++){
                tableNew.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while(rs.next()){
                double f=0;
                modelo.addRow(new Object[]{rs.getString("id"),rs.getString("fecha"),"","","",estatus(rs.getInt("idStatus"))});
                try{
                    String s="SELECT * FROM det"+palabra+" WHERE id_"+palabra+"= '"+rs.getString("id")+"'";
                    PreparedStatement sta=conexion.prepareStatement(s);
                    ResultSet t=sta.executeQuery();
                    while(t.next()){
                        productos producto=dao.cargar(Integer.parseInt(t.getString("id_producto")));
                        modelo.addRow(new Object[]{"",t.getString("id"),t.getString("id_producto"),producto.getNombre(),t.getString("cantidad"),""});
                        int uli=t.getInt("costo_unitario")*t.getInt("cantidad");
                    }
                }catch(Exception e){
                    System.out.println("Problemas en cargar");
                }
                f = rs.getInt("total");
                modelo.addRow(new Object[]{"","","","","",f});
                tableNew.setRowHeight(30);
                if ( rs.getInt("idStatus") == 3 ) {
                    f=0;
                }
                total=f+total;
            }
        desconectar(conexion);
        } catch (SQLException ex) {
            System.out.println("Problemas en cargar");
            Logger.getLogger(entradaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        String c=String.valueOf(total);
        return c;
    }
    
    public String cargarDettabla( String p, JTable tableNew, String palabra){
        Connection conexion=conectar();
        double total=0;
        String c;
        String[] titulos={"Id "+palabra, "Fecha", "Id producto", "Nombre", "Cantidad", "Total"};
        modelo=new DefaultTableModel(null, titulos);
        tableNew.setModel(modelo);
        int id_en=0;
        try{
            PreparedStatement stat=conexion.prepareStatement(p);
            ResultSet rse=stat.executeQuery();
            while(rse.next()){
                if(rse.getInt( "id_"+palabra )!=id_en){
                try {
                    String sql="SELECT * FROM "+palabra+" WHERE id= '"+rse.getInt( "id_"+palabra )+"'";
                    PreparedStatement st=conexion.prepareStatement(sql);
                    ResultSet rs=st.executeQuery();
                    int anchos[] = {20,135,40,135,40,65};
                    for(int i = 0; i < 6; i++){
                        tableNew.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                    }
                    while(rs.next()){
                        double f=0;
                        modelo.addRow(new Object[]{rs.getString("id"),rs.getString("fecha"),"","","",estatus(rs.getInt("idStatus"))});
                        try{
                            String s="SELECT * FROM det"+palabra+" WHERE id_"+palabra+"= '"+rs.getString("id")+"'";
                            PreparedStatement sta=conexion.prepareStatement(s);
                            ResultSet t=sta.executeQuery();
                            while(t.next()){
                                productos producto=dao.cargar(t.getInt("id_producto"));
                                modelo.addRow(new Object[]{"",t.getString("id"),t.getString("id_producto"),producto.getNombre(),t.getString("cantidad"),""});
                            }
                        }catch(Exception e){
                            System.out.println("Problemas en cargardet");
                        }
                        f = rs.getInt("total");
                        modelo.addRow(new Object[]{"","","","","",f});
                        tableNew.setRowHeight(30);
                        if ( rs.getInt("idStatus") == 3 ) {
                            f=0;
                        }
                        total=f+total;
                    }
                } catch (SQLException ex) {
                    System.out.println("Problemas en cargardet");
                }
            id_en=rse.getInt("id_"+palabra);}
            }
            desconectar(conexion);
        }catch(SQLException e){
            System.out.println("Problemas en cargardet");
            Logger.getLogger(entradaDao.class.getName()).log(Level.SEVERE, null, e);
        }
        c=String.valueOf(total);
        return c;
    }
    
    //cargar
    
    public Entradap cargar(int id, String palabra){
        try {
            Connection conexion=conectar();
            String sql="SELECT * FROM "+palabra+" WHERE id= '"+id+"'";
            PreparedStatement stat=conexion.prepareStatement(sql);
            ResultSet rs=stat.executeQuery();
            while(rs.next()){
                entrada.setId(rs.getString("id"));
                entrada.setTotal(rs.getDouble("total"));
                entrada.setIdStatus(rs.getString("idStatus"));
            }
        } catch (SQLException ex) {
            System.out.println("problemas en cargarsinfotos");
            Logger.getLogger(entradaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
           return entrada;
    }
    public Entradap cargarDetalles(int id, String palabra){
        try {
            Connection conexion=conectar();
            String sql="SELECT * FROM det"+palabra+" WHERE id= '"+id+"'";
            PreparedStatement stat=conexion.prepareStatement(sql);
            ResultSet rs=stat.executeQuery();
            while(rs.next()){
                entrada.setId_rel( rs.getString( "id_"+palabra ) );
                entrada.setCosto( rs.getDouble( "costo_unitario" ) );
                entrada.setCantidad( rs.getInt( "cantidad" ) );
                entrada.setId_Det_producto( rs.getString("id_producto"));
            }
        } catch (SQLException ex) {
            System.out.println("problemas en cargarsinfotos");
            Logger.getLogger(entradaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
           return entrada;
    }
    
    //guardar
    
    public void Guardar(Entradap entrada, String palabra){
        Connection conexion=conectar();
        try {    
            pst=conexion.prepareStatement("INSERT INTO "+palabra+" (`id`, `fecha`, `total`, `idStatus`) VALUES (NULL,?,?,?);");
                pst.setString(1, entrada.getFecha());
                pst.setDouble(2, entrada.getTotal());
                pst.setString(3, entrada.getIdStatus());
                int inserted=pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "La "+palabra+" a sido guardada correctamente");
            desconectar(conexion);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Problemas en guardar");
            Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void GuardarDetalles(Entradap entrada, String palabra){
        Connection conexion=conectar();
        try {    
            pst=conexion.prepareStatement("INSERT INTO det"+palabra+" ( id, id_"+palabra+", costo_unitario, cantidad, id_producto) VALUES (null,?,?,?,?)");
                pst.setString(1, entrada.getId_rel());
                pst.setDouble(2, entrada.getCosto());
                pst.setInt(3, entrada.getCantidad());
                pst.setString(4, entrada.getId_Det_producto());
                int inserted=pst.executeUpdate();
            desconectar(conexion);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problemas en guardar detalles");
            Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //modificar
    
    public void ExclusivoMod(double Total,int id, String palabra){
        String sql;
        try {  
            Connection conexion=conectar();
            sql="UPDATE "+palabra+" SET total=? Where id=?";
             pst=conexion.prepareStatement(sql);
             pst.setDouble(1, Total);
             pst.setInt(2, id);
                pst.executeUpdate();
             desconectar(conexion);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Problemas en Exlusivo");
            Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    public void modificar(int Estatus, int id, String palabra){
        String sql;
        if( Estatus == 2 ){
            JOptionPane.showMessageDialog(null, "No debes puedes cambiar el estatus a 'en proceso'");
        }else{
            try{
            if( compr( Estatus, id, palabra ) ){
                Connection conexion=conectar();
                sql="UPDATE "+palabra+" SET idStatus=? Where id=?";
                pst=conexion.prepareStatement(sql);
                pst.setInt(1, Estatus);
                pst.setInt(2, id);
                pst.executeUpdate();
                if( Estatus == 1 ){
                    try{
                        String s="SELECT * FROM det"+palabra+" WHERE id_"+palabra+"= '"+id+"'";
                        PreparedStatement sta=conexion.prepareStatement(s);
                        ResultSet t=sta.executeQuery();
                        if( palabra.equals( "entrada" ) ){
                            while(t.next()){
                                dao.ModificarStock( t.getInt( "id_producto" ),  t.getInt( "cantidad" ), 1);
                            }
                        }else{
                            while(t.next()){
                                dao.ModificarStock( t.getInt( "id_producto" ),  t.getInt( "cantidad" ), 0);
                            }
                        }
                    }catch ( Exception e ){
                            System.out.println("Problemas en modificar estatus stock");
                        }
                }else if( Estatus == 3 ){
                    try{
                        String s="SELECT * FROM det"+palabra+" WHERE id_"+palabra+"= '"+id+"'";
                        PreparedStatement sta=conexion.prepareStatement(s);
                        ResultSet t=sta.executeQuery();
                        if( palabra.equals( "entrada" ) ){
                            while(t.next()){
                                dao.ModificarStock( t.getInt( "id_producto" ),  t.getInt( "cantidad" ), 0);
                            }
                        }else{
                            while(t.next()){
                                dao.ModificarStock( t.getInt( "id_producto" ),  t.getInt( "cantidad" ), 1);
                            }
                        }
                    }catch ( Exception e ){
                            System.out.println("Problemas en modificar estatus stock");
                        } 
                }
                desconectar(conexion);
                }else{System.out.println("no paso");}
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"Problemas en modificar entrada");
                Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }
    }
    
    public void modificarDetalles(Entradap entrada, String palabra){
        String sql;
        try {  
            Connection conexion=conectar();
            sql="UPDATE `det"+palabra+"` SET id_"+palabra+"=?, costo_unitario=?, cantidad=?, id_producto=? Where id=?";
                pst=conexion.prepareStatement(sql);
                pst.setString(1, entrada.getId_rel());
                pst.setDouble(2, entrada.getCosto());
                pst.setInt(3, entrada.getCantidad());
                pst.setString(4, entrada.getId_Det_producto());
                pst.setString(5, entrada.getId_Det());
            pst.executeUpdate();
            System.out.println("detalles modificados correctamente");
             desconectar(conexion);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Problemas en modificar detalles de entrada");
            Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    
    //Eliminar
    
    public void Eliminar(int id, String palabra){
        try {
            Connection conexion=conectar();
            String sql="DELETE FROM "+palabra+" WHERE id='"+id+"'";
            Statement state=conexion.createStatement();
            state.execute(sql);
            desconectar(conexion);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Problemas en eliminar");
            Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void EliminarDetalles(int id, String palabra){
        try {
            Connection conexion=conectar();
            String sql="DELETE FROM det"+palabra+" WHERE id='"+id+"'";
            Statement state=conexion.createStatement();
            state.execute(sql);
            System.out.println("detalles eliminados correctamente");
            desconectar(conexion);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Problemas en eliminar detalles de entrada");
            Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private String estatus(int i){
        switch (i) {
            case 1:
                return "Completado";
            case 2:
                return "En proceso";
            default:            
                return "Cancelado";
        }
    }
    public boolean compr( int tr,int id, String palabra ){
        Entradap entr = cargar( id, palabra );
        return tr != Integer.parseInt(entr.getIdStatus());
    }
    
}
