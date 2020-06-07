package procedimento_metodo_funcao;

import java.util.Scanner;

public class Exercicio2pmf {

	public static void main (String [] args) {
		
		System.out.println("Digite um número inteiro:" );
		  Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		System.out.println("Digite outro número inteiro:" );
		  scanner = new Scanner(System.in);
		int y = scanner.nextInt();
		
		soma (x,y);
		
		}
	
		public static void  soma (int x, int y) {
			
		int soma = 0;

		for (int i = 0; i <= 0; i++ ) {
			soma +=x;
			
		}
	
		System.out.println("A soma do primeiro número até o segundo é "    +soma);	
		}

		
	}
