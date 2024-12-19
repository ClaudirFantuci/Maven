package controle;

import java.util.List;

import dao.ClienteDAO;
import entidade.Cliente;
import servico.ClienteServico;

public class ClienteControle {
    ClienteServico servico = new ClienteServico();

    public Cliente inserir(Cliente cliente) {
        return servico.inserir(cliente);
    }

    public Cliente BuscarCliente(String cpf) {
        return servico.returnarCLientePorCpf(cpf);
    }

}
