//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
}

class Bill
{
 public void display(int p,int q)
 {
   int r=q*p;
   System.out.println("Total Price is : "+r);
  //implement your logic to calculate total price
 }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    Scanner sc=new Scanner(System.in);
    String product=sc.next();
    int p=sc.nextInt();
    int q=sc.nextInt();
    obj.display(p,q);
  }
}