/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package claseinicial;

/**
 *
 * @author aromcon1407_iesmarti
 */
public class Cuenta {

    private String titular;
    private double cantidad;

//    public Cuenta(String titular) {
//        this.titular = titular;
//    }
//    
//    public Cuenta(String titular, int cantidad) {
//        this.titular = titular;
//        this.cantidad = cantidad;
//    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    
    protected void ingresar(double DineroIngreso){
        if(DineroIngreso > 0){
        setCantidad(getCantidad() + DineroIngreso);
        }
    }
    
    protected void retirar(double DineroIngreso){
        setCantidad(getCantidad() - DineroIngreso);
        if (getCantidad()< 0) {
            setCantidad(0);
        }
        
    }
    
    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }   
}
