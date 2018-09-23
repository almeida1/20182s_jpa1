package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Livro;

public class InsereDB {

	public static void main(String[] args) {
		Livro livro1 = new Livro("1111", "Utilizando UML", "Larman");
		Livro livro2 = new Livro("2222", "Gerencia de Projetos", "Heldman");
		Livro livro3 = new Livro("3333", "Codigo Limpo", "Martin");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("config1");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(livro1);
		em.persist(livro2);
		em.persist(livro3);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}

}
