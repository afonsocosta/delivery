package br.com.afonsoaoc.delivery.repository;

import br.com.afonsoaoc.delivery.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String>{

    Authority findByName(String name);
	
}