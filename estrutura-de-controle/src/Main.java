import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hora;
		System.out.print("Digite uma hora do dia: ");
		hora = sc.nextInt();
		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else {
			System.out.println("Boa tarde!");
		}
		
		int x, soma;
		soma = 0;
		System.out.print("Digite o primeiro numero: ");
		x = sc.nextInt();
		while (x != 0) {
			soma = soma + x;
			System.out.print("Digite outro numero: ");
			x = sc.nextInt();
		}
		System.out.println("SOMA = " + soma); 

		sc.close();
	}
} 