package model.entities;

import java.time.LocalDateTime;

public class CarRental {
	
	private LocalDateTime start;
	private LocalDateTime finish;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental() {	
	}
	//A fatura, quando se cria o aluguel, ainda não existe. Então, ao instanciar o CarRental, não passe o invoice, que daí ele vai ficar null.
	//como a fatura (invoice) ainda não existe, tem q instanciar o CarRental sem passar o invoice 
	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
	}
	
	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}
