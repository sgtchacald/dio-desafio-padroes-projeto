package br.com.diegocordeiro.diodesafiopadroesprojeto.service;

import br.com.diegocordeiro.diodesafiopadroesprojeto.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
