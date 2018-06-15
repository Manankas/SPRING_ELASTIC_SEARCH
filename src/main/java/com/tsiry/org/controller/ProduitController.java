/**
 * 
 */
package com.tsiry.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsiry.org.model.Produit;
import com.tsiry.org.repository.ProduitRepository;


/**
 * @author Tsiry MANANKASINA
 *
 */
@RestController
@RequestMapping("/produit")
public class ProduitController {
	
	@Autowired
	ProduitRepository produitRepository;
	
	@PostMapping("/add")
	public Produit save(@RequestBody Produit p){
		return produitRepository.save(p);
	}
	
	@GetMapping("/list")
	public Iterable<Produit> list(){
		return produitRepository.findAll();
	}
}
