public class palindrome{
public static void main( String[] args){
int r, sum=0, temp;		//declaring variables
int n= 343;			// initializing a variable to check the palindrome number
temp = n;			// storing the value of n in temp	
while(n>0){
r= n%10;			// to get the remainder 
sum =  (sum*10) + r;
n = n/10;
}
if(temp==sum)
System.out.println("it is a palindrome number");
else{
System.out.println("it is not a palindrome number");

}
}
}