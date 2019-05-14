import java.util.ArrayList;
class Laptop
{
    private Integer ramSize, hddSize, id;
    private String brand;
 
    Laptop(int id, int ramSize, int hddSize, String brand ){
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.brand = brand;
        this.id = id;
    }
 
    //Creating the getters
    public Integer getRamSize(){
        return this.ramSize;
    }
 	public Integer getID(){
        return this.id;
    }
    public Integer getHddSize(){
        return this.hddSize;
    }
 
    public String getBrand(){
        return this.brand;
    }

    public void setRamSize(int ramSize){
        this.ramSize = ramSize;
    }
 	public void setID(int id){
        this.id = id;
    }
    public void setHddSize(int hddSize){
        this.hddSize = hddSize;
    }
 
    public void setBrand(String brand){
        this.brand = brand;
    }


}
 
class APICollectionDemo
{
	static ArrayList list;
    public static void main(String[] args) {
        list = new ArrayList();
 
        Laptop l1 = new Laptop(101, 8, 600, "Lenovo");
 
        //Store a Laptop object in the list
        list.add(new Laptop(102,4, 500, "IBM"));
        list.add(new Laptop(103,8, 800, "IBM"));
        list.add(new Laptop(104,6, 500, "Sony"));
 
        list.add(l1);
        int flag = 0;
        while(flag == 0)
        {
        	System.out.println("Enter choice of operation: ");
        	System.out.println("1. Enter a new Laptop\n2. View all laptop details\n3. Search for a laptop\n4. Delete a laptop\n5. Update Laptop details\n6. Exit");
        	java.util.Scanner sc = new java.util.Scanner(System.in);  
        	
        	APICollectionDemo cd = new APICollectionDemo();
        	try{
        	int choice = sc.nextInt();
        	switch(choice)
        	{
        		case 1:
        			cd.addItem();
        			break;
        		case 2:
        			cd.viewAll();
        			break;
        		case 3:
        			cd.search();
        			break;
        		case 4:
        			cd.delete();
        			break;
        		case 5:
        			cd.update();
        			break;
        		case 6:
        			flag = 1;
        			break;
        		default:
        			System.out.println("Enter appropriate choice");						
        	}
        }catch(Exception e)
        	{
        		System.out.println("Enter appropriate choice as number");
        	}
        }
}
        public void addItem()
        {
        	java.util.Scanner sc = new java.util.Scanner(System.in); 
        	System.out.println("Enter ID");
        	int id = sc.nextInt();
        	sc.nextLine();
        	System.out.println("Enter RAM Size ");
        	int ramSize = sc.nextInt();
        	sc.nextLine();
        	System.out.println("Enter HDD Size ");
        	int hdd = sc.nextInt();
        	sc.nextLine();
        	System.out.println("Enter Company Name ");
        	String companyName = sc.nextLine();
        	int flag = 0;
        	for(Object ref: list)
        	{
        				if(((Laptop)ref).getID().equals(id))
        				{
        					System.out.println("ID cannot match with previous one ");
        					flag = 1;
        					break;
						}
			}

			if(flag == 0)
        		list.add(new Laptop(id,ramSize,hdd,companyName));
        }

        public void viewAll()
        {
        	for(Object ref: list)
        	{
        		System.out.println("ID : " + ((Laptop)ref).getID());
        		System.out.println("Ram : " + ((Laptop)ref).getRamSize());
				System.out.println("HDD Size : " + ((Laptop)ref).getHddSize());
				System.out.println("Brand : " + ((Laptop)ref).getBrand());
        	}
        }

