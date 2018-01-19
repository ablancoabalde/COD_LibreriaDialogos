/*
Libreria, para tratar el tema de dialogos y confirmaciones
 */
package com.alberto.dialogos;

import javax.swing.JOptionPane;

public class Dialogos {
    // Mensaje de acción simple
    public static void mensajesimple(String cadena) {
        JOptionPane.showMessageDialog(null, cadena);
    }
    //Mensaje de confirmacion que devuelve un int, en el que 0= si y 1=no
    //@return int
    public static int mensajeconfirm(String cadena) {
        return JOptionPane.showConfirmDialog(null, cadena,"Alerta",JOptionPane.YES_NO_OPTION);
    }

}
