/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

/**
 *
 * @author f290ti
 */
public class Calculadora {
    
    private double a, b, c, resultado;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    
    public double getC() {
        return c;
    }

    public double getResultado() {
        return resultado;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public void setC(double c) {
        this.c = c;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double somar(double a, double b) {
        this.a = a;
        this.b = b;
        return a + b;
    }
    
    public double subtrair(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        return a - b + c;
    }
    
    public double multiplicar(double a, double b) {
        this.a = a;
        this.b = b;
        return a * b;
    }
    
    public double dividir(double a, double b) {
        this.a = a;
        this.b = b;
        return a / b;
    }
    
}
