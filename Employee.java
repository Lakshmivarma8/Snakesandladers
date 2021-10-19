class Employee
{
    String name,city; 
    int yoj;
    
    public void getEmpInfo(String name, String city,int yoj)
    {
        this.name = name;
        this.city = city;
        this.yoj = yoj;          
    }
    
    public void printEmpInfo()
    {
        System.out.println(name  + "\t\t" + city  + "\t\t" +yoj );  
    }

    public static void main(String[] args){
        String [] name = new String[3];
        int [] yoj = new int[3];
        String [] city = new String[10];
        Scanner sc= new Scanner(System.in);
       for (int i = 0; i <3; i++)
        {  
            System.out.println("\nEnter Employee " +(i+1)+" Details: ");
            System.out.println("Enter the name of Employee: ");
            name[i]=sc.nextLine();
            System.out.println("Enter Year of Joining: ");
            yoj[i]=sc.nextInt();
            System.out.println("Enter City: ");
            sc.nextLine();
            city[i]=sc.nextLine();
        }
      
        Employee em1 = new Employee(); 
        em1.getEmpInfo(name[0],city[0], yoj[0]);
        
        Employee em2 = new Employee();
        em2.getEmpInfo(name[1],city[1], yoj[1]);
       
        Employee em3 = new Employee(); 
        em3.getEmpInfo(name[2],city[2], yoj[2]);
        
        System.out.println("Name \t\tAddress \t\tYear Of Joining");
        em1.printEmpInfo();
        em2.printEmpInfo();
        em3.printEmpInfo();

}
}
