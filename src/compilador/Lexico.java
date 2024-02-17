/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compilador;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import utilitarios.ArchivoOriginal;

/**
 *
 * @author abmon
 */
public class Lexico {

    private String[] args = null;

    private static String rutaCodigoFuente = "C:\\Users\\abmon\\Desktop\\";

    private static String archivoAdjunto = "";
    private static String archivoConCodigoFuente = "";

    private static List<String> listaCodigoOriginal = new ArrayList<>();

    private static List<String> listaCodigoAnalizado;
    private utilitarios.Error errores = new utilitarios.Error();

    private static List<Token> tokensEnUnaLineaDeCodigo;
    private static List<List<Token>> listaDeTokens = new ArrayList<List<Token>>();

    public static String nombreDePrograma = " ";
    public static boolean nombreDeProgramaEsIdentificadorValido = true;

    public static boolean comandoDeVisualBasicEncontrado = false;
    public static int lineasConComandosVisualBasicEncontradas = 0;

    public static boolean comandoMODULE = false;
    public static int lineasConComandoMODULE = 0;

    public static boolean comandoEND_MODULE = false;
    public static int lineasConComandoEND_MODULE = 0;

    public static boolean comandoSUB = false;
    public static int lineasConComandoEND_SUB = 0;

    public Lexico(String[] args) {
        this.args = args;
    }

    public boolean analisisArchivoOriginal() {
        ArchivoOriginal archivoOriginal = new ArchivoOriginal(this.args);
        return false;
    }

    public void analizarPrograma(String[] args) {
        ArchivoOriginal archivoOriginal = new ArchivoOriginal(args);
        //Almacena el numero de linea actual que se esta leyendo.
        int numeroDeLineaActual = 1;

        //Valida si se adjunta un único archivo con código fuente al programa
        int existeArchivoOriginal = archivoOriginal.validarExistenciaArchivoInicial();

        //Valida que la extensión del archivo sea .vb
        if (existeArchivoOriginal == 1) {
            boolean existeArchivoConExtensionVB = archivoOriginal.validarExtensionArchivoInicial();
            //Determina la ruta del archivo con el código fuente y lee el archivo
            if (existeArchivoConExtensionVB) {
                try {
                    listaCodigoOriginal = leerContenidoArchivoTexto(rutaCodigoFuente, args);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, errores.obtenerDescripcionDelError(104), "Ruta incorrecta", JOptionPane.WARNING_MESSAGE);
                    //Logger.getLogger(Lexico.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        imprimirContenidoArchivoTexto(listaCodigoOriginal); //BORRAR

         try {

            if (!listaCodigoOriginal.isEmpty()) {
                //System.out.println("\n1.- codigo fuente no esta vacio"); //BORRAR

                //System.out.println("\n1.- INICIO codigo fuente"); //BORRAR
                imprimirContenidoArchivoTexto(listaCodigoOriginal); //BORRAR
                //System.out.println("\n1.- FIN codigo fuente"); //BORRAR

                for (String lineaDeCodigo : listaCodigoOriginal) {

                    //System.out.println("\n2.- INICIO LINEA DE CODIGO"); //BORRAR
                    //System.out.println(lineaDeCodigo); //BORRAR
                    //System.out.println("\n2.- FIN LINEA DE CODIGO"); //BORRAR
                    tokensEnUnaLineaDeCodigo = new ArrayList<>();
                    if (lineaDeCodigo.isBlank() || lineaDeCodigo.isEmpty()) {
                        System.out.println("\n3.- ES UN NUEVA LINEA DE CODIGO ESTA EN BLANCO " + lineaDeCodigo); //BORRAR
                        //agregarNuevoToken("Linea en blanco", Lexico.TipoDeToken.LINEA_EN_BLANCO.toString(), null, numeroDeLineaActual);
                        agregarNuevoTokenATokensEnUnaLinea(TipoDeToken.LINEA_EN_BLANCO,"linea en blanco","linea en blanco", numeroDeLineaActual);
                        listaDeTokens.add(tokensEnUnaLineaDeCodigo);
                    } else {
                        // System.out.println("\n4.-.- BORRAR> INICIO LINEA DE CODIGO CONVERTIDA A CARACTERES  " + lineaDeCodigo);
                        char[] arregloCaracteres = lineaDeCodigo.toCharArray();
                        // iterar sobre la array `char[]` usando for-loop mejorado
                        for (char ch : arregloCaracteres) {
                            System.out.print(ch);
                            System.out.print(" ");
                        }
                        System.out.println(" ");

                    }
                    ++numeroDeLineaActual; //Aumenta con cada linea que es analizada
                }
            }
        } catch (NullPointerException ex) {
            System.out.println("No hay lineas que leer en el archivo de codigo fuente" + ex);
        }
        
       

    }

    //Lee el archivo con código fuente y convierte cada linea en una entrada de una lista.
    public List leerContenidoArchivoTexto(String path, String[] args) throws IOException {

        archivoConCodigoFuente = path + args[0];

        List<String> contenido = new ArrayList<>();
        if (!path.isEmpty()) {
            Stream<String> stream = Files.lines(Paths.get(archivoConCodigoFuente));
            contenido = stream
                    .collect(Collectors.toList());
        } else {
            JOptionPane.showMessageDialog(null, "El programa fuente proporcionado + "
                    + " no esta en el directorio C:\\Users\\abmon\\Desktop\\",
                    "Falta archivo", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        return contenido;
    }

    //Imprime el contenido de la lista con las líneas de código
    public static void imprimirContenidoArchivoTexto(List listaDeLineas) {
        System.out.println("BORRAR - ESTA ES LA LISTA DEL CONTENIDO DEL ARCHIVO" + "\n");

        listaDeLineas.forEach(linea -> {
            System.out.println(linea);
        });

    }

   public static void agregarNuevoTokenATokensEnUnaLinea(TipoDeToken tipoDeToken, String lexema, String literal, int numeroLinea) {
        Token nuevoToken = new Token(tipoDeToken, lexema, literal, numeroLinea);

        tokensEnUnaLineaDeCodigo.add(nuevoToken);
    }

   
   
    
}
