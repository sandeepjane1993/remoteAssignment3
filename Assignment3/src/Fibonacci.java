
public class Fibonacci {

	public static void main(String[] args) {

			Fibonacci obj = new Fibonacci();
			obj.fibo(8);
			System.out.println();
			System.out.println("nth term in fibonacci - "+obj.fiboRecursion(8));
			System.out.println("prime - "+ obj.primeNumber(37));
			System.out.println("palindrome - "+obj.palindrome("454"));
			System.out.println("factorial - "+obj.factorial(7));
			System.out.println("armstrong - "+obj.armstrong(371));
	}
	/*fibonacci series*/
	public void fibo(int input)
	{
		int prev=0,next=1,current=0;
		for(int i =0;i<input;i++)
		{
			System.out.print(current +"  ");
			current = prev+next;
			next = prev;
			prev=current;
		}
	}
	/*fibonacci recursion*/
	public int fiboRecursion(int input)
	{
		if(input<=1)
		{
			return input;
		}
		else
			return (fiboRecursion(input-2)+fiboRecursion(input-1));
	}

	//checking prime or not
	public boolean primeNumber(int input)
	{
		if(input<2)
		{
			return false;
		}
		for(int i=2;i<Math.sqrt(input);i++)
		{
			if(input%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	// check if a number or word is palindrome
	public boolean palindrome(String input)
	{
		
		String reverse="";
		for(int i = input.length()-1;i>=0;i--)
		{
			reverse = reverse + input.charAt(i);
		}
		if(reverse.equals(input)) {
		return true;}
		else
			return false;
	}
	//printing factorial of a number
	public int factorial(int input)
	{
		int fact =1;
		for(int i = input;i>=1;i--)
		{
			fact = fact*i;
		}
		return fact;
	}
	//check if number is armstrong number or not
	public boolean armstrong(int input)
	{
		int temp = input;
		int res =0;
		while(input>0)
		{
			int r = input%10;
			res = res+(r*r*r);
			input=input/10;
		}
		if(res==temp)
		{
			return true;
		}
		else
			return false;
	}
}







