import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		Messages.Welcome();

		Pessoa usuario = Pessoa.setDadosPessoa();

		if (!Pessoa.validarPessoa(usuario)) {
			Messages.End();
			return;
		}

		Pessoa.criarPessoa(usuario);
	
		Messages.End();
		
	}

}