package com.projetofullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetofullstack.domain.Categoria;

//Responsavel por acessar o banco de dedas e fazer a consulta a tabela "Categoria".

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
