import javax.swing.*;

public class DatoBasico {
    public String tipoDocumento;
    public String numeroDocumento;
    public String nombre;
    public String apellido;

    public void Forma1(){
        System.out.println(tipoDocumento
                +": "+numeroDocumento
                +" - "+nombre
                +" "+apellido);
    }

    public void Forma2(){
        System.out.println(tipoDocumento
                +": "+numeroDocumento
                +"\n"+nombre
                +" "+apellido);
    }

    public void Forma3(){
        JOptionPane.showMessageDialog(null,tipoDocumento
                +": "+numeroDocumento
                +"\n"+nombre
                +" "+apellido);
    }
}
