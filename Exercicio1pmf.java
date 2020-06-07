package procedimento_metodo_funcao;

import java.util.Scanner;

public class Exercicio1pmf {
	
	public static void main(String[] args) {
	
		int x = 0;
		int y = 0;
		multiplicacao (x,y);
		
		System.out.println("Digite um número inteiro:" );
		  Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		
		System.out.println("Digite outro número inteiro:" );
		  scanner = new Scanner(System.in);
		y = scanner.nextInt();

	
		int mult = x*y;
		System.out.println("O resultado dessa multiplicação é: " +mult);
	}

	private static void multiplicacao(int x, int y) {
	
	} 

}
