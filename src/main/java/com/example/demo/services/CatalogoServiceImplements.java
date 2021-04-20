package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.*;
import com.example.demo.entity.Catalogo;
import com.example.demo.entity.SubCatalogo;

@Service
public class CatalogoServiceImplements implements CatalogoService{
	
	@Autowired
	private CatalogoDao cataldao;
	
	@Autowired
	private SubCatalogoDao subcataldao;
	
	@Override
	public List<Catalogo> get_catalogo() {
		// TODO Auto-generated method stub
		return (List<Catalogo>) cataldao.get_catalogo();
	}

	@Override
	public void del_catalogo(Long id) {
		// TODO Auto-generated method stub
		cataldao.deleteById(id);
		
	}

	@Override
	public void del_sub_catalogo(Long id) {
		// TODO Auto-generated method stub
		subcataldao.delete_sub_catalogo(id);
		
		
	}

	@Override
	public void add_catalog(Catalogo cat) {
		// TODO Auto-generated method stub
		cataldao.save(cat);
		
	}

	@Override
	public void add_sub_catalog(SubCatalogo sub) {
		// TODO Auto-generated method stub
		subcataldao.save(sub);
		
	}

	@Override
	public List<SubCatalogo> get_subCatalogo(Long id) {
		// TODO Auto-generated method stub
		return (List<SubCatalogo>) subcataldao.sub_catalogos(id);
	}
	
	

	
	
}
