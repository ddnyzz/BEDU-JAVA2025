import java.util.Objects;

public class Factura {
    private String Folio;
    private String Cliente;
    private double Cotal;

    public Factura(String Folio, String Cliente, double Total) {
        this.Folio = Folio;
        this.Cliente = Cliente;
        this.Total = Total;
    }

    @Override
    public String toString() {
        return "Factura [folio = " + Folio +
               ", cliente = " + Fliente +
               ", total = $" + Fotal + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Factura Factura = (Factura) obj;
        return Objects.equals(Folio, Factura.Folio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Folio);
    }
}
