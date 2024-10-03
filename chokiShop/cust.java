package com.sanjay.chokiShop;

	public class cust implements Comparable <cust>{
		String name;
		//String brand;
		int qty;
		float price;
		int Id;
		/*public cust(String brand, String name, int qty, float price, String id) {
			this.name = name;
			this.brand = brand;
			this.qty = qty;
			this.price = price;
			this.Id = id;
		}*/
		public String toString() {
			return this.name+" "+this.Id+" "+this.name+" "+this.qty+" "+this.price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	//	public String getBrand() {
		//	return brand;
		//}
		//public void setBrand(String brand) {
			//this.brand = brand;
		//}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public int getId() {
			return Id;
		}
		
		public void setId(int id) {
			this.Id = id;
		}
		public int compareTo(cust c) {
			return (this.name).compareTo(c.name);
		}
		public void setPrice(String next) {
			// TODO Auto-generated method stub
			
		}
			
		}
	