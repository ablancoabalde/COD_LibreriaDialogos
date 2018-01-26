/**
Libreria, para tratar el tema de dialogos y confirmaciones
 */
package com.alberto.dialogos;

import javax.swing.JOptionPane;

public class Dialogos {

   
    /**
     *  Mensaje de acción simple
     * @param cadenaTexto Variable que recibe un mensaje de tipo String y lo implementa al JOptionPane
     */
    public static void mensajesimple(String cadenaTexto) {
        JOptionPane.showMessageDialog(null, cadenaTexto);
    }


    /**
     * Mensaje de confirmacion que devuelve un int, en el que 0= si y 1=no
     * @param cadenaTexto Variable que recibe un mensaje de tipo String y lo implementa al JOptionPane
     * @return Un entero con los valores 0 o 1
     */
    public static int mensajeconfirm(String cadenaTexto) {
        return JOptionPane.showConfirmDialog(null, cadenaTexto, null, JOptionPane.YES_NO_OPTION);
    }
    
    /**
     * Introducimos por pantalla un dato y lo muestra por pantalla
     * @param cadenaTexto Variable que recibe un mensaje de tipo String y lo implementa al JOptionPane
     */
    public static void introducirdatos(String cadenaTexto) {
        String respuesta=JOptionPane.showInputDialog(cadenaTexto);
        JOptionPane.showMessageDialog(null, respuesta);

    }

}
