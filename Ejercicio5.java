public class Ejercicio5 {
    public static void main(String[] args) {

        double tazas;
        double mililitros;
        double litros;

        tazas = 2.5;

        mililitros = tazas * 236.588;
        litros = mililitros / 1000;

        System.out.println("=== Conversor de Unidades ===");
        System.out.println("Tazas: " + tazas);
        System.out.println("Mililitros: " + mililitros + " ml");
        System.out.println("Litros: " + litros + " L");
    }

    
}
