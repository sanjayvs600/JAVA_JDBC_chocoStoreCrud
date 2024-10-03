package com.sanjay.chokiShop;
import java.util.*;
public class main1 {
	public static void main(String[] args) {
		cust c=new cust();
		inventory inv=new inventory();
		Scanner sc=new Scanner(System.in);
		String id;
		System.out.println("****************  Welcome to chocolate shop  ***************");
		System.out.println("1.ADD\n2.UPDATE\n4.REMOVE\n5.SHOW\n6.EXIT");
		int opt=sc.nextInt();
		do {
		switch(opt) {
		case 1:
	c=new cust();
//		c.setName(sc.next()+sc.nextLine());
//		c.setBrand(sc.next()+sc.nextLine());
//		c.setId(sc.next()+sc.nextLine());
//		c.setQty(sc.nextInt());
//		c.setPrice(sc.nextFloat());
//		inv.add(c);
//		break;
			System.out.print("Enter id : ");

			c.setId(sc.nextInt());

			sc.nextLine(); 

			System.out.print("Enter name: ");

			c.setName(sc.nextLine());

			System.out.print("Enter price: ");

			c.setPrice(sc.nextInt());

			sc.nextLine(); 

			System.out.print("Enter qty: ");

			c.setQty(sc.nextInt());

			sc.nextLine(); 

			inv.addProduct(c);

			break;
		case 2:
//		id=sc.next()+sc.nextLine();
//		c=inv.search(id);
//		c.setName(sc.next()+sc.nextLine());
//		inv.update();
//		break;
			System.out.println("Enter ID to Update the product");

			int caridupdate=sc.nextInt();

			c.setId(caridupdate);

			System.out.println("Enter the records to update");
//String up;
//			up=sc.next(); 
//             c.setPrice(up);
			System.out.print("Enter name: ");
			sc.nextLine();
             String upname=sc.nextLine();
			c.setName(upname);

			System.out.print("Enter price: ");
			
            float upprice=sc.nextFloat();
            c.setPrice(upprice);
			inv.updateProduct(c);

			
		break;
//		case 3:
//		id=sc.next()+sc.nextLine();
//		c=inv.search(id);
//		System.out.println("ID: "+c.getId());
//		System.out.println("NAME: "+c.getName());
//		System.out.println("QTY: "+c.getQty());
//		System.out.println("PRICE: "+c.getPrice());
//	//	System.out.println("Brand: "+c.getBrand());
//		break;
		case 4:
		id=sc.next()+sc.nextLine();
		inv.removeProduct(id);
		break;
		case 5:
			inventory.showAllProducts();
		break;
		}
		System.out.println("1.ADD\n2.UPDATE\n4.REMOVE\n5.SHOW\n6.EXIT");
		opt=sc.nextInt();
		}while(opt!=6);
		}

}