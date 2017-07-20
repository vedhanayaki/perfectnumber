package player;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the Number:");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int sum=0;
for(int i=1;i<a;i++){
	if(a%i==0){
		sum=sum+i;
	}
}
if(sum==a){
	System.out.println("NUmber is Perfect Number");
}
else{
	System.out.println("Number is not a Perfect Number");
}
//int div(int x)
	}
	int div(int x){
		return x;
	}

}
