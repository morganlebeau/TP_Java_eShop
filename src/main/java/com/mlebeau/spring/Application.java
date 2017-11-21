/**
 * 
 */
package com.mlebeau.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mlebeau.spring.entity.Customer;
import com.mlebeau.spring.entity.Product;
import com.mlebeau.spring.Application;
import com.mlebeau.spring.repository.CustomerRepository;
import com.mlebeau.spring.repository.ProductRepository;

/**
 * @author MLEBEA
 *
 */
@SpringBootApplication
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}
	
	@Bean
	public CommandLineRunner CustomerLnR(CustomerRepository repository) {
		return (args) -> {
			repository.save(new Customer("Bauer", "Jack"));
			repository.save(new Customer("O'Brian", "Chloe"));
			repository.save(new Customer("Bauer", "Kim"));
			repository.save(new Customer("Palmer", "David"));
			repository.save(new Customer("Dessler", "Michelle"));
		};
	}
	
	@Bean
	public CommandLineRunner ProductLnR(ProductRepository repository) {
		return (args) -> {
			repository.save(new Product("Pomme"));
			repository.save(new Product("Banane"));
			repository.save(new Product("Poire"));
			repository.save(new Product("Abricot"));
			repository.save(new Product("Papaye"));
		};
	}
	
}
