import java.util.Scanner;

public class sistema_login {
	public static void main(String[] args) {
		
		//teste4
		String login = "Admin";
		String senha = "ArrozComBtt123@";
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite seu username ");
		String username = teclado.nextLine();
		
		System.out.println("Digite seu username ");
		String password  = teclado.nextLine();
		
		if(login.equals(username) && password.equals(password)) {
			System.out.println("Acesso liberado ");
		}
		else {
			System.out.println("Login ou Senha estão incorretos");
		}
		
		
		
		
	}

}
