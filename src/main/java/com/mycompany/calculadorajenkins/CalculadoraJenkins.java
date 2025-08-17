/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadorajenkins;

/**
 *
 * @author linoz
 */
public class CalculadoraJenkins {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("2 + 3 = " + calc.sumar(2, 3));
        System.out.println("5 - 2 = " + calc.restar(5, 2));
        System.out.println("4 * 3 = " + calc.multiplicar(4, 3));
        System.out.println("8 / 2 = " + calc.dividir(8, 2));
        System.out.println("Promedio del historial = " + calc.promedioHistorial());
    }
}
