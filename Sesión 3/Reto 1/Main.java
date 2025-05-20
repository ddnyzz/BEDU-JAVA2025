public class Main {
    public static void main(String[] args) {
      
        Vuelo vuelo1 = new Vuelo("UX123", "París", "14:30");
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "X123456");

        //reserva1
        if (vuelo1.reservarAsiento(pasajero1)) {
            System.out.println("Reserva exitosa");
        } else {
            System.out.println("Asiento ocupado");
        }

        System.out.println(vuelo1.obtenerItinerario());

        //cancelar
        System.out.println("Cancelando");
        vuelo1.cancelarReserva();
        System.out.println(vuelo1.obtenerItinerario());

        if (vuelo1.reservarAsiento("Mario Gonzalez", "Z987654")) {
            System.out.println("Reserva exitosa");
        } else {
            System.out.println("Asiento ocupado");
        }
        System.out.println(vuelo1.obtenerItinerario());
    }
}
