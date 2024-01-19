package br.com.diegocordeiro.diodesafiopadroesprojeto.repository;

import br.com.diegocordeiro.diodesafiopadroesprojeto.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
