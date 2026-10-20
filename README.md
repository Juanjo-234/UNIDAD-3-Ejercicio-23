Este programa está diseñado para modelar un sistema jerárquico de cuentas bancarias aplicando los principios fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento, polimorfismo y especialización de comportamiento mediante la sobrescritura de métodos (@Override).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base CuentaBancaria: Concentra los atributos comunes (numeroCuenta, titular y saldo) aplicando encapsulamiento, e implementa la lógica base para depósitos y extracciones estándar.

Desarrolla la subclase CajaAhorro: Extiende de CuentaBancaria e incorpora un método específico (aplicarIntereses()) para incrementar el saldo en función de una tasa porcentual de rendimiento.

Desarrolla la subclase CuentaCorriente: Extiende de CuentaBancaria añadiendo un atributo privado limiteSobregiro y sobrescribe el método extraer(double monto) para permitir extracciones que utilicen tanto el saldo disponible como el margen de sobregiro autorizado.

Ejecuta la prueba en el main: Instancia ambos tipos de cuentas (polimórficamente o directamente), simula operaciones financieras mixtas (depósitos, extracciones normales, extracciones excedidas usando sobregiro y aplicación de intereses), y muestra los saldos finales por consola.
