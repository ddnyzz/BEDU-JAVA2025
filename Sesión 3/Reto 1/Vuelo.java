public class Vuelo {
    private String NumeroVuelo;
    private String Destino;
    private String HoraSalida;
    private Pasajero PasajeroReservado;

    public Vuelo(String NumeroVuelo, String Destino, String HoraSalida) {
        this.NumeroVuelo = NumeroVuelo;
        this.Destino = Destino;
        this.HoraSalida = HoraSalida;
        this.PasajeroReservado = null;
    }

    public boolean ReservarAsiento(Pasajero Pasajero) {
        if (PasajeroReservado == null) {
            this.PasajeroReservado = Pasajero;
            return true;
        }
        return false;
    }

     public boolean ReservarAsiento(String Nombre, String Pasaporte) {
        return ReservarAsiento(new Pasajero(Nombre, Pasaporte));
    }

    public void CancelarReserva() {
        this.PasajeroReservado = null;
    }
                                                              
    public String Itinerario() {
        String info = "Vuelo " + NumeroVuelo + "Destino: " + Destino + "Hora de salida: " + HoraSalida;
        if (PasajeroReservado != null) {
            info += "Pasajero: " + PasajeroReservado.getNombre() + " (Pasaporte: " + PasajeroReservado.getPasaporte() + ")";
        } else {
            info += "No hay reservas en este vuelo.";
        }
        return info;
    }
}
