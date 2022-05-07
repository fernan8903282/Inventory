

package com.mycompany.inventario;

import Inicio.Plantilla;
 

public class Inventario {

    public static void main(String[] args) {
        try {
            //setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Inventario\\src\\main\\resources\\img\\inventario.png"));
            Plantilla ventana=new Plantilla();
            ventana.setSize(850,550);
            ventana.setLocationRelativeTo(null);
            ventana.show();
        } catch (Exception e) {
            System.out.println("el problema al iniciar");
        }
    }
}
