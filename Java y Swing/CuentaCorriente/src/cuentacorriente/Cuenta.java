/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package cuentacorriente;

public class Cuenta {
    
    private String titular;
    private String dni;
    private double cantidad;
    private int nCuenta;

    public Cuenta(String titular, String dni) {
        this.titular = titular;
        this.dni = dni;
    }

    public Cuenta(String titular, String dni, double cantidad) {
        this.titular = titular;
        this.dni = dni;
        this.cantidad = cantidad;
        this.nCuenta++;
    }

    public String getTitular() {
        return titular;
    }

    public String getDni() {
        return dni;
    }

    public double getCantidad() {
        return cantidad;
    }
    
    
    protected void retirar(double b){
        if (this.cantidad > 0) {
           this.cantidad -= b;
            if (this.cantidad < 0) {
                this.cantidad = 0;
            }
        } else {
            System.out.println("La cantidad es igual a cero o inferior");
        }
    }
    
    protected void ingresar(double b){
        this.cantidad += b;
    }
    
}
