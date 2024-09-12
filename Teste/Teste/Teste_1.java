import java.util.Scanner;

public class Teste_1 {
	
	public static void main(String[] args) {
		
		int PrimeiroValor = 0;
		int SegundoValor = 1;
		int i;
		int soma = 0;
		Boolean encontrado = false;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira um valor para conferir se tem na sequencia ");
		int ValorUsuario = teclado.nextInt();
		
		if (PrimeiroValor == ValorUsuario || SegundoValor == ValorUsuario) {
			encontrado = true;
		}
		
		
		for (i=0; i<=100;i++) {

		soma = PrimeiroValor + SegundoValor;
		PrimeiroValor = SegundoValor;
		SegundoValor = soma;
		if (ValorUsuario == soma) {
			encontrado = true;
			break;
		}
		

		}
		if(encontrado) {
			System.out.println("Valor " +encontrado);
		}
		else {
			System.out.println("Valor não encontrado");
		}
		
		
		
		
		teclado.close();
		
		
	}

}
