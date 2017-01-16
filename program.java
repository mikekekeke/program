import java.util.Scanner;
public class program
{
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Hello");
		program program = new program();
		program.start();
	}
	public void start ()
	{
		int a = input("vuasia, enter pls 1 number: ");
		int b = input("vuasia, e brat, a ewe 2 number, pls: ");
		System.out.println("brat, vuot tvoja summa: " + sum(a, b));
	}
	public int sum (int a, int b)
	{
		return a + b;
	}
	public int input (String text)
	{
		System.out.print (text);
		return sc.nextInt();
	}
}



