package model;

public class Perro extends Animal{

    public Perro(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void beber(){
        double litros = 0;
        //0,00001 muy poco
        //0,001 poco
        //0,01 medio
        //0,1 regualar
        //1.0 bastante
        //10.0 mucha
        if(litros <= 0.00001 ){
            System.out.println("Muy poco");
        }else{
            if(litros <= 0.001){
                System.out.println("Poco");
            }else{
                if(2==2){

                }else{
                    if(2==2){

                    }else{
                        if(2==2){

                        }
                    }
                }
            }
        }
    }
}
