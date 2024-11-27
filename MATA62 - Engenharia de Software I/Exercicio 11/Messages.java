import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Messages {

    public static void Welcome() {
        System.out.println("Seja bem-vinda ou bem-vindo.");
    }

    public static void InvalidMessage(String tipo) throws IOException {
        System.out.println("Você não forneceu um " + tipo + " nome válido");
    }

    public static void End() throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Pressione Enter para sair do programa");
        teclado.readLine();
    }


}
