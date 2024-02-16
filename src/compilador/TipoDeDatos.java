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
public class TipoDeDatos {

    private static final Map<String, String> tiposDeDatos;

    static {

        tiposDeDatos = new HashMap<>();
        tiposDeDatos.put("boolean", "boolean");
        tiposDeDatos.put("byte", "Byte");
        tiposDeDatos.put("char", "Char");
        tiposDeDatos.put("fecha", "Fecha");
        tiposDeDatos.put("decimal", "Decimal");
        tiposDeDatos.put("double", "Double");
        tiposDeDatos.put("definido", "Definido por usuario");
        tiposDeDatos.put("entero", "Entero");
        tiposDeDatos.put("long", "Long");
        tiposDeDatos.put("object", "Object");
        tiposDeDatos.put("short", "Short");
        tiposDeDatos.put("single", "Single");
        tiposDeDatos.put("string", "String");
        tiposDeDatos.put("uinteger", "UInteger");
        tiposDeDatos.put("ulong", "ULong");
        tiposDeDatos.put("ushort", "UShort");
    }
}
