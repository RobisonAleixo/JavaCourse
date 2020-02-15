package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus orderStatus;
	private Client client;
	private List<OrderItem> orderItens = new ArrayList<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

	// Constructor
	public Order() {
	}

	public Order(Date moment, OrderStatus orderStatus, Client client) {
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
	}

	// Get and Set
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItens() {
		return orderItens;
	}

	// Métodos

	public void addItem(OrderItem item) {
		orderItens.add(item);
	}

	public void removeItem(OrderItem item) {
		orderItens.remove(item);
	}

	public double total() {
		double sum = 0;
		for (OrderItem x : orderItens) {
			sum += x.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		double total = 0;
		
		sb.append("----------------------------------------\n");
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + orderStatus + "\n");
		sb.append("Client: " 
				+ client.getName() 
				+ " (" 
				+ sdf2.format(client.getBirthDate())
				+ ")" + " - "
				+ client.getEmail()	
				+ "\n\n");
		sb.append("Order items: \n");
		
		for(OrderItem x : orderItens) {
			sb.append(x.getProduct().getName()
					+ ", "
					+ "$" + x.getProduct().getPrice()
					+ ", "
					+ "Quantity: " + x.getQuantity()
					+ ", " 
					+ "Subtotal: $" + String.format("%.2f", x.subTotal())
					+ "\n"
					);
			total += x.subTotal();
		}
		
		sb.append("----------------------------------------\n");
		sb.append("Total price: $" + String.format("%.2f", total) + "\n");	
		sb.append("----------------------------------------\n");
		return sb.toString();
	}
}
