/**
 * 
 */
package com.tsiry.org.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author Tsiry MANANKASINA
 *
 */
@Document(type="Produits", indexName = "es_project")
@Data @NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
public class Produit {
	
	@Id
    private String id;
	
	@NonNull
	private String name ;
	
	private Double prix;
}
