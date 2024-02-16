/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compilador;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abmon
 */
public class Compilador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lexico lexico =  new Lexico(args);
               
       lexico.analizarPrograma(args);
    }
    
}
