package com.generation.blogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogPessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	//criando um metodo, consultando pelo titulo
	//SELECT * FROM tb_postagens WHERE titulo LIKE "%titulo%";
	public List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
//Long representa a nossa PrimaryKey do ID.