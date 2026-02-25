public class Ejercicio12 {
    public static void main(String[] args) {

        double[] ventas = {150.50, 320.75, 89.99, 450.00, 210.30, 99.50, 500.00};

        double ventaMayor = ventas[0];
        double ventaMenor = ventas[0];
        double total = 0;

        for (int i = 0; i < ventas.length; i++) {

            total += ventas[i];

            if (ventas[i] > ventaMayor) {
                ventaMayor = ventas[i];
            }

            if (ventas[i] < ventaMenor) {
                ventaMenor = ventas[i];
            }
        }

        System.out.println("Venta más alta: $" + ventaMayor);
        System.out.println("Venta más baja: $" + ventaMenor);
        System.out.println("Total del día: $" + total);
    }
    
}
