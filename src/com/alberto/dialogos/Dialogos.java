/*
Libreria, para tratar el tema de dialogos y confirmaciones
 */
package com.alberto.dialogos;

import javax.swing.JOptionPane;

public class Dialogos {
    // Mensaje de acción simple
    public static void mensajesimple() {
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
    }
    //Mensaje de confirmacion que devuelve un int, en el que 0= si y 1=no
    //@return
    public static int mensajeconfirm() {
        return JOptionPane.showConfirmDialog(null, "¿Esta seguro?","Alerta",JOptionPane.YES_NO_OPTION);
    }

}
