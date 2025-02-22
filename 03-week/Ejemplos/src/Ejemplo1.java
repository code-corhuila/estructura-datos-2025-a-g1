public class Ejemplo1 {
    public static void main(String arg[]){
        System.out.println("Primer mensaje.");

        Double x;
        Double y;

        x = 10.0;
        y = 2*x;
        System.out.println(y);

        x = 12.0;
        y = 2*x;
        System.out.println(y);

        x = 15.0;
        y = 2*x;
        System.out.print(y);

        System.out.printf("\nProceso dos.\n");
        //here code...
        Double resul;
        resul = Calcular(10.0,2.0);
        System.out.println(resul);

        resul = Calcular(12.0,2.0);
        System.out.println(resul);

    }

    public static Double Calcular(Double x, Double y){
        Double resultado = 0.0;
        resultado = x*y;
        return resultado;
    }
}
