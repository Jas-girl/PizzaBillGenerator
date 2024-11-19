package project;

public class DeluxPizza extends Pizza {
public DeluxPizza(boolean veg) {
	super();
	if(veg) {
		super.veg=veg;
		setVeg(this.veg);
		super.price = 300;
		System.out.println("Price of pizza"+this.price);
	}
	else if(!veg) {
		this.veg=veg;
		setVeg(this.veg);
		this.price=400;
		System.out.println("Price of pizza"+this.price);
	}	
	super.addExtraCheese();
	super.addTopping();
}
}