        public void search()
        {
        	System.out.println("Enter choice of search: ");
        	System.out.println("1. Search by ID\n2. Search by Brand name\n3. Search by RAM Size\n4. Search by HDD size");
        	java.util.Scanner sc = new java.util.Scanner(System.in);  
        	int choice = sc.nextInt();
        	sc.nextLine();
        	int flag = 0;
        	try{
        	switch(choice)
        	{
        		case 1:
        			System.out.println("Enter ID you want to search");
        			int id = sc.nextInt();
        			sc.nextLine();
        			
        			for(Object ref: list)
        			{
        				if(((Laptop)ref).getID().equals(id))
        				{
        					System.out.println("ID : " + ((Laptop)ref).getID());
        					System.out.println("Ram : " + ((Laptop)ref).getRamSize());
							System.out.println("HDD Size : " + ((Laptop)ref).getHddSize());
							System.out.println("Brand : " + ((Laptop)ref).getBrand());
							flag = 1;
						}
					}

					if(flag == 0)
						System.out.println("Sorry Entry not found");
        			break;
        		case 2:
        			System.out.println("Enter Brand Name you want to search");
        			String brand = sc.nextLine();
        			for(Object ref: list)
        			{
        				if(((Laptop)ref).getBrand().equalsIgnoreCase(brand))
        				{
        					System.out.println("ID : " + ((Laptop)ref).getID());
        					System.out.println("Ram : " + ((Laptop)ref).getRamSize());
							System.out.println("HDD Size : " + ((Laptop)ref).getHddSize());
							System.out.println("Brand : " + ((Laptop)ref).getBrand());
							flag =1;
						}
					}
					if(flag == 0)
						System.out.println("Sorry Entry not found");
        			break;
        		case 3:
        			System.out.println("Enter Ram size you want to search");
        			int ram = sc.nextInt();
        			sc.nextLine();
        			for(Object ref: list)
        			{
        				if(((Laptop)ref).getRamSize().equals(ram))
        				{
        					System.out.println("ID : " + ((Laptop)ref).getID());
        					System.out.println("Ram : " + ((Laptop)ref).getRamSize());
							System.out.println("HDD Size : " + ((Laptop)ref).getHddSize());
							System.out.println("Brand : " + ((Laptop)ref).getBrand());
							flag =1;
						}
					}
					if(flag == 0)
						System.out.println("Sorry Entry not found");
        			break;
        		case 4:
        			System.out.println("Enter HDD Size you want to search");
        			int hdd = sc.nextInt();
        			sc.nextLine();
        			for(Object ref: list)
        			{
        				if(((Laptop)ref).getHddSize().equals(hdd))
        				{
        					System.out.println("ID : " + ((Laptop)ref).getID());
        					System.out.println("Ram : " + ((Laptop)ref).getRamSize());
							System.out.println("HDD Size : " + ((Laptop)ref).getHddSize());
							System.out.println("Brand : " + ((Laptop)ref).getBrand());
							flag =1;
						}
					}
					if(flag == 0)
						System.out.println("Sorry Entry not found");
        			break;
        		   default: System.out.println("Enter appropriate choice");	
        	}
        	}catch(Exception e)
        	{
        		System.out.println("Enter appropriate choice");
        	}
        }

        public void delete()
        {
        	java.util.Scanner sc = new java.util.Scanner(System.in); 
        	for(Object ref: list)
        	{
        		System.out.println("ID : " + ((Laptop)ref).getID());
				System.out.println("Brand : " + ((Laptop)ref).getBrand());
        	}
        	System.out.println("Enter ID you want to delete");
        	int id = sc.nextInt();
        	sc.nextLine();
        	int flag = 0;
        	for(Object ref: list)
        	{
        		if(((Laptop)ref).getID().equals(id))
        		{
        			System.out.println(list.remove(ref));
        			System.out.println("Item Removed");
        			flag = 1;
        			break;
				}
			}
			if(flag ==0)
				System.out.println("Sorry entry not found");

        }

        public void update()
        {
        	java.util.Scanner sc = new java.util.Scanner(System.in); 
        	for(Object ref: list)
        	{
        		System.out.println("ID : " + ((Laptop)ref).getID());
				System.out.println("Brand : " + ((Laptop)ref).getBrand());
        	}
        	System.out.println("Enter ID you want to update");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter which field you want to update: ");
        	System.out.println("1. ID\n2. Brand name\n3. RAM Size\n4. HDD size");
        	int flag =0;
        	Object reference = null;
        	for(Object ref: list)
        			{
        				if(((Laptop)ref).getID().equals(id))
        				{
        					reference = ref;
        					flag = 1;
						}
					}
			if(flag == 1){
			try{
			int choice = sc.nextInt();	
			sc.nextLine();	
        	switch(choice)
        	{
        		case 1:
        			System.out.println("Enter ID you want to update to");
					int id1 = sc.nextInt();
					sc.nextLine();
					for(Object ref: list)
        			{
        				if(((Laptop)ref).getID().equals(id))
        				{
        					System.out.println("ID already exists");
						}
						else
						{
							((Laptop)reference).setID(id1);
						}
					}
					
					break;
					
				case 2:
        			System.out.println("Enter brand name you want to update to");
					String brand = sc.nextLine();
					((Laptop)reference).setBrand(brand);
					break;	

				case 3:
					System.out.println("Enter RAM size you want to update to");
					int ram = sc.nextInt();
					sc.nextLine();
					((Laptop)reference).setRamSize(ram);
					break;
				case 4:
					System.out.println("Enter HDD size you want to update to");
					int hdd = sc.nextInt();
					sc.nextLine();
					((Laptop)reference).setHddSize(hdd);
					break;	
        	}
        }catch(Exception e)
        {
        	System.out.println("Enter appropriate choice");
        }
    }
        else
        {
        	System.out.println("Sorry entry not found");
        }
        }
 
		

}