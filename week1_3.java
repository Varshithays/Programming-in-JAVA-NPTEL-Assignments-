/*Consider First n even numbers starting from zero(0).Complete the code segment to calculate sum of  all the numbers divisible by 3 from 0 to n. Print the sum.
Example:
Input: n = 5
-------
0 2 4 6 8
Even number divisible by 3:0 6
sum:6*/

import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
//Use for or while loop do the operation.
int res=1;
int  i =0;
while(res<=n)
{
  if(i%2==0)
  {
    if(i%3==0)
    {
      sum=sum+i;
      
    }
    res=res+1;
  }
  i=i+1;
}
System.out.println(sum);
    
  		
  
 }
}
