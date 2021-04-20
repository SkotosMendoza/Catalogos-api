package com.example.demo.services;

import com.example.demo.entity.Catalogo;
import com.example.demo.entity.SubCatalogo;

import java.util.List;

public interface CatalogoService {
	
	public List<Catalogo> get_catalogo();
	public List<SubCatalogo> get_subCatalogo(Long id);
	
	public void del_catalogo(Long id);
	
	public void del_sub_catalogo(Long id);
	
	public void add_catalog(Catalogo cat);
	public void add_sub_catalog(SubCatalogo sub);
	

}
