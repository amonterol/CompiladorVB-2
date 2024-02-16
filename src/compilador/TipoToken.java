/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package compilador;

/**
 *
 * @author abmon
 */
public enum TipoToken {
        
        //Literales
        IDENTIFICADOR,    
        PALABRA_RESERVADA,   
        STRING,
        NUMERO_ENTERO,
        NUMERO_REAL,
     
        
        //Operadores 
        MULTIPLICACION,
        DIVISION,
        SUMA,
        RESTA,
        
        //Operadores relacionales
        MENOR_QUE,
        MENOR_O_IGUAL_QUE,
        MAYOR_QUE,
        MAYOR_O_IGUAL_QUE,
        IGUAL,
        DIFERENTE,
       
        //Agrupación
        PARENTESIS_IZQUIERDO,
        PARENTESIS_DERECHO,
        LLAVE_IZQUIERDO,
        LLAVE_DERECHO,
        
        //Otros
        DECLARACION_DE_TIPO,
        ASIGNACION,
        LINEA_EN_BLANCO,
        COMENTARIO,
        COMA,
        PUNTO,
        DESCONOCIDO
}
