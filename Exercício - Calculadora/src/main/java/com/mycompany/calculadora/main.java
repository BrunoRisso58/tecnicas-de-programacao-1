/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import java.util.Scanner;
import com.mycompany.calculadora.Calculadora;

/**
 *
 * @author f290ti
 */
public class main {
    public static void main(String[] args) {
        
        double a, b, c, resultado = 0;
        String operacao;
        
        Calculadora minhaCalculadora = new Calculadora();
        
        Scanner myInputs = new Scanner(System.in);
        
        System.out.println("Digite o simbolo da operação que você quer realizar\nSoma: +\nSubtração: -\nMultiplicação: *\nDivisão: /");
        operacao = myInputs.nextLine();
        
        System.out.println("Digite o primeiro número da operação: ");
        a = myInputs.nextDouble();
        minhaCalculadora.setA(a);
        
        System.out.println("Digite o segundo número da operação: ");
        b = myInputs.nextDouble();
        minhaCalculadora.setB(b);
        
        switch (operacao) {
            case "+":
                resultado = minhaCalculadora.somar(minhaCalculadora.getA(), minhaCalculadora.getB());
                minhaCalculadora.setResultado(resultado);
                System.out.println("Resultado da operação: " + minhaCalculadora.getResultado());
                break;
            case "-":
                System.out.println("Digite o terceiro número da operação: ");
                c = myInputs.nextDouble();
                minhaCalculadora.setC(c);
                resultado = minhaCalculadora.subtrair(minhaCalculadora.getA(), minhaCalculadora.getB(), minhaCalculadora.getC());
                minhaCalculadora.setResultado(resultado);
                System.out.println("Resultado da operação: " + minhaCalculadora.getResultado());
                break;
            case "*":
                resultado = minhaCalculadora.multiplicar(minhaCalculadora.getA(), minhaCalculadora.getB());
                minhaCalculadora.setResultado(resultado);
                System.out.println("Resultado da operação: " + minhaCalculadora.getResultado());
                break;
            case "/":
                if (minhaCalculadora.getB() == 0) {
                    System.out.println("Não é possível fazer divisão por 0");
                } else {
                    resultado = minhaCalculadora.dividir(minhaCalculadora.getA(), minhaCalculadora.getB());
                    minhaCalculadora.setResultado(resultado);
                    System.out.println("Resultado da operação: " + minhaCalculadora.getResultado());
                }
                break;
            default:
                System.out.println("Digite um operador válido!");
                break;
        }
        
    }
}
