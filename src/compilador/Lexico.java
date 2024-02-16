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

    private static List<Token> listaDeTokens;
    private static List<List<Token>> listaTokens = new ArrayList<List<Token>>();

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

        imprimirContenidoArchivoTexto(listaCodigoOriginal);

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

}
