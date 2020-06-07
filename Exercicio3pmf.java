package procedimento_metodo_funcao;

import java.util.Scanner;

public class Exercicio3pmf {

public static void main(String[] args) {
		
	
	
	System.out.println("Digite a primeira nota:" );
	  Scanner scanner = new Scanner(System.in);
	int x = scanner.nextInt();
	
	System.out.println("Digite a segunda nota:" );
	  scanner = new Scanner(System.in);
	int y = scanner.nextInt();
	
	System.out.println("Digite a terceira nota:" );
	  Scanner scanner1 = new Scanner(System.in);
	int z = scanner1.nextInt();
	
	System.out.println("Digite a quarta nota:" );
	  scanner1 = new Scanner(System.in);
	int a = scanner1.nextInt();
	
	int media = x + y +z + a / (4);
	    media (8.5, 3.0, 9.0, 7.5);

	

			
		float media1 = (float) ((x+y+z+a)/4);
		
		System.out.println("Sua média foi: " +media1);
		
		if (media1 < 7.0 ) {
			System.out.println("Reprovado!");
			
		}	else 
			System.out.println("Aprovado!");
		return;
		
		
		
	}

private static void media(double d, double e, double f, double g) {
	// TODO Auto-generated method stub
	
}
			
}