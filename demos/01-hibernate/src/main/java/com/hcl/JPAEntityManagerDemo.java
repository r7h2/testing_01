package com.hcl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnitUtil;

import org.hibernate.Session;

import com.hcl.model.Movie;

//Video: "Hibernate and Java Persistence API (JPA)" O'reilly course (Kevin Bowersox)
//https://learning.oreilly.com/videos/hibernate-and-java/9781771373494/
//Book: "Java Persistence with Hibernate" (Christian Bauer)
//https://learning.oreilly.com/library/view/java-persistence-with/9781617290459/
public class JPAEntityManagerDemo {

	public static void main(String[] args) {
		// https://www.baeldung.com/hibernate-entitymanager
		// https://stackoverflow.com/questions/5640778/hibernate-sessionfactory-vs-jpa-entitymanagerfactory
		// https://www.baeldung.com/hibernate-save-persist-update-merge-saveorupdate
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.hcl.movie_catalog");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("================");
		
		// in case you need the native Hibernate API - can convert from JPA to Hibernate API
		Session session = em.unwrap(Session.class);
		
		em.getTransaction().begin();
		Movie movie = new Movie();
		//movie.setId(1L);
		movie.setMovieName("The Godfather");
		movie.setReleaseYear(1972);
		movie.setLanguage("English");
		// check to see if movie is in a "transient" state - return null if so, else primary key
		System.out.println("in a transient state?: " + emf.getPersistenceUnitUtil().getIdentifier(movie));
		System.out.println("Before persist: Is movie entity in a persistent state?: " + em.contains(movie));
		// JPA persist() method
		em.persist(movie); // puts movie in the "persistent" state
		System.out.println("After: Is movie entity in a persistent state?: " + em.contains(movie));
		System.out.println("in a transient state?: " + emf.getPersistenceUnitUtil().getIdentifier(movie));
		//em.detach(movie);
		//movie.setReleaseYear(1988);
		//em.merge(movie);
		System.out.println("generated id:" + movie.getId());
		
		em.getTransaction().commit();
		System.out.println("================");
		
		// JPA find() method
		Movie returnedMovie = em.find(Movie.class, movie.getId());
		System.out.println("returned movie: " + returnedMovie);
		// get proxy to the entity
		//Movie movieRef = em.getReference(Movie.class, movie.getId());
		
		// JPA detach entity
		em.detach(returnedMovie);
		System.out.println("After detach: Is returnedMovie entity in a persistent state?: "
		+ em.contains(returnedMovie));
		

	}

}
