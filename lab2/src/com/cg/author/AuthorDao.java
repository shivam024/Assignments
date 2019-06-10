package com.cg.author;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;




public class AuthorDao {
	
	
	

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();

		 Author author = new Author();
		 author.setFirstName("John");
		 author.setMiddleName("Cena");
		 author.setPhoneNo("989826666");
		em.getTransaction().begin();
		 em.persist(author);
		em.getTransaction().commit();
		 System.out.println("Added author to database.");

		 int id = 22;
		author = em.find(Author.class, id);
		author.setFirstName("Arshia");
		 em.getTransaction().begin();
		 em.merge(author);
		 em.getTransaction().commit();
		 System.out.println("Updated author to database.");

		  id = 22;
	 author = em.find(Author.class, id);
		 em.getTransaction().begin();
		 em.remove(author);
		 em.getTransaction().commit();
		 System.out.println("Removed author from database.");
		 em.getTransaction().commit();
		em.close();
		factory.close();
	}
}