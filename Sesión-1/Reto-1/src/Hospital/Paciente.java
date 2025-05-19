package Hospital;

public class Paciente {
    String Nombre, NumExp;
    int Edad;
  
    public void mostrarInformacion(){
      
        System.out.println("\nInformación del paciente:");
        System.out.println("Paciente: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Expediente: " + NumExp);
    }

}
