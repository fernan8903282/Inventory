/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package paneles;

import Dao.entradaDao;
import Dao.productoDao;
import Productos.Entradap;
import Productos.productos;
import java.awt.Image;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ListVent extends javax.swing.JPanel {
    entradaDao dao  = new entradaDao();
    productoDao pDao  = new productoDao();
    public ListVent() {
        initComponents();
        txtDate.setVisible( false );
        Calendar fechaactual = new GregorianCalendar();
        txtDate.setCalendar( fechaactual );
        combNumParam.setVisible( false );
        d();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVentas = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        combParam = new javax.swing.JComboBox<>();
        lblimagen = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        combNumParam = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtCost = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        cbStatus = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        txtIdVenta = new javax.swing.JTextField();
        lblidventa = new javax.swing.JLabel();
        cbstatus = new javax.swing.JComboBox<>();
        panelbusq = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtDate = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableVentas.setAutoCreateRowSorter(true);
        tableVentas.setForeground(new java.awt.Color(49, 49, 49));
        tableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id de Venta", "Fecha", "Id productos", "Productos", "Cantidad", "Total"
            }
        ));
        tableVentas.setVerifyInputWhenFocusTarget(false);
        tableVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableVentasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableVentas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 70, 490, 400));

        btnEdit.setBackground(new java.awt.Color(102, 102, 102));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar2.png"))); // NOI18N
        btnEdit.setText("Editar");
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 100, 40));

        combParam.setBackground(new java.awt.Color(102, 102, 102));
        combParam.setForeground(new java.awt.Color(255, 255, 255));
        combParam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Id de Entrada", "Fecha", "Total", "Id producto", "cantidad", "Estatus" }));
        combParam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combParamItemStateChanged(evt);
            }
        });
        jPanel1.add(combParam, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 32, 170, 32));

        lblimagen.setBackground(new java.awt.Color(102, 102, 102));
        lblimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.add(lblimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 210, 200));

        txtvalor.setBorder(null);
        txtvalor.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtvalorCaretUpdate(evt);
            }
        });
        jPanel1.add(txtvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 156, 32));

        combNumParam.setBackground(new java.awt.Color(102, 102, 102));
        combNumParam.setForeground(new java.awt.Color(255, 255, 255));
        combNumParam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayor o igual que ", "Menor o igual que" }));
        combNumParam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combNumParamItemStateChanged(evt);
            }
        });
        jPanel1.add(combNumParam, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 32, -1, 32));

        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.setBorder(null);
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 100, 25));

        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setBorder(null);
        txtId.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtIdCaretUpdate(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 100, 25));

        txtCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCost.setBorder(null);
        jPanel1.add(txtCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 100, 25));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cantidad productos ");
        jButton1.setBorder(null);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 100, 25));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Id Producto");
        jButton2.setBorder(null);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 100, 25));

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Costo unitario");
        jButton3.setBorder(null);
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 100, 25));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Id Venta");
        jButton4.setBorder(null);
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 82, 30));

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Total");
        jButton5.setBorder(null);
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 80, 30));

        lblid.setBackground(java.awt.Color.gray);
        lblid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 82, 30));

        lblTotal.setBackground(java.awt.Color.gray);
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 80, 30));

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Ventas");
        jButton6.setBorder(null);
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 250, 20));

        btnEliminar.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar2.png"))); // NOI18N
        btnEliminar.setText("Borrar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, 40));

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Estatus");
        jButton8.setBorder(null);
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 100, 25));

        cbStatus.setBackground(new java.awt.Color(102, 102, 102));
        cbStatus.setForeground(new java.awt.Color(255, 255, 255));
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "Completado", "En processo", "Cancelado" }));
        jPanel1.add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 100, 25));

        jButton9.setBackground(new java.awt.Color(102, 102, 102));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Total");
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, 30));

        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 148, 30));

        jButton10.setBackground(new java.awt.Color(102, 102, 102));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Id Venta");
        jButton10.setBorder(null);
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 100, 25));

        txtIdVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdVenta.setBorder(null);
        jPanel1.add(txtIdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 100, 25));
        jPanel1.add(lblidventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 20, 20));

        cbstatus.setBackground(new java.awt.Color(102, 102, 102));
        cbstatus.setForeground(new java.awt.Color(255, 255, 255));
        cbstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Completado", "En proceso", "Cancelado" }));
        cbstatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbstatusItemStateChanged(evt);
            }
        });
        jPanel1.add(cbstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 32, 130, 32));

        panelbusq.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelbusqLayout = new javax.swing.GroupLayout(panelbusq);
        panelbusq.setLayout(panelbusqLayout);
        panelbusqLayout.setHorizontalGroup(
            panelbusqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
        );
        panelbusqLayout.setVerticalGroup(
            panelbusqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(panelbusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 156, 3));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 155, 100, 1));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 100, 6));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 100, 6));

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, 6));

        txtDate.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 32, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void b(){
        combNumParam.setVisible(false);
        String c = dao.cargart( sql( txtvalor.getText() ), tableVentas, "venta" );
        txtTotal.setText(c);
    }
    private void d(){
        combParam.setSelectedIndex(0);
        combNumParam.setVisible(false);
        String c = dao.cargart ( sql ( txtvalor.getText() ), tableVentas, "venta" ) ;
        txtTotal.setText ( c ) ;
    }
    private void c(){
        try{
            if( combParam.getSelectedIndex() == 4 || combParam.getSelectedIndex() == 5 ){
                String s = dao.cargarDettabla(sql( txtvalor.getText() ), tableVentas, "venta" );
                txtTotal.setText ( s ) ;
            }else{
                String c = dao.cargartabla ( sql ( txtvalor.getText() ), tableVentas, "venta" );
                txtTotal.setText ( c ) ;
        }}catch( Exception e ){
            System.out.println ( "no es corecto" ) ;
        }
    }
    private void combNumParamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combNumParamItemStateChanged
        c();
    }//GEN-LAST:event_combNumParamItemStateChanged

    private void txtvalorCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtvalorCaretUpdate
        c();
    }//GEN-LAST:event_txtvalorCaretUpdate

    private void combParamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combParamItemStateChanged
        if(combParam.getSelectedIndex()==0){b();}else{
        c();}
    }//GEN-LAST:event_combParamItemStateChanged

    private void tableVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVentasMousePressed
        limpiar();
        String p = ( String) tableVentas.getValueAt( tableVentas.getSelectedRow(), 1);
        String s = ( String) tableVentas.getValueAt( tableVentas.getSelectedRow(), 2);
        if( "".equals( s )&&p.equals( "" ) ){
            limpiar(); 
        }else if("".equals( s )){
            Entradap t = dao.cargar(Integer.parseInt(( String) tableVentas.getValueAt( tableVentas.getSelectedRow(), 0)), "venta" );
            lblid.setText( t.getId());
            lblTotal.setText( String.valueOf( t.getTotal()));
            cbStatus.setSelectedIndex( Integer.parseInt( t.getIdStatus()));
        }else{
            int id =( Integer.parseInt(( String) tableVentas.getValueAt(tableVentas.getSelectedRow(), 1)));
            Entradap entrada = dao.cargarDetalles( id, "venta" );
                lblidventa.setText(String.valueOf(id));
                txtId.setText( entrada.getId_Det_producto() );
                txtCantidad.setText( String.valueOf( entrada.getCantidad()) );
                txtCost.setText( String.valueOf( entrada.getCosto()) );
                txtIdVenta.setText( entrada.getId_rel() );
            Entradap t = dao.cargar( Integer.parseInt( entrada.getId_rel()), "venta" );
                lblid.setText( t.getId() );
                lblTotal.setText( String.valueOf( t.getTotal()) );
                cbStatus.setSelectedIndex( Integer.parseInt( t.getIdStatus()) );
            productos producto=pDao.cargar( Integer.parseInt( entrada.getId_Det_producto()) );
            if(producto.getImagen() == null){
                lblimagen.setIcon(null);
            }else{ 
                Image img = new ImageIcon(producto.getImagen()).getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
                ImageIcon m3 = new ImageIcon(img); 
                lblimagen.setIcon(m3);
            }
        }
    }//GEN-LAST:event_tableVentasMousePressed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String p = txtIdVenta.getText();
        String s = lblid.getText(); 
        if( "".equals(p)&&s.equals( "")&&lblimagen.getIcon() == null){
            JOptionPane.showMessageDialog(null, "No tienes nada seleccionado");
        }else if( "".equals(p)&&lblimagen.getIcon() == null){
            dao.modificar( cbStatus.getSelectedIndex(), Integer.parseInt(lblid.getText()), "venta" );
            d();
        }else{
            Entradap t = new Entradap(); 
                t.setId_rel( txtIdVenta.getText());
                t.setCosto( Double.parseDouble(txtCost.getText()));
                t.setCantidad( Integer.valueOf(txtCantidad.getText()));
                t.setId_Det_producto(  txtId.getText());
                t.setId_Det(lblidventa.getText());
            dao.modificarDetalles( t, "venta" );
            dao.modificar( cbStatus.getSelectedIndex(), Integer.parseInt(lblid.getText()), "venta" );
            d();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id_detalles = Integer.parseInt((String) tableVentas.getValueAt(tableVentas.getSelectedRow(), 1));
        if( lblid.getText().equals("")&&lblimagen.getIcon() == null ){
            JOptionPane.showMessageDialog( null, "No tienes nada seleccionado" );
        }else if( lblimagen.getIcon() == null&&txtIdVenta.getText().equals("") ){
            JOptionPane.showMessageDialog( null, "No puedes borrar una venta" );
        }else{
            int s = JOptionPane.showConfirmDialog(null, "¿Deseas eliminar los detalles seleccionados?");
            if(s == 0){
                //stock
                Entradap t = dao.cargarDetalles(  Integer.parseInt(lblidventa.getText()), "venta" );
                pDao.ModificarStock(Integer.parseInt((String) tableVentas.getValueAt( tableVentas.getSelectedRow(), 2))
                , t.getCantidad(), 1);
                dao.EliminarDetalles( Integer.parseInt((lblidventa.getText())), "venta" );
                d(); 
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIdCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtIdCaretUpdate
        if( txtId.getText().equals( "") ){
        }else{
            productos producto=pDao.cargar( Integer.parseInt( txtId.getText() ) );
            if( producto.getImagen() == null ){
                lblimagen.setIcon( null );
            }else{
            Image img=new ImageIcon( producto.getImagen()).getImage().getScaledInstance( 180, 180, Image.SCALE_SMOOTH );
            ImageIcon m3=new ImageIcon( img ); 
            lblimagen.setIcon( m3 );
            }
        }
    }//GEN-LAST:event_txtIdCaretUpdate

    private void cbstatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbstatusItemStateChanged
        c();
    }//GEN-LAST:event_cbstatusItemStateChanged
    public String sql(String valor){
        if( valor.equals( "" ) ){valor = "0";}
        String con = "";
        String cb = "";
        switch (cbstatus.getSelectedIndex()) {
            case 0:
                cb = "1";
                break;
            case 1:
                cb = "2";
                break;
            default:
                cb = "3";
                break;
        }
        if( combNumParam.getSelectedIndex() == 0 ){
            con = ">=";
        }
        if( combNumParam.getSelectedIndex() == 1 ){
            con = "<=";
        }
        combNumParam.setVisible(false);
        cbstatus.setVisible(false);
        txtDate.setVisible(false);
        txtvalor.setVisible(true);
        panelbusq.setVisible(true);
        
        switch ( combParam.getSelectedIndex() ) {
            case 0:
                return "SELECT * FROM venta";
            case 1:
                return "SELECT * FROM venta WHERE id LIKE '%"+valor+"%'";
            case 2:
                txtvalor.setVisible(false);
                combNumParam.setVisible( true ); 
                txtDate.setVisible(true);
                panelbusq.setVisible(false);
                return "SELECT * FROM venta WHERE fecha "+con+" '"+((JTextField)txtDate.getDateEditor().getUiComponent()).getText()+"'";
            case 3:
                combNumParam.setVisible( true ); 
                return "SELECT * FROM venta WHERE total "+con+" '"+valor+"'";
            case 4:
                return "SELECT * FROM detventa WHERE id_producto LIKE '%"+valor+"%'";
            case 5:
                combNumParam.setVisible( true ); 
                return "SELECT * FROM detventa WHERE cantidad "+con+" '"+valor+"'";
            default: 
                cbstatus.setVisible(true);
                return "SELECT * FROM entrada Where idStatus = '"+cb+"'";
        }
    }
    private void limpiar(){ 
        txtId.setText( "" );
        txtCantidad.setText( "" );
        txtCost.setText( "" );
        lblimagen.setIcon( null );
        lblid.setText( "" );
        lblTotal.setText( "" );
        cbStatus.setSelectedIndex(0);
        txtIdVenta.setText( "" );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbstatus;
    private javax.swing.JComboBox<String> combNumParam;
    private javax.swing.JComboBox<String> combParam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblidventa;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JPanel panelbusq;
    private javax.swing.JTable tableVentas;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCost;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdVenta;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
