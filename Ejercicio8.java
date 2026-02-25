public class Ejercicio8 {
    
     public static void main(String[] args) {

        String ultimoMensaje = "Hola";

        String copiaTexto = ultimoMensaje;

        System.out.println("Antes del cambio:");
        System.out.println("Último mensaje: " + ultimoMensaje);
        System.out.println("Copia texto: " + copiaTexto);

        copiaTexto = "¿Cómo estás?";

        System.out.println("\nDespués del cambio:");
        System.out.println("Último mensaje: " + ultimoMensaje);
        System.out.println("Copia texto: " + copiaTexto);
    }
}
