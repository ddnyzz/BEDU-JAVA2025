public class Pasajero {
    private String Nombre;
    private String Pasaporte;

    public Pasajero(String Nombre, String Pasaporte) {
        this.Nombre = Nombre;
        this.Pasaporte = Pasaporte;
    }

     public String getNombre() {
        return Nombre;
    }

    public String getPasaporte() {
        return Pasaporte;
    }
}

