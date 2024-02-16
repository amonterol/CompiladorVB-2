/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilitarios;

import java.util.HashMap;

/**
 *
 * @author abmon
 */
public class Error {

    private final HashMap<Integer, String> tiposDeErrores = new HashMap();

    public Error() {
        tiposDeErrores.put(100, "Falta el archivo con el codigo fuente.");
        tiposDeErrores.put(101, "Solo se permite un archivo con el codigo fuente.");
        tiposDeErrores.put(102, "Extensión de archivo con el codigo fuente debe ser .NET");
        tiposDeErrores.put(103, "El archivo con el codigo fuente no contiene información.");
        tiposDeErrores.put(104, "El archivo con codigo fuente no se encuentra en el directorio especificado.");
        

        tiposDeErrores.put(118, "Caracteres de inicio de comentario \"(*\"separados por espacios en blanco.");
        tiposDeErrores.put(119, "Falta el caracter \"(*\" del comando de inicio de comentario."); 
        tiposDeErrores.put(120, "Todo linea debe comenzar con un comando de LIBELULA."); //106
        tiposDeErrores.put(121, "Caracteres de comando de cierre de comentario \"*)\" aparecen separados por espacios en blanco."); 
        tiposDeErrores.put(122, "Línea de código supera los 90 caracteres."); 

        tiposDeErrores.put(131, "Cualquier comando Import debe aparecer antes que el comando Module."); 
        tiposDeErrores.put(132, "Cualquier comando Import debe aparecer antes cualquier otro comando."); 
        tiposDeErrores.put(133, "Comando Import debe estar seguido de una palabra reservada válida.");
        tiposDeErrores.put(134, "Comando Import solo debe tener un argumento."); 
        tiposDeErrores.put(135, "Comando Import solo como argumento una palabra reservada o dos palabras reservas unidas con el operador PUNTO."); 
        tiposDeErrores.put(136, "Falta una palabra reservada despues del operador PUNTO."); 

        tiposDeErrores.put(141, "El comanto Module debe contener un nombre de programa como argumento.");
        tiposDeErrores.put(142, "El comanto Module solo debe tener un nombre de programa como argumento.");
        tiposDeErrores.put(143, "El comanto Module debe anteceder cualquier otro comando excepto Imports.");
        tiposDeErrores.put(144, "Comando Module no fue incluido en el código.");

        //Comando Dim
        tiposDeErrores.put(150, "Comando Dim requiere de la declaración de una variable.");
        tiposDeErrores.put(151, "El argumento del comando Dim debe ser un Identificador válido");
        tiposDeErrores.put(152, "En comando Dim luego del Identificador válido requiere la palabra reservada As y el tipo de dato de la variable");
        tiposDeErrores.put(153, "En comando Dim el comando As require como argumento un tipo de dato");
        tiposDeErrores.put(154, "En comando Dim el comando As require un solo tipo de datos");
        tiposDeErrores.put(155, "Las declaraciones de variables solo pueden ubicarse dentro de bloque Module");
        tiposDeErrores.put(156, "No se permite declaraciones de variables antes de comando Imports");

        //Comando Sub
        tiposDeErrores.put(160, "El argumento del comando Sub debe ser un Identificador de procedimiento válido o Main");
        tiposDeErrores.put(161, "La declaracion de un procedimiento deben ubicarse dentro de bloque Module");
        tiposDeErrores.put(162, "No se permiten declarar procedimientos antes de comando Imports");
        tiposDeErrores.put(163, "Toda declaración de un procedimientos debe terminar con los comandos End Sub");

        tiposDeErrores.put(164, "Faltan el paréntesis derecho y el parentesis izquierdo.");
        tiposDeErrores.put(165, "Falta parentesis izquierdo");
        tiposDeErrores.put(166, "Falta parentesis derecho");

        tiposDeErrores.put(500, "El programa no cumple con la estructura Module nombre de programa y End Module.");

    }

    public String obtenerDescripcionDelError(Integer key) {
        return tiposDeErrores.get(key);
    }
}
