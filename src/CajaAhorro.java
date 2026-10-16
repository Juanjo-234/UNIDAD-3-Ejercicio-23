public class CajaAhorro extends  CuentaBancaria{
    double saldo;

    public CajaAhorro(String numeroCuenta, double saldo, String titular) {
        super(numeroCuenta, saldo, titular);
        this.saldo = saldo;
    }

    void aplicarIntereses(double porcentaje){
        double intereses = saldo * (porcentaje / 100);
        saldo += intereses;
        System.out.println("Intereses aplicados (" + porcentaje + "%): +$" + intereses + ". Nuevo saldo: $" + saldo);
    }
}


