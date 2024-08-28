import java.util.Scanner;
public class IT24102375Lab5Q1
{
public static void main(String[] args)
  {
  Scanner R=new Scanner(System.in);
  System.out.println("enter the first integer"); 
  int a=R.nextInt();
  System.out.println("enter the second integer");
  int b=R.nextInt();
  System.out.println("enter the third integer");
  int c=R.nextInt();
  System.out.print(a);
  System.out.print("\t");
  System.out.print(b);
  System.out.print("\t");
  System.out.println(c);
  int min=a;
  int max=a;
  if(a>b)
  min=b;
  if(b>a)
  max=b;
  if(a>c)
  min=c;
  if(c>a)
  max=c;
  System.out.println("minium number is: "+min);
  System.out.println("maximum number is: "+max);

  }
}