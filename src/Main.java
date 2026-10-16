//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("=== CAJA DE AHORRO ===");
    CajaAhorro caja = new CajaAhorro("CA-1001", 100000.0, "María López");
    caja.mostrarDatos();
    caja.aplicarIntereses(4.5);
    caja.retirarSaldo(30000.0);


    System.out.println("\n=== CUENTA CORRIENTE ===");
    CuentaCorriente cc = new CuentaCorriente("CC-2001", 0.0, "Juan Pérez", 50000.0);
    cc.mostrarDatos();

    cc.retirarSaldo(45000.0);
    cc.retirarSaldo(10000.0);
}
