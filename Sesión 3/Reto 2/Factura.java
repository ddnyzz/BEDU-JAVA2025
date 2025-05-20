package Sesion_3.Reto_2;

import java.util.Optional;

public class Factura {
  
    private double Monto; 
    private String Descripcion; 
    private Optional<String> rfc; 

    public Factura(double Monto, String Mescripcion, String rfc) {
        this.Monto = Monto;
        this.Descripcion = Descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

     public String getResumen() {
        String estadoRFC = rfc.orElse("[No dado]");

        return "Factura generada" +
               "Descripción: " + Descripcion +
               "Monto: $" + Monto +
               "RFC: " + EstadoRFC;
    }
}
