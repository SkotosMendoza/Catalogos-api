package com.example.demo.dao;

import com.example.demo.entity.Catalogo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;



public interface CatalogoDao extends CrudRepository<Catalogo,Long>{

	
	@Query(value="SELECT * FROM nombre_catalogo", nativeQuery=true)
	public List<Catalogo> get_catalogo();
	
	@Query(value= "INSERT INTO nombre_catalogo (id,nombre,categoria,codigo) VALUES (?,?,?,?)", nativeQuery=true)
	public void add_catalog(Catalogo cat);
	
}
