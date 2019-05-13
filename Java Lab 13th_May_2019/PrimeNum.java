class PrimeNum{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int n = sc.nextInt();
		System.out.println("Prime Numbers:");
		PrimeNum pn = new PrimeNum();
		pn.primeSeries(n);

	}
	void primeSeries(int n)
	{
		for (int i=1; i<=n; i++ ) 
		{
			int counter = 0;
			for ( int j=1;j<=i ;j++ ) 
			{
				if (i%j==0) 
				{
					counter++;	
				}	
			}
			if (counter<=2) 
			{
				System.out.println(i);	
			}
		}
	}
}