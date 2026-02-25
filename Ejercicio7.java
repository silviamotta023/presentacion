public class Ejercicio7 {
    public static void main(String[] args) {

        int[] stockAlmacen = {50, 30, 20, 15, 10};

        int[] stockReportes = stockAlmacen;

        System.out.println("Stock antes de la venta:");
        mostrarStock(stockAlmacen);

        stockReportes[0] = stockReportes[0] - 5;

        System.out.println("\nStock después de la venta:");
        mostrarStock(stockAlmacen);

    }

    public static void mostrarStock(int[] stock) {
        for (int i = 0; i < stock.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + stock[i]);
        }
    }
    
}
