public class Ejercicio3 {
    public static void main(String[] args) {

        double Temperatura_Actual;
        String Nombre_Sensor;
        int Numero_Lectura;
        boolean enAlarma;

        Temperatura_Actual = 90;
        Nombre_Sensor = "corriente";
        Numero_Lectura = 12589;
        enAlarma = false;

        if (Temperatura_Actual > 80){

        
            enAlarma = true;
            }
        System.out.println("la temperatura actual es: " + Temperatura_Actual);
        System.out.println("El nombre del sensor es: " + Nombre_Sensor);
        System.out.println("El numero de lectura es: " + Numero_Lectura);
        System.out.println("El estado del sensor es: " + enAlarma);
    }
    
}
