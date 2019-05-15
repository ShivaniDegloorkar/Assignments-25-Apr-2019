class CustomSortingByComparator{
    static java.util.List list;
    public static void main(String[] args) {
        list = new java.util.ArrayList();
 
        list.add(new Employee(1, 25, "Shivani Waghade", "Banglore"));
        list.add(new Employee(2, 23, "Vyshnavi Gadiparthi", "Chennai"));
        list.add(new Employee(3, 22, "Shivani Degloorkar", "Hyderabad"));
 
        int flag = 0;
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while(flag == 0)
        {
            try{
                System.out.println("Enter your choice: ");
                System.out.println("1.Add Employee \n2. Sort");
                int choice3 = sc.nextInt();
                switch(choice3)
                {
                    case 1:
                        System.out.println("Enter Employee details: ");
                        System.out.println("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Employee Name: ");
                        String name = sc.nextLine();
                        System.out.println("Enter Employee Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter Employee Address: ");
                        String add = sc.nextLine();
                        list.add(new Employee(id,age,name,add));

                        System.out.println("Want to add more employees ? \n1. Yes \n2. No");
                        int choice = sc.nextInt();
                        if(choice == 1)
                         break;
                        else {
                            flag = 1;
                            break;
                        }

                
                    case 2: 
                        System.out.println("Enter parameter on which you want to sort: ");
                        System.out.println("1. ID \n2.Age 3.Address \n4.First Name \n5.Last Name \n");
                        sc.nextLine();
                        int choice2 = sc.nextInt();
                        switch(choice2)
                        {
                            case 1:
                                java.util.Collections.sort(list, new SortByID());
                                System.out.println(list);
                                break;
                            case 2:
                                java.util.Collections.sort(list, new SortByAge());
                                System.out.println(list);
                                break; 
                            case 3:
                                java.util.Collections.sort(list, new SortByAddress());
                                System.out.println(list);
                                break;        
                            case 4:
                                java.util.Collections.sort(list, new SortByFirstName());
                                System.out.println(list);
                                break;
                            case 5:
                                java.util.Collections.sort(list, new SortByLastName());
                                System.out.println(list);
                                break;
                           
                            default:
                                System.out.println("Enter appropriate choice");            
                         }
                    break;
                
                    default : 
                        System.out.println("Enter appropriate choice");
                        break;
                }

            }
            
            

            catch(Exception e)
            {
                System.out.println("Enter input in correct format"+e);
                sc.nextLine();
            }

        }
    }
}
 
class Employee{
    private Integer empID, age;
    private String []empNameArr;
    private String empName,firstName, lastName, empAddress;
 
    Employee(Integer empID, Integer age, String empName, String empAddress){
        this.empID = empID;
        this.empAddress = empAddress;
        this.age = age;
        this.empName = empName;
        

        try
        {
                System.out.println("splitting name");
                empNameArr = empName.split("\\s"); 
                firstName = empNameArr[0];
                lastName = empNameArr[1];
                System.out.println(firstName+" "+lastName);
            
        }catch(Exception e)
        {
           System.out.println("Enter valid Employee Name");
        }
    }
 
    @Override
    public String toString(){
        return "Employee ID: " + this.empID + "\nAge : " + this.age+"\n Name: "+empName+"\nAddress: "+empAddress;
    }
 
    //Getters
    public String getFirstName(){
        return this.firstName;
    }
 
    public String getLastName(){
        return this.lastName;
    }

    public String getEmpAddress(){
        return this.empAddress;
    }
 
    public Integer getEmpID(){
        return this.empID;
    }

    public Integer getAge(){
        return this.age;
    }
 
 
 
}
 

class SortByFirstName implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
        return ((Employee)firstObject).getFirstName().compareTo(((Employee)secondObject).getFirstName()); 
    }
}

class SortByLastName implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
        return ((Employee)firstObject).getLastName().compareTo(((Employee)secondObject).getLastName()); 
    }
}
 
class SortByID implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
        return ((Employee)firstObject).getEmpID().compareTo(((Employee)secondObject).getEmpID());   
    }
}
 
class SortByAge implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
        return ((Employee)firstObject).getAge().compareTo(((Employee)secondObject).getAge());   
    }
}

class SortByAddress implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
        return ((Employee)firstObject).getEmpAddress().compareTo(((Employee)secondObject).getEmpAddress()); 
    }
}