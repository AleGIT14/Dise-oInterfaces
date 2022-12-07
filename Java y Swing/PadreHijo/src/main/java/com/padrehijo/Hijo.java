/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.padrehijo;

/**
 *
 * @author losad
 */
public class Hijo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Realizando suma...");

        try {
            
            int num1 = Integer.valueOf(args[0]);
            int num2 = Integer.valueOf(args[1]);
            
            int res = num1 + num2;
            
            System.out.println(res);
            
        } catch (Exception e) {
            System.out.println("¡ERROR!" + "\n" + "Los parametros de entrada deben ser numeros");
        }
    }
}
