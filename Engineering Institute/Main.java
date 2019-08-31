//import required packages
import java.util.Scanner;

class Faculty
{
  public void salary(int a)
  {
    //write your Faculty class statements
	  System.out.println("Base Salary: "+a);
  }
}
class CSE extends Faculty 
{
  public void salary(int a)
  {
    //write your CSE class statements
	  System.out.println("CSE Faculty: "+(a+3000));
  }
}
class IT extends CSE
{
  public void salary(int a)
  {
    //write your IT class statements
	  System.out.println("IT Faculty: "+(a+5000));
  }
}
class ECE extends IT
{
	
	
  public void salary(int a)
  {
    //write your ECE class statements
	  
	  System.out.println("ECE Faculty: "+(a+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
       //implement your required concept here
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a>0)
    {
    	Faculty a1=new Faculty();
    	a1.salary(a);
    	CSE a2=new CSE();
    	a2.salary(a);
    	IT a3=new IT();
    	a3.salary(a);
    	ECE a4 = new ECE();
    	a4.salary(a);
    }
    else
    {
    	System.out.println("NULL");
    }
  }
}