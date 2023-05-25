package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class ProgramOrder {
	
	public static void main(String[] args) {
		
		// padrão java - converte enum em string
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT); //new Date() instante - data.
		
		System.out.println(order);
		
		//conversão de string para enum: Order order = OrderStatus.valueOf("PENDING_PAYMENT);
		
	}

}
