import java.util.Random;
import java.util.Scanner;

public class jogo_adivinhação {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Tente adivinhar o valor, jogue um numero ai: ");
		int usuario = teclado.nextInt();
		
		Random random = new Random();
		int numeroSorteado = random.nextInt(10, 100);
		
		if(usuario == numeroSorteado) {
			System.out.println("Voce Acertou!!!");
		}
		else {
			System.out.println("Tente outra vez");
			
		}
		System.out.println(usuario);
		System.out.println(numeroSorteado);
		teclado.close();
		
		
	}

}
