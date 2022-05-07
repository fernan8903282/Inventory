/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;


import java.awt.Color;
import paneles.Lista;
import paneles.ListVent;
import paneles.Añadir;
import paneles.Entrada;
import paneles.ListEnt;
import paneles.Venta;


public class Plantilla extends javax.swing.JFrame {
    int mouseX, mouseY;
    Inicio inicio;
    Añadir añadir;
    Venta venta;
    Entrada entrada;
    Lista lista;
    ListVent listvent;
    ListEnt listent;
    
    
    public Plantilla() {
        initComponents();
        
        inicio= new   Inicio();
        añadir= new   Añadir();
        venta=new     Venta();
        entrada=new   Entrada();
        lista=new     Lista();
        listvent= new ListVent();
        listent= new  ListEnt();
        
        inicio.setBounds  (150, 25, 700, 525);
        añadir.setBounds  (150, 25, 700, 525);
        venta.setBounds   (150, 25, 700, 525);
        entrada.setBounds (150, 25, 700, 525);
        lista.setBounds   (150, 25, 700, 525);
        listvent.setBounds(150, 25, 700, 525);
        listent.setBounds (150, 25, 700, 525);
        
        add(inicio);
        add(añadir);
        add(venta);
        add(entrada);
        add(lista);
        add(listvent);
        add(listent);
        
        añadir.setVisible(false);
        venta.setVisible(false);
        inicio.setVisible(true);
        entrada.setVisible(false); 
        lista.setVisible(false);
        listvent.setVisible(false);       
        listent.setVisible(false);       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button3 = new java.awt.Button();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        cbList = new javax.swing.JComboBox<>();
        btnVenta = new javax.swing.JButton();
        btnEntrada = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnX = new javax.swing.JButton();
        btnMinimizate = new javax.swing.JButton();

        button3.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(850, 500));

