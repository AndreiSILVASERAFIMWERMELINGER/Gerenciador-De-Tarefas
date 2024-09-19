
import java.util.ArrayList;
import java.util.Iterator;

public class Gerenciador_teste {
	int dia;
	int mes;
	int ano;
	String tarefa_dia;
	String status_tarefa;
	   
	
	private static ArrayList<Gerenciador_teste> listaTarefas = new ArrayList <>();
	
	Gerenciador_teste(){}
	
	public Gerenciador_teste (int dia, int mes, int ano, String tarefa_dia) {
		this.dia = dia;
		this.ano =ano;
		this.mes =mes;
		this.tarefa_dia = tarefa_dia;
		
	}
	 
		void addTarefa () {
			listaTarefas.add(this);
		}
		
		void excluirTarefa () {
			Iterator<Gerenciador_teste> iterator = listaTarefas.iterator();
			while (iterator.hasNext()) {
				Gerenciador_teste tarefa = iterator.next();
				if(tarefa.tarefa_dia.equals(tarefa_dia)) {
					iterator.remove();
					System.out.println("Tarefa Removida: " + tarefa_dia);
					return;
				}
				
			}
			System.out.println("Tarefa Não encontrada");
		}
				
				
			void exibirMinhaTarefa() {
		    System.out.println("Tarefa: " + this.tarefa_dia + " Dia: " + this.dia + " Mes: " + this.mes + " Ano: " + this.ano);
				}


				}

				
				
			
		
		
		
	


