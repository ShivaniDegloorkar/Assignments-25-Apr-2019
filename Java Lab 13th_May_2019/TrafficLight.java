class TrafficLight
{
	public static void main(String[] args) {
		System.out.println("Enter one of the choices:");
		System.out.println("1.Red \n2.Yellow \n3.Green");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1: System.out.println("STOP"); break;
			case 2: System.out.println("READY"); break;
			case 3: System.out.println("GO"); break;
			default: System.out.println("Enter appropriate choice");
		}
	}
}