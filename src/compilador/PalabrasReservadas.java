/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compilador;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author abmon
 */
public class PalabrasReservadas {

    private static final Map<String, String> palabrasReservadas;

    static {
        palabrasReservadas = new HashMap<>();
        palabrasReservadas.put("as", "As");
        palabrasReservadas.put("boolean", "boolean");
        palabrasReservadas.put("catch", "Catch");
        palabrasReservadas.put("console", "Console");
        palabrasReservadas.put("dim", "Dim");
        palabrasReservadas.put("else", "else");
        palabrasReservadas.put("end", "End");
        palabrasReservadas.put("false", "false");
        palabrasReservadas.put("if", "If");
        palabrasReservadas.put("imports", "Imports");
        palabrasReservadas.put("io", "IO");
        palabrasReservadas.put("main", "Main");
        palabrasReservadas.put("module", "Module");
        palabrasReservadas.put("new", "New");
        palabrasReservadas.put("not", "Not");
        palabrasReservadas.put("readline", "ReadLine");
        palabrasReservadas.put("streamReader", "StreamReader");
        palabrasReservadas.put("string", "String");
        palabrasReservadas.put("sub", "Sub");
        palabrasReservadas.put("system", "System");
        palabrasReservadas.put("then", "then");
        palabrasReservadas.put("true", "true");
        palabrasReservadas.put("try", "Try");
        palabrasReservadas.put("while", "While");
        palabrasReservadas.put("writeline", "WriteLine");

    }
}
