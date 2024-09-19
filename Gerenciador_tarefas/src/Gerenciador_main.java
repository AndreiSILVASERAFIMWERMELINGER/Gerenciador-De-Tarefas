import java.util.Scanner;

public class Gerenciador_main {
public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	
	
	Gerenciador_teste tarefa1 = new Gerenciador_teste(19, 9 ,2024, "Estudar Oracle");
	Gerenciador_teste tarefa2 = new Gerenciador_teste(21, 9, 2024, "Estudar Ingles");
	
	tarefa1.addTarefa();
	tarefa2.addTarefa();
	
	
	
	tarefa1.exibirMinhaTarefa();
	
	
	
}
}
