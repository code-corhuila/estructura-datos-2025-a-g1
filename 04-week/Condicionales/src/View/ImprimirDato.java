package View;

import Logic.DatoBasico;

public class ImprimirDato {
    public static void main(String Arg[]){
        System.out.println("Probado ejemplo 1.");

        DatoBasico datoBasico = new DatoBasico();
        datoBasico.tipoDocumento = "CC";
        datoBasico.numeroDocumento = "1079";
        datoBasico.nombre = "Jesús";
        datoBasico.apellido = "González";

        System.out.println("Estilo 1:");
        datoBasico.Forma1();

        System.out.println("Estilo 2:");
        datoBasico.Forma2();

        System.out.println("Estilo 3:");
        datoBasico.Forma3();


        DatoBasico estudiante = new DatoBasico();
        estudiante.tipoDocumento = "TI";
        estudiante.numeroDocumento = "214324";
        estudiante.nombre = "Pedro";
        estudiante.apellido = "Reamiréz Cuellar";
        estudiante.Forma3();
    }
}
