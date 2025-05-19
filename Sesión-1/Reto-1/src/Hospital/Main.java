package Hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        Scanner input = new Scanner(System.in);

        System.out.print("Nombre del paciente: ");
        paciente1.Nombre = input.nextLine();

        System.out.print("Edad del paciente: ");
        paciente1.Edad = input.nextInt();
        input.nextLine();

        System.out.print("Expediente: ");
        paciente1.NumExp = input.nextLine();
      
        paciente1.mostrarInformacion();
    }
}
