import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private List<Fita> fitas = new ArrayList<Fita>();

    public void alugarFita(String nomeCliente, String tituloFita, int diasAlugada) {
        Cliente cli = buscarClientePorNome(nomeCliente);
        Fita fita = buscarFitaPorTitulo(tituloFita);
        cli.criarAluguel(fita, diasAlugada);
    }
    private Cliente buscarClientePorNome(String nomeCliente) {
        for(Cliente cliente: clientes) {
            if (cliente.getNome().equals(nomeCliente)) {
                return  cliente;
            }
        }
        return null;
    }

    private Fita buscarFitaPorTitulo(String tituloFita) {
        for(Fita fita: fitas) {
            if (fita.getTitulo().equals(tituloFita)) {
                return  fita;
            }
        }
        return null;
    }
}
