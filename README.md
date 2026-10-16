Resolución del ejercicio N°23 de la unidad 3 de programación 2.
Este programa modela un sistema de gestión bancaria que administra diferentes tipos de cuentas financieras mediante el uso de herencia, atributos protegidos, polimorfismo y sobrescritura de métodos en Java.

Clases utilizadas
CuentaBancaria: Clase base que almacena los datos comunes (numeroCuenta, saldo, titular) y define las operaciones genéricas de depósito y extracción.
CajaAhorro: Clase hija que extiende de CuentaBancaria e incorpora un método específico para aplicar intereses al saldo acumulado.
CuentaCorriente: Clase hija que extiende de CuentaBancaria, incorpora un límite de sobregiro autorizado y sobrescribe el método de extracción para permitir retiros utilizando dicho margen.
