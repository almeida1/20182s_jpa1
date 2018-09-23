package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Livro;

public class ExclusaoDB {
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("config1");
		EntityManager em = factory.createEntityManager();
		Livro livro = em.find(Livro.class,2);
		em.getTransaction().begin();
		em.remove(livro); //entidade monitorada recuperada e em seguida excluida.
		em.getTransaction().commit();
		em.close();
		factory.close();
		System.out.println(livro);
	}
}
