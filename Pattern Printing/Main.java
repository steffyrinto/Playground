import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i>0;i--)
		{
			for(int j=b;j>0;j--)
			{
				if(i<=j) 
				{
					System.out.print(j);
				}
				else
				{
				System.out.print(i);
				}
							
			}
			System.out.println();}
    }
}