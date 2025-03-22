package Model;

public class Profesor extends Persona{
    private String tipoContrato;

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public void Mostrar(){
        System.out.println(
                "Data ******: "+this.getNombre()+" : "+this.getCorreo()+"- profesor de "+this.getTipoContrato()+". \n");
    }
}