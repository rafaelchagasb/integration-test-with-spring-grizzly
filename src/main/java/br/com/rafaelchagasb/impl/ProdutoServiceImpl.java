package br.com.rafaelchagasb.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import br.com.rafaelchagasb.entities.Produto;
import br.com.rafaelchagasb.interfaces.IProdutoService;

@Controller
public class ProdutoServiceImpl implements IProdutoService{
	 
	@PersistenceContext(type=PersistenceContextType.TRANSACTION)
	private EntityManager em;
	
	public ProdutoServiceImpl() {
	}
	
	@Transactional
	public String save() {
		
		Produto produto = new Produto();
		
		produto.setNome("produto salvo");
		
		em.persist(produto);
		
		return produto.getNome();
		
	}
    
    public List<Produto> listAll(){
    	
    	Query query = em.createQuery("select o from Produto o");
    	
    	return query.getResultList();
    }
    
    public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
}