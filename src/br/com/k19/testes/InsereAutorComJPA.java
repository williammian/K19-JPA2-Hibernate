package br.com.k19.testes;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Autor;

public class InsereAutorComJPA {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("K21_livraria_pu");
		
		EntityManager manager = factory.createEntityManager();
		
		Autor novoAutor = new Autor();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do autor: ");
		novoAutor.setNome(scanner.nextLine());
		
		scanner.close();
		
		manager.getTransaction().begin();
		manager.persist(novoAutor);
		manager.getTransaction().commit();
		
		factory.close();
	}
	
}
