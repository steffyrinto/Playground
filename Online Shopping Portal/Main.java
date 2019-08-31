public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
		Customers c=new Customers("Saakshi",9000000000L);
		Customers c1=new Customers("Rahul",9000000001L);
		Suppliers d=new Suppliers("ABC Traders",8000000000L);
		Suppliers d1=new Suppliers("XYZ Enterprises",8000000900L);
		Customers c2=new Customers("Saakshi","Bangalore");
		Customers c3=new Customers("Saakshi","Coimbatore");
		Suppliers d2=new Suppliers("ABC Traders","Mumbai");
		Suppliers d3=new Suppliers("ABC Traders","Delhi");
		Customers c4=new Customers();
		Customers c5=new Customers("ABC Traders",15);	
		Suppliers d5=new Suppliers("XYZ Enterprises",17);
		c.displayprofile();
		c1.displayprofile();
		d.displayprofile();
		d1.displayprofile();
		c2.editAddress();
		c3.editAddress(); 
		d2.editAddress();
		d3.editAddress();
		c4.placeOrder();
		c5.increaseStock();
		d5.increaseStock();

		
	}	
}

class Users {
		//write the logic for the class Users
	int id;
	String name;
	long mobileNumber;
	String address;
	int num;
	
}

class Customers extends Users{
		
		public Customers(String name, long mobileNumber) {
		// TODO Auto-generated constructor stub
			this.name=name;
			this.mobileNumber=mobileNumber;
	}
			
	
		//write the logic for the class Customers
	
	public void displayprofile()
	{
		System.out.println(name+", "+mobileNumber);
	}
	public Customers(String name,String address)
	{
		this.name=name;
		this.address=address;
		
	}

	public void editAddress()
	{
		System.out.println(name+", "+address);
	}
	
	public void placeOrder()
	{
		System.out.println("Order placed successfully!");
	}
	public Customers(String name,int num)
	{
		this.name=name;
		this.num=num;
	}

public Customers() {
		// TODO Auto-generated constructor stub
	}


public void increaseStock() {
	System.out.println(name+", "+num);
	// TODO Auto-generated constructor stub
}}


class Suppliers extends Users {
	public Suppliers(String name,long mobileNumber)
	{
		this.name=name;
		this.mobileNumber=mobileNumber;
	}
		//write the logic for the class Suppliers
	public void displayprofile()
	{
		System.out.println(name+", "+mobileNumber);
		
	}
	public Suppliers(String name,String address)
	{
		this.name=name;
		this.address=address;
		
	}
	public void editAddress()
	{
		System.out.println(name+", "+address);
	}
	public Suppliers(String name,int num)
	{
		this.name=name;
		this.num=num;
	}


public void increaseStock() {
	System.out.println(name+", "+num);
	// TODO Auto-generated constructor stub
}
}
