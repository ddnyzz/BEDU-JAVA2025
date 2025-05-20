public class SimuladorFarmacia {
    String Nombre;
    double Unidad, Total, Pagar, Descuento;
    int Cantidad;
    boolean DescuentoT;

    public void Medicamento(){
        Total = Unidad * Cantidad;
        DescuentoT = Total > 500;
        Descuento = DescuentoT ? Total * 0.15 : 0;
        Pagar = Total - Descuento;

        System.out.println("Medicamento: " + Nombre);
        System.out.println("Cantidad: " + Cantidad);
        System.out.println("Precio unitario: $" + Unidad);
        System.out.println("Total sin descuento: $" + Total);
        System.out.println("¿Aplica descuento?: " + DescuentoT);
        System.out.println("Descuento: $" + Descuento);
        System.out.println("Total a pagar: $" + Pagar);
    }
}
