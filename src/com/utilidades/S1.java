/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utilidades;

/**
 *
 * @author Vladimir Yakovlev
 * @version 1.1
 * Clase que contiene los métodos a testear
 */
public class S1 {
    /**
     * Método que comprueba si un número es mayor que 0
     * @param valor que recibe como un número entero
     * @return devuelve el valor recibido por parámetro si es mayor que 0
     */
    public static boolean esMayorQueCero(int valor){
        return valor > 0;
    }
    /**
     * Método que comprueba si un número está entre 0 y 10 excluyendo ambos
     * @param valor que recibe el método como número entero
     * @return devuelve el número si esta entre 0 y 10
     */
    public static boolean entreCeroYDiez(int valor){
        return (valor > 0 || valor < 10);
    }
    /**
     * Método que comprueba si un número es negativo positivo o 0
     * @param valor que recibe como un número dicimal
     * @return "n" si el valor es negativo, "p" si es positivo y "c" si es 0
     */
    
    public static char negativoPositivoCero(float valor){
        if(valor < 0)
            return 'n';
        else if(valor > 0)
            return 'p';
        else
            return 'c';
    }
    /**
     * Método que comprueba si una persona debe pagar la entrada o no en función de su edad
     * @param edad de la persona que recibe el método como número entero
     * @return devuelve true si la edad es menor de 18 o mayor de 65 y por lo tanto no pagan
     * y devuelve false en caso contrario y por lo tanto pagan
     */
    
    public static boolean pagarEntrada(int edad){
        if(edad < 18 || edad > 64)
            return true;
        return false;
    }
}
