import java.util.Scanner;

public class SomarD�gitosN�meroInteiro {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String valorDigitado = leitor.nextLine();
		char[] digitos = valorDigitado.toCharArray();
		int var = 0;
		for (char c : digitos) {
			var = var + Integer.parseInt(String.valueOf(c));
		}
		System.out.println("A soma dos digitos �: " + var);
		
//		int soma = 0;
//		for(int i=0; i<valorDigitado.length(); i++) {
//			soma += Integer.parseInt(String.valueOf(valorDigitado.charAt(i)));
//		}
//
//		System.out.println("A soma dos digitos �: " + soma);
		
	
		
		leitor.close();	
	
	}
	
}
