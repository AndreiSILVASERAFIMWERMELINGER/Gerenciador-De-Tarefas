import java.util.Scanner;

public class Calculadora_Java {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double resultado = 0;
		//teste1
		System.out.println("Digite o primeiro valor: ");
		double primeiroValor = teclado.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double segundoValor = teclado.nextDouble();
		
		System.out.println("Digite qual operação voce deseja +  -  *  /");
		String operador = teclado.next();
		
		if(segundoValor == 0 && operador.equals("/") ) {
			System.out.println("O valor do seu denominador não pode ser zero");
		}
		else {
			
			switch(operador) {
			case "+":
				resultado = primeiroValor + segundoValor;
				break;
			case "-":
				resultado = primeiroValor - segundoValor;
				break;
			case "*":
				resultado = primeiroValor * segundoValor;
				break;
			case "/":
				resultado = primeiroValor / segundoValor;
				break;
	
			}
			
			System.out.println(resultado);
			
			teclado.close();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
