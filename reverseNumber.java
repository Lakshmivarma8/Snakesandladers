public class reverseNumber {
    public static void main(String[] args)   {  
        int reverse = 0;  
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente a number : ");
        int number=sc.nextInt();
        while(number != 0)   
        {  
            int remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10;  
        }  
        System.out.println("The reverse of the given number is: " + reverse);  
}  
    
}
