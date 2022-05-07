/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import Dao.productoDao;
import Productos.productos;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Añadir extends javax.swing.JPanel {
    productoDao dao=new productoDao();
    productos producto=new productos();
    File f=null;
    String path=null;
    String fname=null;
    int s=0;
    PreparedStatement pst;
    
    
    public Añadir() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtTipo = new javax.swing.JComboBox<>();
        btnAñadir = new javax.swing.JButton();
        txtImage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(102, 102, 102));
        setPreferredSize(new java.awt.Dimension(650, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(49, 49, 49));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nuevo producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, 382, 63));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 31));

        txtName.setForeground(new java.awt.Color(204, 204, 204));
        txtName.setText("Nombre del producto");
        txtName.setBorder(null);
        txtName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNameMousePressed(evt);
            }
        });
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 170, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Stock");
        jLabel3.setToolTipText("");
        jLabel3.setPreferredSize(new java.awt.Dimension(75, 25));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, 31));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tipo");
        jLabel4.setToolTipText("");
        jLabel4.setPreferredSize(new java.awt.Dimension(175, 25));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 100, 31));

        txtStock.setForeground(new java.awt.Color(204, 204, 204));
        txtStock.setText("100");
        txtStock.setBorder(null);
        txtStock.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtStockMousePressed(evt);
            }
        });
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 170, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Imagen");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 382, 31));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Precio");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 100, 31));

        txtPrecio.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecio.setText("1250");
        txtPrecio.setBorder(null);
        txtPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrecioMousePressed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 170, 25));

        txtTipo.setForeground(new java.awt.Color(102, 102, 102));
        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Curren ", "Winner", "Olevs ", "Otros" }));
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 170, 25));

        btnAñadir.setBackground(new java.awt.Color(102, 102, 102));
        btnAñadir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadir.setText("Añadir");
        btnAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAñadirMouseExited(evt);
            }
        });
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 150, -1));

        txtImage.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtImage.setForeground(new java.awt.Color(255, 255, 255));
        txtImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txtImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtImageMouseClicked(evt);
            }
        });
        jPanel1.add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 380, 200));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 170, 6));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 170, 6));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 170, 6));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        
    }//GEN-LAST:event_txtTipoActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        dao.Guardar(path, txtName, txtPrecio, txtStock, txtTipo);
        limpiar();
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void txtImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtImageMouseClicked
        JFileChooser fileChooser=new JFileChooser();
        FileNameExtensionFilter fnwf=new FileNameExtensionFilter("PNG JPG AND JPEG", "png", "jpg", "jpeg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load=fileChooser.showOpenDialog(null);
        if(load==fileChooser.APPROVE_OPTION){
            f=fileChooser.getSelectedFile();
            path=f.getAbsolutePath();
            System.out.print(path);
            ImageIcon ii=new ImageIcon(path);
            Image img=ii.getImage().getScaledInstance(350, 200, Image.SCALE_SMOOTH);
            txtImage.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_txtImageMouseClicked

    private void btnAñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseEntered
        btnAñadir.setBackground(new Color(102,102,102));
        btnAñadir.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_btnAñadirMouseEntered

    private void btnAñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseExited
        btnAñadir.setBackground(new Color(51,51,51));
        btnAñadir.setForeground(Color.white);
    }//GEN-LAST:event_btnAñadirMouseExited

    private void txtNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMousePressed
        if( txtName.getText().equals( "Nombre del producto" ) ){
            txtName.setText("");
            txtName.setForeground( new Color( 102,102,102 ) );
        }
        if( txtPrecio.getText().isEmpty() ){
            txtPrecio.setText( "1250" );
            txtPrecio.setForeground( new Color( 204,204,204) );
        }
        if( txtStock.getText().isEmpty() ){
            txtStock.setText( "100" );
            txtStock.setForeground( new Color( 204,204,204 ) );
        }
    }//GEN-LAST:event_txtNameMousePressed

    private void txtPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioMousePressed
        if( txtPrecio.getText().equals( "1250" ) ){
            txtPrecio.setText("");
            txtPrecio.setForeground( new Color(102,102,102 ) );
        }
        if( txtName.getText().isEmpty() ){
            txtName.setText( "Nombre del producto" );
            txtName.setForeground( new Color( 204,204,204 ) );
        }
        if( txtStock.getText().isEmpty() ){
            txtStock.setText( "100" );
            txtStock.setForeground( new Color( 204,204,204 ) );
        }
    }//GEN-LAST:event_txtPrecioMousePressed

    private void txtStockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStockMousePressed
        if( txtStock.getText().equals( "100" ) ){
            txtStock.setText("");
            txtStock.setForeground( new Color(102,102,102 ) );
        }
        if( txtName.getText().isEmpty() ){
            txtName.setText( "Nombre del producto" );
            txtName.setForeground( new Color( 204,204,204 ) );
        }
        if( txtPrecio.getText().isEmpty() ){
            txtPrecio.setText( "1250" );
            txtPrecio.setForeground( new Color( 204,204,204 ) );
        }
    }//GEN-LAST:event_txtStockMousePressed
    public void limpiar(){
        this.txtName.setText("");
        this.txtPrecio.setText("");
        this.txtStock.setText("");
        this.txtImage.setIcon(null);
    } 

       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txtImage;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JComboBox<String> txtTipo;
    // End of variables declaration//GEN-END:variables
}
