import java.util.Scanner;

public class chat_bot {
	public static void main(String[] args) {
		
		
		 Scanner teclado = new Scanner(System.in);
		 
		 //teste2
		 
		 System.out.println("Digite o numero de termos ");
		 int numero = teclado.nextInt();
		 
		 double soma = 0;
		 int i;
		 int multiplicador = 1;
		 
		 
		 for(i =1; i <= numero ; i++) {
			 soma += multiplicador * (1.0/i);
			 multiplicador *= -1;
		 }
		 
		 System.out.println(soma);
		 
		 teclado.close();
		 
		 
		 

	        
	}

}
