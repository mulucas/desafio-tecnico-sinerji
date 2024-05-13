package br.com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.model.Pessoa;

import java.util.List;

import javax.ejb.Stateless;


@Stateless
public class PessoaDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Pessoa> getListPessoaComEndereco() {
        String queryString = "SELECT DISTINCT p FROM Pessoa p LEFT JOIN FETCH p.endereco";
        TypedQuery<Pessoa> query = entityManager.createQuery(queryString, Pessoa.class);
        return query.getResultList();
    }
}
