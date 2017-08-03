package com.formation.springdata;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.formation.dataaccess.CompteRepository;
import com.formation.model.Compte;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		CompteRepository compterep = context.getBean(CompteRepository.class);
		for (int i = 0; i < 100; i++)
			compterep.save(new Compte(Integer.toString(i), "Adam" + Integer.toString(i), 100));
		Compte c = compterep.getByNumeroEquals("9");
		c.setProprietaire("hhhhhhh");
		compterep.save(c);
		System.out.println(c.getProprietaire());

	}
}
