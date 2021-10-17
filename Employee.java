public class Employee {
    public static void main(String[] args){
       String [] name = new String[3];
       int [] yoj = new int[3];
       String [] city = new String[3];
       Scanner sc= new Scanner (System.in);
       for (int i=0;i<3;i++){
        System.out.println("Enter employee "+(i+1)+" details :");
        System.out.println("Enter name - ");
        name[i] = sc.nextLine();
        System.out.println("Enter year of joining - ");
        yoj[i]=sc.nextInt();
        System.out.println("Enter Address - ");
        city[i] = sc.nextLine();
    }
       System.out.println("Name\tYearOfJoining\tAddress");
       for (int i=0;i<3;i++){
           System.out.println(name[i]+"\t"+yoj[i]+"\t"+city[i]);
       }
    }
}
