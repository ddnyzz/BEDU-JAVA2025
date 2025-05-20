import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        var Saldo = 1000.0;
        int Opcion;
        Scanner input = new Scanner(System.in);
        Cajero cajero1= new Cajero();

        do {
            System.out.println("Elige una acción: ");
            System.out.println("1. Consultar saldo.");
            System.out.println("2. Depositar dinero.");
            System.out.println("3. Retirar dinero.");
            Opcion = input.nextInt();

            switch (Opcion) {
                case 1-> cajero1.Consulta(Saldo);
                case 2 ->{
                    System.out.println("Monto: ");
                    double SaldoADepositar = input.nextInt();
                    input.nextLine();
                    Saldo = cajero1.Deposito(Saldo, SaldoADepositar);
                    System.out.println("Saldo actual: " + Saldo);
                }
                case 3 ->{
                    System.out.println("Retirar: ");
                    double Retiro = input.nextDouble();
                    input.nextLine();
                    Saldo = cajero1.Retiro(Saldo, Retiro);
                }

            boolean validacion = Opcion <=4;
            if (!validacion){
                System.out.println("No es una opción válida");
            }
        } 
    }
}
