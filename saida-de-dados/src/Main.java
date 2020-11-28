import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Bom dia");
		System.out.println("Boa noite");
		
		int x, y;
		x = 10;
		y = 20;
		System.out.println(x);
		System.out.println(y);
		
		double z;
		z = 2.3456;
		System.out.println(String.format("%.2f", z));
		
		String nome;
		char sexo;
		nome = "Maria";
		sexo = 'F';
		System.out.println(nome);
		System.out.println(sexo);
		
	}

}
