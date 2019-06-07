package com.projetofullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetofullstack.domain.Produto;

//Responsavel por acessar o banco de dedas e fazer a consulta a tabela "Produto".

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
