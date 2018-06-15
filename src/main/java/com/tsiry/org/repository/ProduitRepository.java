/**
 * 
 */
package com.tsiry.org.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.tsiry.org.model.Produit;
/**
 * @author Tsiry MANANKASINA
 *
 */
public interface ProduitRepository extends ElasticsearchRepository <Produit , String>{

}
