import java.util.Objects;

public class CuentaFiscal {
    private final String rfc;
    private double SaldoDisponible;

    public CuentaFiscal(String rfc, double SaldoDisponible){
        if (SaldoDisponible < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo");
        }
        this.rfc = rfc;
        this.SaldoDisponible = SaldoDisponible;
    }

    public String getRfc(){
        return rfc;
    }

    public double getSaldoDisponible(){
        return SaldoDisponible;
    }

    public boolean validarRFC(DeclaracionImpuestos Declaracion){
        return Objects.equals(this.rfc, Declaracion.rfcContribuyente());
    }
}
