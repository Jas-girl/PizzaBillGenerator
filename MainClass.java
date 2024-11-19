package project;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("******** Pizza Bill Generator *****************");
	int value=0;
	do {
		System.out.println("          Which pizza wants \nChoose1:Base Pizza \nChoose2:Delux Pizza");
		value=sc.nextInt();
		boolean b = false;
		if(value<3 && value>0) {
			System.out.println("1Enter 'true' for veg pizza \nEnter 'false' for non-veg pizza");
			b=sc.nextBoolean();
		}
		switch(value) {
		case 1:
			Pizza p=new Pizza(b);
			int ch=0;
			do {
				System.out.println("Choose1:For extra cheese \nChoose2:For adding Toppings \nChoose3:TakeAway \nChoose4:For Bill");
				ch=sc.nextInt();
				switch(ch) {
				case 1:p.addExtraCheese();break;
				case 2:p.addTopping();break;
				case 3:p.TakeAway();break;
				case 4:p.bill();break;
				}
			}
			while(ch<4);break;
		case 2:
			DeluxPizza dp=new DeluxPizza(b);
			System.out.println("You want take away-true/false");
			boolean flag=sc.nextBoolean();
			if(flag==true) {
				dp.TakeAway();
			}
			dp.bill();break;
		case 3:
			System.out.println("pizza is not available");
			System.out.println("end");
		}
			
		
	}
	while(value<3);
}
}
