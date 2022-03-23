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
public class S2 {
    /**
     * Método que indica el mes como caracteres en función del número del mes introducido
     * @param mes el número entero del mes del año
     * @return los meses del año
     */
    public static String mesDelAnio(int mes){
        switch(mes){
            case 1:
                return "enero";
            case 2:
                return "febrero";
            case 3:
                return "marzo";
            case 4:
                return "abril";
            case 5:
                return "mayo";
            case 6:
                return "junio";
            case 7:
                return "julio";
            case 8:
                return "agosto";
            case 9:
                return "septiembre";
            case 10:
                return "octubre";
            case 11:
                return "noviembre";
            default:
                return "valor incorrecto";
        }
    }
    /**
     * Método que muestra cuantos días tiene un mes 
     * @param mes el número entero del mes del año
     * @return los días que tienen los meses
     */
    public static int diasDelMes(int mes){
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
                return 30;
            default:
                return -1;
        }
    }
    /**
     * Método que calcula la média de los números
     * @param valores array de números decimales 
     * @return la média de los numeros que ha recibido por parámetro
     */
    public static float media(float[] valores){
        float suma = 0f;
        
        for(int i = 1; i < valores.length; i++)
            suma += valores[i];
        return suma/valores.length;
    }
    /**
     * Método que indica cual es el mayor de todos los números
     * @param valores que recibe por parámetro como un array de enteros 
     * @return el numero mayor del array
     */
    public static int mayor(int[] valores){
        int mayor = 0;
        
        mayor = valores[0];
        for(int i = 1; i < valores.length; i++)
            if(mayor > valores[i])
                mayor = valores[i];
        return mayor;
    }
}