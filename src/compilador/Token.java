/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compilador;

/**
 *
 * @author abmon
 */
public class Token {

    final TipoToken tipoToken;
    final String lexema;
    final String literal;
    final int numeroLinea;

    Token(TipoToken tipo, String lexema, String literal, int linea) {
        this.tipoToken = tipo;
        this.lexema = lexema;
        this.literal = literal;
        this.numeroLinea = linea;
    }

    @Override
    public String toString() {
        return tipoToken + " " + lexema + " " + literal + " " + numeroLinea;
    }
}
