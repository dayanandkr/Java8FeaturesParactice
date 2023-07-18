package PredicateEx;

public class Car {
	
	private String name;
	private String color;
	private long price;
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public long getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Car(String name, String color, long price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	

}
