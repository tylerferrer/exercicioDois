package com.mycompany.exercicio2;

import java.util.Scanner;

/**
 *
 * @author Tyler
 */
public class Exercicio2 {

    public static void main(String[] args) {
//        Scanner
		Scanner entrada = new Scanner(System.in);
		
//                Entrada de dados
                System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		
//                Resultado do número digitado
		System.out.print("O número digitado foi: " + numero);
	}
}
