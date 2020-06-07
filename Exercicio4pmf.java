package procedimento_metodo_funcao;

import java.util.Scanner;

public class Exercicio4pmf {

	public static void conta (int x, int y , String a) {
		
		System.out.println("Digite um número inteiro:" );
		  Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		
		System.out.println("Digite outro número inteiro:" );
		  scanner = new Scanner(System.in);
		int y1 = scanner.nextInt();
	
		
		
		if (a != "+" && a != "-" && a != "*" && a != "/") {
		
			System.out.println("Operador inválido");
		}
		else if (a == "+") {
			int soma = x1 + y1;
			System.out.println("A soma entre os dois números é: " +soma);
		}
	
		else if (a == "-") {
			int sub = x1 - y1;
			System.out.println("A subtração entre os dois números é: " +sub);
		}
		else if (a == "*") {
			int mult = x1 * y1;
			System.out.println("A multiplicação entre os dois números é: " +mult);
		}
		
			else if (a == "/") {
				int div = x1 / y1;
				System.out.println("A divisão entre os dois números é: " +div);
			}	
		
	}
		
		public static void main(String[] args) {
			
			conta(100, 20 , "*");
			
	
}		

}