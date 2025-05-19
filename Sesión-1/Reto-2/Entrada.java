public class Entrada {
    
    String NombreEvento;
    double PrecioEntrada;

    public Entrada(String nombre, double precio) {
        this.NombreEvento = nombre;
        this.PrecioEntrada = precio;
    }

     public void MostrarInformacion(){
        System.out.println("Evento: " + NombreEvento + " | Precio: $" + PrecioEntrada);
    }
}
