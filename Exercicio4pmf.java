package procedimento_metodo_funcao;

import java.util.Scanner;

public class Exercicio4pmf {

	public static void conta (int x, int y , String a) {
		
		System.out.println("Digite um n�mero inteiro:" );
		  Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		
		System.out.println("Digite outro n�mero inteiro:" );
		  scanner = new Scanner(System.in);
		int y1 = scanner.nextInt();
	
		
		
		if (a != "+" && a != "-" && a != "*" && a != "/") {
		
			System.out.println("Operador inv�lido");
		}
		else if (a == "+") {
			int soma = x1 + y1;
			System.out.println("A soma entre os dois n�meros �: " +soma);
		}
	
		else if (a == "-") {
			int sub = x1 - y1;
			System.out.println("A subtra��o entre os dois n�meros �: " +sub);
		}
		else if (a == "*") {
			int mult = x1 * y1;
			System.out.println("A multiplica��o entre os dois n�meros �: " +mult);
		}
		
			else if (a == "/") {
				int div = x1 / y1;
				System.out.println("A divis�o entre os dois n�meros �: " +div);
			}	
		
	}
		
		public static void main(String[] args) {
			
			conta(100, 20 , "*");
			
	
}		

}