import java.util.Scanner;
 
class Test{
public static vooid main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a value ");
int num = sc.nextInt();
boolean isPrime = true;
for(int i = 2;i<num;i++){
if(num%i==0)
{
isPrime = false;
break;
}
}
if(isPrime){
System.out.println(num+ "  Is a prime number");
}
else
{
System.out.println(num+ "  Is not a prime number");
}
}
