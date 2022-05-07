/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;


import Dao.productoDao;
import Productos.productos;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class Lista extends javax.swing.JPanel {
    DefaultTableModel modelo;
    productoDao dao=new productoDao();
    String path;
    public Lista() {
        initComponents();
        combNumParam.setVisible ( false ) ;
        ca();
    }
    public void ca(){
        try{          
        dao.cargarentabla(sql ( txtvalor.getText() ), tableProducts );
        }catch ( Exception e ) {
            JOptionPane.showMessageDialog ( null, "problemas al cargar" );
        }
    }
    public String sql(String valor){
        if( valor.equals( "" ) ){valor = "0";}
        String filter="";
        String con="";
        if(combParam.getSelectedIndex()==1){
            filter="id";
        }
        if(combParam.getSelectedIndex()==2){
            filter="nombre";
        }
        if(combParam.getSelectedIndex()==3){
            filter="precio";
        }
        if(combParam.getSelectedIndex()==4){
            filter="stock";
        }
        if(combParam.getSelectedIndex()==5){
            filter="tipo";
        }
        if(combParam.getSelectedIndex()==6){
            filter="idStatus";
        }
        if(combNumParam.getSelectedIndex()==0){
            con="=";
        }
        if(combNumParam.getSelectedIndex()==1){
            con=">";
        }
        if(combNumParam.getSelectedIndex()==2){
            con="<";
        }
        switch (combParam.getSelectedIndex()) {
            case 0:
                combNumParam.setVisible(false);
                return "SELECT *FROM productos ORDER BY id ASC";
            case 3:
            case 4:
                combNumParam.setVisible(true);
                return "SELECT * FROM productos WHERE "+filter+" "+con+" '"+valor+"' ORDER BY id ASC";
            default:
                combNumParam.setVisible(false);
                return "SELECT * FROM productos WHERE "+filter+" LIKE '%"+valor+"%' ORDER BY id ASC";
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtvalor = new javax.swing.JTextField();
        combNumParam = new javax.swing.JComboBox<>();
        combParam = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        txtImagen = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        txtType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(650, 500));
        setMinimumSize(new java.awt.Dimension(650, 500));
        setPreferredSize(new java.awt.Dimension(650, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(49, 49, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtvalor.setMaximumSize(new java.awt.Dimension(64, 0));
        txtvalor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtvalorCaretUpdate(evt);
            }
        });
        jPanel1.add(txtvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 12, 157, -1));

        combNumParam.setForeground(new java.awt.Color(102, 102, 102));
        combNumParam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Igual que ", "Mayor que ", "Menor que" }));
        combNumParam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combNumParamItemStateChanged(evt);
            }
        });
        jPanel1.add(combNumParam, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 12, -1, -1));

        combParam.setForeground(new java.awt.Color(102, 102, 102));
        combParam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Id", "Nombre", "Precio", "Stock", "Tipo", "IdStatus" }));
        combParam.setMaximumSize(new java.awt.Dimension(94, 22));
        combParam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combParamItemStateChanged(evt);
            }
        });
        combParam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combParamActionPerformed(evt);
            }
        });
        jPanel1.add(combParam, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, 163, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 440, 40));

        tableProducts.setAutoCreateRowSorter(true);
        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Precio", "Stock", "Tipo", "Id Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableProducts.setMaximumSize(new java.awt.Dimension(2147483647, 2000));
        tableProducts.setPreferredSize(new java.awt.Dimension(200, 5000));
        tableProducts.setRowHeight(30);
        tableProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableProductsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableProducts);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 440, 420));

        btnModificar.setBackground(new java.awt.Color(102, 102, 102));
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar2.png"))); // NOI18N
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificar.setMinimumSize(new java.awt.Dimension(576, 518));
        btnModificar.setPreferredSize(new java.awt.Dimension(576, 518));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 95, 34));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Lista de Productos");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 6, 279, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Id ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 41, 25));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 70, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 70, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Stock ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 70, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tipo ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 70, 25));

        txtName.setBorder(null);
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 161, 25));

        txtPrice.setBorder(null);
        jPanel2.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 161, 25));

        txtStock.setBorder(null);
        jPanel2.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 161, 25));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 95, 34));

        txtImagen.setBackground(new java.awt.Color(102, 102, 102));
        txtImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txtImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtImagenMouseClicked(evt);
            }
        });
        jPanel2.add(txtImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 250, 240));

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 32, 25));

        txtType.setForeground(new java.awt.Color(102, 102, 102));
        txtType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Curren", "Winner", "Olves", "Otros" }));
        jPanel2.add(txtType, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 161, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Estatus ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 70, 25));

        cbStatus.setForeground(new java.awt.Color(102, 102, 102));
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo", "Eliminado" }));
        jPanel2.add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, 25));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 160, 6));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 160, 6));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, 6));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtvalorCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtvalorCaretUpdate
        ca();
    }//GEN-LAST:event_txtvalorCaretUpdate

    private void tableProductsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductsMousePressed
        try{
            txtImagen.setText( "" );
            txtImagen.setIcon( null );
            int id = Integer.parseInt( String.valueOf( tableProducts.getValueAt(tableProducts.getSelectedRow(), 0 ) ) );
            productos producto=dao.cargar(id);
            txtId.setText(producto.getId());
            txtName.setText(producto.getNombre());
            txtPrice.setText(String.valueOf(producto.getPrecio()));
            txtStock.setText(producto.getStock());
            txtType.setSelectedItem(producto.getTipo());
            int a=producto.getIdStatus_producto()-1;
            cbStatus.setSelectedIndex(a);
            if( producto.getImagen() == null ){
                txtImagen.setText( "No imagen" );
            }else{
            byte[] imageData=producto.getImagen();
            ImageIcon format=new ImageIcon(imageData);
            Image mm=format.getImage();
            Image img=mm.getScaledInstance(230, 230, Image.SCALE_SMOOTH);
            ImageIcon m3= new ImageIcon(img);
            txtImagen.setIcon(m3);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"debes seleccionar un producto");
        }
    }//GEN-LAST:event_tableProductsMousePressed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            if ( txtId.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(null, "no has seleccionado un producto");
            }else{
                if(!txtName.getText().isEmpty()&&!txtPrice.getText().isEmpty()&&!txtStock.getText().isEmpty())
                {
                    productos producto=new productos();
                    producto.setId(txtId.getText());
                    producto.setNombre(txtName.getText());
                    producto.setPrecio(Double.parseDouble(txtPrice.getText()));   
                    producto.setStock(txtStock.getText());
                    producto.setTipo(txtType.getSelectedItem().toString());
                    int string=cbStatus.getSelectedIndex()+1;
                    producto.setIdStatus_producto(string);
                    dao.modificar(producto, path);
                    dao.cargarentabla(sql(""), tableProducts);
                }else{
                    JOptionPane.showMessageDialog ( null, "Todos los cuadros de texto deben tener un valor" );
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog ( null, "Uno de los valores no es valido en modificar front" );
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtImagenMouseClicked
        
        JFileChooser fileChooser=new JFileChooser();
        FileNameExtensionFilter fnwf=new FileNameExtensionFilter("PNG JPG AND JPEG", "png", "jpg", "jpeg");
        fileChooser.addChoosableFileFilter(fnwf);
        int load=fileChooser.showOpenDialog(null);
        if(load==fileChooser.APPROVE_OPTION){
            File f=fileChooser.getSelectedFile();
            path=f.getAbsolutePath();
            ImageIcon ii=new ImageIcon(path);
            Image img=ii.getImage().getScaledInstance(230, 230, Image.SCALE_SMOOTH);
            txtImagen.setIcon(new ImageIcon(img));
            txtImagen.setText( "" );
        }else{
            JOptionPane.showMessageDialog(null, "El archivo no es valido");
        }
    }//GEN-LAST:event_txtImagenMouseClicked

    private void combParamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combParamItemStateChanged
        ca();
    }//GEN-LAST:event_combParamItemStateChanged

    private void combNumParamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combNumParamItemStateChanged
        ca();
    }//GEN-LAST:event_combNumParamItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if( !txtId.getText().isEmpty() ){
        int id=Integer.parseInt ( txtId.getText() );
        dao.Eliminar ( id );
        ca();
        }else{
            JOptionPane.showMessageDialog ( null, "no has  seleccionado un producto" );}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void combParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combParamActionPerformed
        ca();
    }//GEN-LAST:event_combParamActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> combNumParam;
    private javax.swing.JComboBox<String> combParam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProducts;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtImagen;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStock;
    private javax.swing.JComboBox<String> txtType;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
