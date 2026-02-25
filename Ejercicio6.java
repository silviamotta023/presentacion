public class Ejercicio6 {
    public static void main(String[] args) {

        int turnoActual = 25;

        int turnoEnPantalla = turnoActual;

        System.out.println("Antes del cambio:");
        System.out.println("Turno actual: " + turnoActual);
        System.out.println("Turno en pantalla: " + turnoEnPantalla);

        turnoEnPantalla = 30;

        System.out.println("\nDespués del cambio:");
        System.out.println("Turno actual: " + turnoActual);
        System.out.println("Turno en pantalla: " + turnoEnPantalla);

    }
    
}
