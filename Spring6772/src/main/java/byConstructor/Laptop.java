package byConstructor;

public class Laptop 
{
 String name;
 double price;
 
 Processor processor;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Processor getProcessor() {
	return processor;
}

public void setProcessor(Processor processor) {
	this.processor = processor;
}

public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}

public Laptop(Processor processor) 
{
	super();
	
	this.processor = processor;
	System.out.println("Inside Constructor");
}

@Override
public String toString() {
	return "Laptop [name=" + name + ", price=" + price + ", processor=" + processor + "]";
}
 
 
}
