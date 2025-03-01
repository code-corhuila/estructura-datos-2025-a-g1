import Logic.DatoBasico;

public class Example {
    public static void main(String Arg[]) {
        System.out.println("Probado ejemplo 1.");

        DatoBasico datoBasico = new DatoBasico();
        datoBasico.tipoDocumento = "CC";
        datoBasico.numeroDocumento = "1079";
        datoBasico.nombre = "Jesús";
        datoBasico.apellido = "González";

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Elija un caso (1, 2 o 3):");
        int caso = scanner.nextInt();

        if (caso == 1) {
            System.out.println("Estilo 1:");
            datoBasico.Forma1();
        } else {
            if (caso == 2) {
                System.out.println("Estilo 2:");
                datoBasico.Forma2();
            } else {
                if (caso == 3) {
                    System.out.println("Estilo 3:");
                    datoBasico.Forma3();
                } else {
                    if (caso <= 0) {
                        System.out.println(
                                "El número ingresado es menor o igual a 0, en este sentido no se puede realizar la operación");
                    } else if (caso > 3) {
                        System.out.println(
                                "El número ingresado es mayor a 3, en este sentido no se puede realizar la operación");

                    }
                }
            }
        }

        DatoBasico estudiante = new DatoBasico();
        estudiante.tipoDocumento = "TI";
        estudiante.numeroDocumento = "214324";
        estudiante.nombre = "Pedro";
        estudiante.apellido = "Reamiréz Cuellar";
        estudiante.Forma3();
    }
}
