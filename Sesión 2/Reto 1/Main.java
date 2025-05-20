import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        SimuladorFarmacia simulador1 = new SimuladorFarmacia();
        System.out.println("Ingrese datos: ");
        System.out.println("Nombre del medicamento: ");
        Scanner input = new Scanner(System.in);
        simulador1.Nombre = input.nextLine();

        System.out.println("Precio unitario: ");
        simulador1.Unidad = input.nextFloat();
        input.nextLine();

        System.out.println("Cantidad de piezas: ");
        simulador1.Cantidad = input.nextInt();
        input.nextLine();

        simulador1.Medicamento();
    }
}
