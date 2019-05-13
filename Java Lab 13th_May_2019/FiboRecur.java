class FiboRecur{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n = sc.nextInt();
		FiboRecur fb = new FiboRecur();
		System.out.println("Nth term: "+ fb.fibo(n));
		
		System.out.println("Using Recursion:");
		System.out.println(fb.fiboRec(n));


	}
	int fibo(int n)
	{
		int f1=0; int f2=1; int f3=0;
		for (int i=1;i<n; i++ ) 
		{
				
				f3=f1+f2;
				f1=f2;
				f2=f3;
				//System.out.println(f2);
		}
		return f3;
	}
	int fiboRec(int n)
	{
		if (n==1 || n==2) 
		{
			return 1;
		}
		else {
			return fiboRec(n-1)+fiboRec(n-2);
	
	}
}
}