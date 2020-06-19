package com.timewise.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.timewise.main.Domain.Customer;
import com.timewise.main.Repository.CustomerRepository;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository repo) {
		return (args -> {

			repo.save(new Customer("Mike", "Wilson"));
			repo.save(new Customer("Sarah", "Jones"));
			repo.save(new Customer("Zach", "Peters"));
			repo.save(new Customer("Melissa", "Hagarty"));

			log.info("Customers added to table");
			log.info("=========================");

			for (Customer customer : repo.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			repo.findById(1L).ifPresent(customer -> {
				log.info("Customers found by id");
				log.info("=========================");
				log.info(customer.toString());
				log.info("");
			});
			log.info("Customers found by last name");
			log.info("=========================");
			repo.findByLastName("Wood").forEach(item -> {
				log.info(item.toString());

			});
			log.info("");
		});
	}

	@Bean
	ApplicationRunner applicationRunner(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(new Customer("Chris", "Wood"));
			customerRepository.findAll();
		};
	}
}
