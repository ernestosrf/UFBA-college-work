import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pessoa {
	private String primeiroNome;
	private String ultimoNome;	
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public static Pessoa setDadosPessoa() throws IOException {
		Pessoa usuario = new Pessoa();

		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Qual é seu primeiro nome?");
		usuario.setPrimeiroNome(teclado.readLine());

		System.out.println("Qual é seu último nome?");
		usuario.setUltimoNome(teclado.readLine());

		return usuario;
	}

	public static boolean validarPessoa(Pessoa usuario) throws IOException {
		if (usuario.getPrimeiroNome().isEmpty()) {
			Messages.InvalidMessage("primeiro");
			return false;
		}

		if (usuario.getUltimoNome().isEmpty()) {
			Messages.InvalidMessage("último");
			return false;
		}

		return true;
	}

	public static void criarPessoa(Pessoa usuario) {
		System.out.println("Seu id de usuário é " + usuario.getPrimeiroNome().substring(0, 1) + usuario.getUltimoNome());
	}
}
