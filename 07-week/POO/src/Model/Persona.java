package Model;

public abstract class Persona{
    private String nombre;
    private String correo;

    //Set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    //Get
    public String getNombre(){
        return this.nombre;
    }

    public String getCorreo(){
        return this.correo;
    }


    //Methods Implementations
    public void Mostrar(){
        System.out.println(
                "Nombre: "+this.getNombre()+"\n" +
                        "Correo: "+this.getCorreo()+"\n"
        );
    }
}