        panel1.setBackground(new java.awt.Color(49, 49, 49));
        panel1.setPreferredSize(new java.awt.Dimension(150, 530));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoinventario.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 130));

        cbList.setBackground(new java.awt.Color(49, 49, 49));
        cbList.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cbList.setForeground(new java.awt.Color(255, 255, 255));
        cbList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Lista de productos", "Lista de ventas", "Lista de entradas" }));
        cbList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        cbList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbListItemStateChanged(evt);
            }
        });
        panel1.add(cbList, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 130, 36));

        btnVenta.setBackground(new java.awt.Color(49, 49, 49));
        btnVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnVenta.setText("Nueva venta");
        btnVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVentaMousePressed(evt);
            }
        });
        panel1.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, 35));

        btnEntrada.setBackground(new java.awt.Color(51, 51, 51));
        btnEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrada.setText("Nueva entrada");
        btnEntrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntradaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntradaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntradaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEntradaMousePressed(evt);
            }
        });
        panel1.add(btnEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, 35));

        btnProducto.setBackground(new java.awt.Color(51, 51, 51));
        btnProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnProducto.setText("Nuevo producto");
        btnProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProductoMousePressed(evt);
            }
        });
        panel1.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 130, 35));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnX.setBackground(new java.awt.Color(224, 224, 224));
        btnX.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnX.setText("x");
        btnX.setBorder(null);
        btnX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnX.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnX.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnXMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXMousePressed(evt);
            }
        });
        jPanel1.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 30, 25));

        btnMinimizate.setBackground(new java.awt.Color(224, 224, 224));
        btnMinimizate.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMinimizate.setText("-");
        btnMinimizate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 224, 224)));
        btnMinimizate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizate.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMinimizate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizateMouseExited(evt);
            }
        });
        jPanel1.add(btnMinimizate, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(700, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 528, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen() - mouseX;
        int y = evt.getYOnScreen() - mouseY;
        this.setLocation( x, y );
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btnXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseEntered
        btnX.setBackground( Color.black );
        btnX.setForeground( new Color( 224,224,224 ) );
    }//GEN-LAST:event_btnXMouseEntered

    private void btnXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseExited
        btnX.setBackground( new Color( 224,224,224 ) );
        btnX.setForeground(Color.black);
    }//GEN-LAST:event_btnXMouseExited

    private void btnXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnXMouseClicked

    private void btnProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductoMouseExited
        btnProducto.setBackground(new Color(49,49,49));
        btnProducto.setForeground(Color.white);
    }//GEN-LAST:event_btnProductoMouseExited

    private void btnProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductoMouseEntered
        btnProducto.setBackground(new Color(204,204,204));
        btnProducto.setForeground(new Color(49,49,49));
    }//GEN-LAST:event_btnProductoMouseEntered

    private void btnEntradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseExited
        btnEntrada.setBackground(new Color(49,49,49));
        btnEntrada.setForeground(Color.white);
    }//GEN-LAST:event_btnEntradaMouseExited

    private void btnEntradaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseEntered
        btnEntrada.setBackground(new Color(204,204,204));
        btnEntrada.setForeground(new Color(49,49,49));
    }//GEN-LAST:event_btnEntradaMouseEntered

    private void btnVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseExited
        btnVenta.setBackground(new Color(49,49,49));
        btnVenta.setForeground(Color.white);
    }//GEN-LAST:event_btnVentaMouseExited

    private void btnVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseEntered
        btnVenta.setBackground(new Color(204,204,204));
        btnVenta.setForeground(new Color(49,49,49));
    }//GEN-LAST:event_btnVentaMouseEntered

    private void cbListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbListItemStateChanged
        es();
    }//GEN-LAST:event_cbListItemStateChanged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        ac();
        inicio.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnMinimizateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizateMouseClicked
        this.setExtendedState( 1 );
    }//GEN-LAST:event_btnMinimizateMouseClicked

    private void btnMinimizateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizateMouseEntered
        btnMinimizate.setBackground( Color.black );
        btnMinimizate.setForeground( new Color( 224,224,224 ) );
    }//GEN-LAST:event_btnMinimizateMouseEntered

    private void btnMinimizateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizateMouseExited
        btnMinimizate.setBackground( new Color( 224,224,224 ) );
        btnMinimizate.setForeground(Color.black);
    }//GEN-LAST:event_btnMinimizateMouseExited

    private void btnEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMouseClicked
        ac();
        cbList.setSelectedIndex( 0 );
        entrada.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnEntradaMouseClicked

    private void btnEntradaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntradaMousePressed
        ac();
        cbList.setSelectedIndex( 0 );
        entrada.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnEntradaMousePressed

    private void btnProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductoMouseClicked
        ac();
        cbList.setSelectedIndex( 0 );
        añadir.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnProductoMouseClicked

    private void btnProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductoMousePressed
        ac();
        cbList.setSelectedIndex( 0 );
        añadir.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnProductoMousePressed

    private void btnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMouseClicked
        ac();
        cbList.setSelectedIndex( 0 );
        venta.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnVentaMouseClicked

    private void btnVentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentaMousePressed
        ac();
        cbList.setSelectedIndex( 0 );
        venta.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btnVentaMousePressed

    private void btnXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnXMousePressed
    private void ac(){
        inicio.setVisible(false);
        añadir.setVisible(false);
        venta.setVisible(false);
        entrada.setVisible(false);
        listent.setVisible(false);
        lista.setVisible(false);
        listvent.setVisible(false);
    }
    private void es(){
        ac();
        switch (cbList.getSelectedIndex()) {
            case 0:
                inicio.setVisible(true);
                revalidate();
                repaint();
                break;
            case 1:
                lista.setVisible(true);
                revalidate();
                repaint();
                break;
            case 2:
                listvent.setVisible(true);
                revalidate();
                repaint();
                break;
            default:
                listent.setVisible(true);
                revalidate();
                repaint();
                break;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Plantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plantilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnMinimizate;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnVenta;
    private javax.swing.JButton btnX;
    private java.awt.Button button3;
    private javax.swing.JComboBox<String> cbList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
