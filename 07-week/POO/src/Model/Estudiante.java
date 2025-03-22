package Model;

public class Estudiante extends Persona{
    private  String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void Mostrar(){
        System.out.println("Estudiante: "+this.getCodigo()+" - "+this.getNombre()+" - email"+this.getCorreo()+"\n");
    }
}