package com.sanjay.chokiShop;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class inventory {
private static List<cart> products;
public inventory() {
this.products = new ArrayList<>();
    }
public static void addProduct(cust c) {
//products.add(product);
	Statement stmt;
	ResultSet rs;
	String qry=null;
	dbutil db=new dbutil();
	boolean sts=false;
	try
	{
		Connection con=db.getDBConnection();
		stmt=con.createStatement();
	    int count=stmt.executeUpdate("insert into customer(name,price,qty) values('"+c.getName()+"','"+c.getPrice()+"','"+c.getQty()+"')");
		System.out.println("INSERTED SUCCESFULLY");
    }
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
}
public static void updateProduct(cust c) {
/*if (index >= 0 && index <products.size()) {
products.set(index, updatedProduct);
        } else {
System.out.println("Invalid index. No product updated.");
        }
    }*/
	Statement stmt;
	ResultSet rs;
	String qry=null;
	dbutil db=new dbutil();
	boolean sts=false;
	try {
		Connection con=db.getDBConnection();
		con=db.getDBConnection();
		stmt=con.createStatement();
		int count = stmt.executeUpdate("UPDATE customer SET name='" + c.getName() + "', price=" + c.getPrice() + " WHERE id=" + c.getId()); 
		System.out.println("UPDATED SUCCESSFULLY");

	  }
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}
}
	
public static void removeProduct(String id) {
//if (index >= 0 && index <products.size()) {
//products.remove(index);
	 try

     {
      	   Statement stmt;
    	  // dbutil db = null;
      	  dbutil db=new dbutil();
		  Connection con=db.getDBConnection();
    	   stmt = con.createStatement();
    	   String qry=null;
    	  // String id;
		   int count = stmt.executeUpdate("delete from customer where id='"+id+"'");
    	     if(count==1)
    	     {    	    		  
    	    	 System.out.println("1 row is deleted");
    	   }
    	  else 
    	  {
    		  throw new Exception();
    	  }
    	  } catch(Exception ex)

    		  {
    			   System.out.println("No row is deleted");
    		  }
		  }
/*public cust findBrand(int qty) {
for (cust product : product) {
if (products.getQty() == qty) {
return products;
            }
        }
return null; 
    }*/
public static void showAllProducts()
{
	Statement stmt;
	ResultSet rs;
	String qry=null;
	dbutil db=new dbutil();
	Connection con;
	try
	{
		con=db.getDBConnection();
		stmt=con.createStatement();
		rs=stmt.executeQuery("select * from customer");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"    "+rs.getInt(3)+"    "+rs.getInt(4));
			
		}
	}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
/*{
for (cars product : products) {
System.out.println(product);
        }
    }*/
/*public List<cust>getProducts() {
return product;
    }
public List<cust> getBrand() {
	// TODO Auto-generated method stub
	return null;
}*/
}