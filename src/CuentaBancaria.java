public abstract class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;
    protected String titular;


    public CuentaBancaria(String numeroCuenta, double saldoInicial, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    public  void agregarSaldo(double monto){
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso de $" + monto + ". Saldo actual: $" + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

   public void retirarSaldo(double monto){
       if (monto > 0 && monto <= saldo) {
           saldo -= monto;
           System.out.println("Extracción exitosa de $" + monto + ". Saldo actual: $" + saldo);
       } else {
           System.out.println("Fondos insuficientes o monto inválido para la extracción.");
       }
    }

    public void mostrarDatos() {
        System.out.println("Nro Cuenta: " + numeroCuenta + " | Titular: " + titular + " | Saldo: $" + saldo);
    }


}

