package entities;

public class Product {
	private String name;
	private String email;
	private int room;
	
	public Product() {
		
	}
	public Product(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public int getRoom() {
		return room;
	}
	
	public String toString() {
		return name + ", " + email;
	}
}
