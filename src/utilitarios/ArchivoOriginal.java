/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilitarios;

import javax.swing.JOptionPane;
import utilitarios.Error;

/**
 *
 * @author abmon
 */
public class ArchivoOriginal {

    private String[] archivoAdjunto = null;
    final Error errores;

    public ArchivoOriginal(String[] args) {
        this.archivoAdjunto = args;
        this.errores = new Error();

    }

    public int validarExistenciaArchivoInicial() {

        switch (this.archivoAdjunto.length) {
            case 0:
                JOptionPane.showMessageDialog(null, errores.obtenerDescripcionDelError(100), "Falta archivo", JOptionPane.WARNING_MESSAGE);
                System.out.println(errores.obtenerDescripcionDelError(100));
                return 0;
            //System.exit(0);
            case 1:
                System.out.println(" BORRAR: Este es el archivo " + archivoAdjunto[0].toUpperCase());
                return 1;
            default:
                JOptionPane.showMessageDialog(null, errores.obtenerDescripcionDelError(101), "Cantidad Archivos", JOptionPane.WARNING_MESSAGE);
                System.out.println(errores.obtenerDescripcionDelError(101));
                // System.exit(0);
                return -1;
        }
    }

    //Valida si se adjunta un único archivo con código fuente al programa
    public boolean validarExtensionArchivoInicial() {
        if (!archivoAdjunto[0].endsWith(".VB")) {
            JOptionPane.showMessageDialog(null, errores.obtenerDescripcionDelError(102), "Extension archivo", JOptionPane.WARNING_MESSAGE);
            System.out.println(errores.obtenerDescripcionDelError(102));
            System.exit(0);

        }
        return true;

    }

}
