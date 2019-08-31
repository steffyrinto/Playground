import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
      //Try your code here
      Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		int c=sc.nextInt();
		String d=a.replace(a,b);
		String arr[]=b.split(" ", c);
		for (String string : arr) {
			System.out.println(string);
		}

    }
}