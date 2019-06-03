package com.br.zup.tabuada;

import java.util.Scanner;

public class AppTabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int controle = 1;
		int numero = 0;
		int opcao1 = 1;
		

		while (controle == 1) {

			System.out.println(" Digite um número da tabuada que deseja imprimir\n");
			numero = scan.nextInt();
			
			System.out.println(" Por qual número deseja iniciar\n");
			opcao1 = scan.nextInt();
			
			System.out.println("Tabuada do " + numero + "\n");
			

			for (int i = opcao1 ; i <= 10; i++) {
				int total = (numero * i);
				System.out.println(numero + "X" + i + "=" + total);

			}
			
			System.out.println(" (1) Para continuar ou (0) Para sair\n");
			int opcao2 = scan.nextInt();
			
			if(opcao2 == 0) {
				controle = 0;
			}else {
				controle = 1;
			}
		
		}

		scan.close();
	}
}
