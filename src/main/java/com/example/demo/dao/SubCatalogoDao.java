package com.example.demo.dao;
import com.example.demo.entity.SubCatalogo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Catalogo;



public interface SubCatalogoDao extends CrudRepository<SubCatalogo,Long>{

	@Transactional
	@Modifying
	@Query(value="DELETE FROM sub_catalogos where id_catalogo= ?1 ", nativeQuery=true)
	public void delete_sub_catalogo(Long id);
	
	@Query(value="SELECT * FROM sub_catalogos where id_catalogo=?1", nativeQuery=true)
	public List<SubCatalogo> sub_catalogos(Long id);

}
