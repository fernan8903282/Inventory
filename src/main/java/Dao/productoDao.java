/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Productos.productos;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class productoDao {
    productos producto=new productos();
    DefaultTableModel modelo;
    PreparedStatement pst;
    
    public Connection conectar(){
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
    
    public void cargarentabla(String sql,JTable tabla){
            List<productos> lista=new ArrayList<>();
            String[] titulos={"Id", "Nombre", "Precio", "Stock", "Tipo", "Estatus"};
            modelo=new DefaultTableModel(null,titulos);
            tabla.setModel(modelo);
        try {
            Connection conexion=conectar();
            PreparedStatement stat=conexion.prepareStatement(sql);
            ResultSet rs=stat.executeQuery();
            int anchos[] = {30, 130, 60, 50, 40, 40};
            for (int i = 0; i < 6; i++) {
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            while(rs.next()){
                    Object arreglo[]=new Object[6];
                    for(int i=0;i<5;i++){
                        arreglo[i]=rs.getObject(i+1);
                    }
                        arreglo[5]=estatus(rs.getInt("idStatus"));
                    modelo.addRow(arreglo);
            }
        } catch (SQLException ex) {
            System.out.println("problemas en cargarsinfotos");
            Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public productos cargar(int id){
        try {
            Connection conexion=conectar();
            String sql="SELECT * FROM productos WHERE id= '"+id+"'";
            PreparedStatement stat=conexion.prepareStatement(sql);
            ResultSet rs=stat.executeQuery();
            while(rs.next()){
                producto.setId(rs.getString("id"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getString("stock"));
                producto.setTipo(rs.getString("tipo"));
                producto.setImagen(rs.getBytes("imagen"));
                producto.setIdStatus_producto(rs.getInt("idStatus"));
            }
        } catch (SQLException ex) {
            System.out.println("problemas en cargarsinfotos");
            Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
           return producto;
    }
    
    public void Guardar(String path,JTextField txtName,JTextField txtPrecio,JTextField txtStock,JComboBox txtTipo){
        Connection conexion=conectar();
        try {    
            byte[] f=readFile(path);
            pst=conexion.prepareStatement("INSERT INTO productos(id,nombre,precio,stock,tipo,idStatus,imagen) VALUES (null,?,?,?,?,?,?)");
                pst.setString(1, txtName.getText());
                pst.setDouble(2, Double.parseDouble(txtPrecio.getText()));
                pst.setString(3, txtStock.getText());
                pst.setString(4, txtTipo.getSelectedItem().toString());
                pst.setString(5, "1");
                pst.setBytes(6, f);
                pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "El producto a sido guardado correctamente");
        } catch (Exception ex) {
            System.out.println("problemas en guardar");
            Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificar(productos producto, String path){
        producto.setImagen(readFile(path));
        String sql;
        try {
            Connection conexion=conectar();
            if (path == null){
               sql="UPDATE `productos` SET nombre=?, precio=?, stock=?, tipo=?, idStatus=? WHERE id=?";
                pst=conexion.prepareStatement(sql);
                pst.setString(1,producto.getNombre());
                pst.setDouble(2,producto.getPrecio());
                pst.setString(3,producto.getStock());
                pst.setString(4,producto.getTipo());
                pst.setInt(5,producto.getIdStatus_producto());
                pst.setString(6,producto.getId());
                pst.executeUpdate();
            }else{
                sql="UPDATE `productos` SET nombre=?, precio=?, stock=?, tipo=?, idStatus=?, imagen=? WHERE id=?";
                pst=conexion.prepareStatement(sql);
                pst.setString(1,producto.getNombre());
                pst.setDouble(2,producto.getPrecio());
                pst.setString(3,producto.getStock());
                pst.setString(4,producto.getTipo());
                pst.setInt(5,producto.getIdStatus_producto());
                pst.setBytes(6,producto.getImagen());
                pst.setString(7,producto.getId());
                pst.executeUpdate();
            }
        } catch (SQLException ex) {
            System.out.println("problemas en modificar");
            Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
    public void ModificarStock(int id, int nuevo, int v){
        Connection conexion=conectar();
        int stock=0;
        try {
            String sql="SELECT * FROM productos WHERE id= '"+id+"'";
            PreparedStatement stat=conexion.prepareStatement(sql);
            ResultSet rs=stat.executeQuery();
            while(rs.next()){
                stock=rs.getInt("stock");
            }
        } catch (SQLException ex) {
            System.out.println("problemas en ModificarStock");
            Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        int tot=stock(stock, nuevo, v);
        try {
            pst=conexion.prepareStatement("UPDATE `productos` SET stock=? WHERE id=?");
            pst.setInt(1, tot);
            pst.setInt(2, id);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("problemas en ModificarStock");
            Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Eliminar(int id){
        try {
            Connection conexion=conectar();
            String sql="DELETE FROM productos WHERE id='"+id+"'";
            Statement state=conexion.createStatement();
            state.execute(sql);
        } catch (SQLException ex) {
            System.out.println("Problemas en Eliminar");
            Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private byte[] readFile(String file) {
        ByteArrayOutputStream bos = null;
        try {
            File f = new File(file);
            FileInputStream fis = new FileInputStream(f);
            byte[] buffer = new byte[1024];
            bos = new ByteArrayOutputStream();
            for (int len; (len = fis.read(buffer)) != -1;) {
                bos.write(buffer, 0, len);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e2) {
            System.err.println(e2.getMessage());
        }
        return bos != null ? bos.toByteArray() : null;
    }
    private String estatus(int i){
        switch (i) {
            case 1:
                return "Activo";
            case 2:
                return "Inactivo";
            default:            
                return "Eliminado";
        }
    }
    private int stock(int stock, int nuevo,int v){
        if(v==1){
            int tot= stock + nuevo;
            return tot;
        }else{
            int tot= stock - nuevo;
            return tot;
        }
    }
}
