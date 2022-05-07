/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import Dao.entradaDao;
import Dao.productoDao;
import Productos.Entradap;
import Productos.Render;
import Productos.productos;
import java.awt.Color;
import java.awt.Image;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Venta extends javax.swing.JPanel {
    entradaDao dao=new entradaDao();
    productoDao pDao=new productoDao();
    DefaultTableModel modelo;
    public Venta() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtCost = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdVenta = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableNew = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtTotal_ = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();
        btnBorrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.setForeground(new java.awt.Color(153, 153, 153));
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setText("10");
        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtIdMousePressed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 161, 200, 30));

        txtCantidad.setForeground(new java.awt.Color(153, 153, 153));
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.setText("30");
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCantidadMousePressed(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 248, 200, 30));

        txtCost.setForeground(new java.awt.Color(153, 153, 153));
        txtCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCost.setText("50000");
        txtCost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCostMousePressed(evt);
            }
        });
        jPanel1.add(txtCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 335, 200, 30));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Id producto");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 127, 188, 28));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Productos vendidos");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 214, 188, 28));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Venta total");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 301, 188, 28));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Id Venta");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 0, 61, 30));

        txtIdVenta.setForeground(new java.awt.Color(255, 255, 255));
        txtIdVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIdVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 28, 151, 25));

        btnIngresar.setBackground(new java.awt.Color(102, 102, 102));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 383, -1, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 431));

        tableNew.setAutoCreateRowSorter(true);
        tableNew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Producto", "Nombre", "Cantidad", "Costo unitario", "Imagen"
            }
        ));
        jScrollPane2.setViewportView(tableNew);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 500, 320));

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Fecha");
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 200, 30));

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Total");
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 200, 30));

        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 200, 25));

        jTextField3.setBackground(new java.awt.Color(102, 102, 102));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Ventas");
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 6, 500, 40));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Total");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 90, 29));

        txtTotal_.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotal_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel2.add(txtTotal_, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 480, 88, 29));

        btnGuardar.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, 80, 29));

        txtFecha.setDateFormatString("yyyy-MM-dd ");
        txtFecha.setEnabled(false);
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 200, 25));

        btnBorrar.setBackground(new java.awt.Color(102, 102, 102));
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("Borrar");
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 80, 29));

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Cancelar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 80, 29));

        btnCrear.setBackground(new java.awt.Color(102, 102, 102));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Presiona para crear venta");
        btnCrear.setActionCommand("presiona para crear entrada");
        btnCrear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, null, null));
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel2.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 6, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
          
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if( txtIdVenta.getText().equals( "" ) ){
            JOptionPane.showMessageDialog(null, "Debes crear la venta");
        }else{
            productoDao daop=new productoDao();
            productos producto =daop.cargar( Integer.parseInt( txtId.getText() ) );
            if( producto.getNombre() == null ){JOptionPane.showMessageDialog(null,"El id es invalido");
            }else{
                int com = Integer.parseInt( producto.getStock() ) - Integer.parseInt( txtCantidad.getText() );
                if( com < 0 ){
                    JOptionPane.showMessageDialog(null,"Productos vendidos mayores a existencias registradas");
                }else{
                    txtTotal_.setText( txtTotal.getText() );
                    //nueva fila
                    tableNew.setDefaultRenderer( Object.class, new Render() );
                    modelo=( DefaultTableModel ) tableNew.getModel();
                        int anchos[] = {30,120,30,40,80};
                        for (int i = 0; i < tableNew.getColumnCount(); i++) {
                            tableNew.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                        }    
                    modelo.addRow(new Object[]{"","","","",""});
                    tableNew.setRowHeight(80);
                        tableNew.setValueAt(txtId.getText(),tableNew.getRowCount()-1, 0);
                        tableNew.setValueAt(producto.getNombre(),tableNew.getRowCount()-1, 1);
                        tableNew.setValueAt(txtCantidad.getText(),tableNew.getRowCount()-1, 2);
                            int total=(Integer.parseInt(txtCost.getText()))/(Integer.parseInt(txtCantidad.getText()));
                        tableNew.setValueAt(String.valueOf(total),tableNew.getRowCount()-1, 3);
                        imagen(producto);
                    int Total=Integer.parseInt(txtCost.getText())+Integer.parseInt(txtTotal_.getText());
                    txtTotal_.setText(String.valueOf(Total));
                    txtTotal.setText(txtTotal_.getText());
                    txtId.setText("");
                    txtCost.setText("");
                    txtCantidad.setText("");
                }
            }}
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        try{
            DefaultTableModel casa = (DefaultTableModel) tableNew.getModel();
            int r=tableNew.getSelectedRow();
            int cant=Integer.parseInt((String) tableNew.getValueAt(r, 2));
            int cost=Integer.parseInt((String) tableNew.getValueAt(r, 3));
            int total=cost*cant;
            int Total=Integer.parseInt(txtTotal_.getText())-total;
            txtTotal_.setText(String.valueOf(Total));
            txtTotal.setText(txtTotal_.getText());
            casa.removeRow(tableNew.getSelectedRow());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "no has seleccionado una venta");
        }   
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Entradap venta=new Entradap();
        venta.setFecha(((JTextField)txtFecha.getDateEditor().getUiComponent()).getText());
        venta.setTotal( Double.parseDouble((txtTotal.getText())));
        venta.setIdStatus("2");
        dao.Guardar( venta,"venta" );   
        try{
            int filas=tableNew.getRowCount();
            DefaultTableModel ss=(DefaultTableModel) tableNew.getModel();
            for (int i = 0;filas>i; i++) {
                Entradap s=new Entradap();
                    s.setId_rel(txtIdVenta.getText());
                    s.setCantidad(Integer.parseInt(String.valueOf(tableNew.getValueAt(0, 2))));
                    s.setCosto( Double.parseDouble(String.valueOf(tableNew.getValueAt(0, 3))));
                    s.setId_Det_producto(String.valueOf(tableNew.getValueAt(0, 0)));
                dao.GuardarDetalles( s, "venta" );
                ss.removeRow(0);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas al guardar filas");
            Logger.getLogger(productoDao.class.getName()).log(Level.SEVERE, null, e);
        }
        limpiar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        Calendar fechaactual=new GregorianCalendar();
        txtIdVenta.setText( dao.car( "venta" ) );
        txtFecha.setCalendar(fechaactual);
        txtTotal.setText("0");
    }//GEN-LAST:event_btnCrearActionPerformed

    private void txtIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMousePressed
        if( txtId.getText().equals( "10" ) ){
            txtId.setText( "" );
            txtId.setForeground( Color.black );
        }
        if( txtCantidad.getText().isEmpty() ){
            txtCantidad.setText( "30" );
            txtCantidad.setForeground( new Color( 153,153,153 ) );
        }
        if( txtCost.getText().isEmpty() ){
            txtCost.setText( "50000" );
            txtCost.setForeground( new Color( 153,153,153 ) );
        }
    }//GEN-LAST:event_txtIdMousePressed

    private void txtCantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMousePressed
        if( txtCantidad.getText().equals( "30" ) ){
            txtCantidad.setText( "" );
            txtCantidad.setForeground( Color.black );
        }
        if( txtId.getText().isEmpty() ){
            txtId.setText( "10" );
            txtId.setForeground( new Color( 153,153,153 ) );
        }
        if( txtCost.getText().isEmpty() ){
            txtCost.setText( "50000" );
            txtCost.setForeground( new Color( 153,153,153 ) );
        }
    }//GEN-LAST:event_txtCantidadMousePressed

    private void txtCostMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCostMousePressed
        if( txtCost.getText().equals( "50000" ) ){
            txtCost.setText( "" );
            txtCost.setForeground( Color.black );
        }
        if( txtCantidad.getText().isEmpty() ){
            txtCantidad.setText( "30" );
            txtCantidad.setForeground( new Color( 153,153,153 ) );
        }
        if( txtId.getText().isEmpty() ){
            txtId.setText( "10" );
            txtId.setForeground( new Color( 153,153,153 ) );
        }
    }//GEN-LAST:event_txtCostMousePressed
    private void imagen(productos producto){
            if(producto.getImagen()!=null){
                byte[] imageData=producto.getImagen();
                Image format=new ImageIcon(imageData).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
                ImageIcon m3= new ImageIcon(format);
                tableNew.setValueAt(new JLabel(m3),tableNew.getRowCount()-1, 4);
            }else{tableNew.setValueAt(new JLabel("no imagen"),tableNew.getRowCount()-1, 4);}
    }
    private void limpiar(){
        try{
            txtIdVenta.setText("");
            txtFecha.setCalendar(null);
            txtTotal.setText("");
            DefaultTableModel ss=(DefaultTableModel) tableNew.getModel();
            int filas=tableNew.getRowCount();
            for (int i = 0;filas>i; i++) {
                ss.removeRow(0);
            }
            txtTotal_.setText("");
            txtTotal.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tableNew;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCost;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JLabel txtIdVenta;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JLabel txtTotal_;
    // End of variables declaration//GEN-END:variables
}
