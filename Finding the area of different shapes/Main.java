import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      double PI=3.14d;
      switch(a)
      {
        case 1:
          int s=sc.nextInt();
          System.out.println(s*s);
          break;
        case 2:
          int l=sc.nextInt();
          int b=sc.nextInt();
          System.out.println(l*b);
          break;
        case 3:
          int c=sc.nextInt();
          int d=sc.nextInt();
          System.out.println(c*d/2);
          break;
        case 4:
          int r=sc.nextInt();
          System.out.println(PI*r*r);
          break;
      }

    }
}