package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Catalogo;
import com.example.demo.entity.SubCatalogo;

import com.example.demo.services.CatalogoService;
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CatalogoController {
	
	@Autowired
	private CatalogoService catServices;
	
	
	@GetMapping("/getCatalogos")
	public Map<String, ?> getCatalogos(){
		List<Catalogo> catalogo = catServices.get_catalogo();
		Map<String,Object> objMap = new HashMap<String, Object>();
		objMap.put("status", "201");
		objMap.put("data", catalogo);
		
		return objMap;
		
	}
	@PostMapping("/getSubCatalogos")
	public Map<String, ?> getSubCatalogos(@RequestBody SubCatalogo id){
		List<SubCatalogo> catalogo = catServices.get_subCatalogo(id.getId());
		Map<String,Object> objMap = new HashMap<String, Object>();
		objMap.put("status", "201");
		objMap.put("data", catalogo);
		
		return objMap;
		
	}
	@PostMapping("/delCatalogos")
	public Map<String, ?> delCatalogos(@RequestBody Catalogo id){
		catServices.del_sub_catalogo(id.getId());
		catServices.del_catalogo(id.getId());
		Map<String,Object> objMap = new HashMap<String, Object>();
		objMap.put("status", "201");
		objMap.put("message", "delete ok");
		
		return objMap;
		
	}
	@PostMapping("/addCatalog")
	public Map<String,?> addCatalog(@RequestBody Catalogo body){
		catServices.add_catalog(body);
		Map<String,Object> objMap = new HashMap<String, Object>();
		objMap.put("status", "201");
		objMap.put("message", "add ok");
		return objMap;
	}
	@PostMapping("/addSubCatalog")
	public Map<String,?> addSubCatalog(@RequestBody SubCatalogo body){
		catServices.add_sub_catalog(body);
		Map<String,Object> objMap = new HashMap<String, Object>();
		objMap.put("status", "201");
		objMap.put("message", "add ok");
		return objMap;
	}

	

}
