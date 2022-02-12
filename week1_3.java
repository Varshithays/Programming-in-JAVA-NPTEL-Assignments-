//Complete the code segment to check whether the number is an Armstrong number or not.
//Armstrong Number:
//A positive number is called an Armstrong number if it is equal to the sum of cubes of its digits for example 153 = 13+53+33, 370, 371, 407, etc.
import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
//Use while loop check the number is Armstrong or not.
int count=n;
int c=0,v;
	while(n>0)
    {
      v=n%10;
      n=n/10;
      c=c+(v*v*v);
    }
//store the output(1 or 0) in result variable.
if(count==c)
  result=1;
else
  result=0;
System.out.println(result);



 }
}
