public class CuentaCorriente extends  CuentaBancaria{
    private double limiteSobregiro;
    double saldo;

    public CuentaCorriente(String numeroCuenta, double saldoInicial, String titular, double limiteSobregiro) {
        super(numeroCuenta, saldoInicial, titular);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirarSaldo(double monto) {

        double disponible = saldo + limiteSobregiro;

        if (monto > 0 && monto <= disponible) {
            saldo -= monto; // Permite que el saldo quede en negativo
            System.out.println("Extracción con sobregiro: -$" + monto + " | Saldo en rojo: $" + saldo);
        } else {
            System.out.println("Extracción rechazada. Supera el límite de sobregiro.");
        }
    }
}
