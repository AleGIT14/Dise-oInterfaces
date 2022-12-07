package claseinicial;

import claseinicial.Cuenta;

public class Prueba {

    public static void main(String args[]) {
        
        Cuenta a = new Cuenta();
        a.setTitular("Pepe");
        a.setCantidad(12000);
        
        
        System.out.println(a.toString());
        a.ingresar(4000.12);
        
        System.out.println(a.toString());
        a.retirar(20000);
        
        System.out.println(a.toString());
        
        
    }
}
