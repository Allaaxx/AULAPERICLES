package programinha;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modules.Produtos;

public class Main {
	
	public static void main(String[] args) {
		Produtos p1= new Produtos(null,"rodriguinho","rodriguinho", 27, "28-04-2006");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
	}
	
	
}
