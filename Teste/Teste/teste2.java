import java.util.Scanner;

public class teste2 {
	
	public static void main(String[] args) {

		int i, soma = 0;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva um nome: ");
		
		String NomeUsuario = teclado.next();
		
		
		
		for (i=0; i<= NomeUsuario.length() -1; i++) {
			char Letra = NomeUsuario.charAt(i);
			if (Letra == 'a' || Letra == 'A') {
				soma++;
			}
		}
		 
		
		
		System.out.println("Essa é a quantidade de vezes que 'a' aparece: "+ soma);
		teclado.close();
		
	}

}
