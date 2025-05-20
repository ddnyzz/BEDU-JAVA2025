public class CajeroAutomatico{

    public void Consulta(double SaldoInicial){
        System.out.println("Tu saldo es: " + SaldoInicial);
    }

    public double Deposito(double Saldo, double SaldoADepositar){
        return saldo + SaldoADepositar;
    }

    public double retiro(double Saldo, double Retiro){
        double Total;
        boolean Suficiente = Saldo >= Retiro;
        Total = Suficiente ? Saldo - Retiro: Saldo;
        if (Suficiente){
            System.out.println("Su saldo actualizado es: " + Total);
        } else {
            System.out.println("No cuenta con saldo suficiente.");
            System.out.println("Su saldo actual es de: " + Total);
        }
        return Total;
    }
}
