package project;

public class Pizza {
protected boolean veg=true;
protected float price;
private boolean addCheese;
private boolean addTop;
private boolean take;
public Pizza() {
	
}
public Pizza(boolean veg) {
	super();
	if(veg) {
		this.veg=veg;
		setVeg(this.veg);
		this.price = 300;
		System.out.println("Price of pizza"+this.price);
	}
	else if(!veg) {
		this.veg=veg;
		setVeg(this.veg);
		this.price=400;
		System.out.println("Price of pizza"+this.price);
	}	
}

public boolean isVeg() {
	return veg;
}
public void setVeg(boolean veg) {
	if(veg) {
		System.out.println("Veg Pizza");
	}
	else {
		System.out.println("Non-Veg Pizza");
	}
	
}
public float getPrice() {
	return price;
}
public void addExtraCheese() {
	addCheese=true;
	System.out.println("cheese Rs:"+100);
	
}
public void addTopping() {
	addTop=true;
	System.out.println("topping Rs:"+100);
	
}
public void TakeAway() {
	take=true;
	System.out.println("Rs:"+50);
	
}
public void bill() {
	System.out.println("\t\tBill\t\t");
	if(addCheese==true) {
		System.out.print("Cheese is added ");addExtraCheese();
		this.price= this.price+100;
	}
	if(addTop==true) {
		System.out.print("Toppings are added ");addTopping();
		this.price=this.price+100;
	}
	if(take==true) {
		System.out.print("Take Away ");TakeAway();
		this.price=this.price+50;
	}
	System.out.println("           Bill:"+this.price);
	System.out.println("****************************************************");
	
}
@Override
public String toString() {
	return "Pizza [veg=" + veg + ", price=" + price + "]";
}




}
