package br.com.rafaelchagasb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Assert;
import org.junit.Test;

import br.com.rafaelchagasb.entities.Produto;

public class JpaTest {

	@Test
	public void test(){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager");
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Produto produto = new Produto();
		
		produto.setNome("produto");
		
		em.persist(produto);
		
		Assert.assertNotNull(em.find(Produto.class, 1L));
		
		em.getTransaction().commit();
		
		em.close();
		
		emf.close();
		
	}
	
}
