package com.danielcampos.desafio01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.danielcampos.desafio01.entities.Order;
import com.danielcampos.desafio01.services.OrderService;



@SpringBootApplication
public class Desafio01Application implements CommandLineRunner{

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println();
		// Entrada 01
		Order order1 = new Order(1034, 150.00, 20.0);
		// Saída 01
		System.out.println("Pedido código " + order1.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order1));
		System.out.println();

		// Entrada 02
		Order order2 = new Order(2282, 800.00, 10.0);
		// Saída 02
		System.out.println("Pedido código " + order2.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order2));
		System.out.println();

		// Entrada 03
		Order order3 = new Order(1309, 95.90, 0.0);
		// Saída 03
		System.out.println("Pedido código " + order3.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order3));
	}

}
