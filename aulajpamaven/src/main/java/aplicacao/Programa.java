package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		/*Instância e salva os itens na base de dados(já foram salvos pode excluir)
		Pessoa p1 = new Pessoa(null ,"Claúdio da Silva", "claudio@gmail.com");
		Pessoa p2 = new Pessoa(null, "Carla Prado", "carlaP@gmail.com");
		Pessoa p3 = new Pessoa(null, "Paula Santos", "paula@gmail.com");
		*/
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*Bloco que salva os dados no BD(roda só uma vez e já são salvos).
		em.getTransaction().begin();
		//inserção
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();*/
		
		//busca uma pessoa pelo ID (passo 1)
		Pessoa p = em.find(Pessoa.class, 2);
		
		//maneira correta de excluir dados (passo 1 -> passo2)
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Feito");
		em.close();
		emf.close();
	}
}
