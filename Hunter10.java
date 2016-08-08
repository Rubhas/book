import java.util.Scanner;

public class Hunter10 {
	
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
	int n,m;
	System.out.println("Enter size of  A array");
	n=s.nextInt();
	int[] a=new int[n];
	System.out.println("Enter elements");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	 int a1=0,b1=0;
	 for(int i = 0; i < a.length; i++)
	        {
	        a1 += a[i]*Math.pow(10,a.length-i-1);   
	        }
	System.out.println("Enter size of  B(sub) array");
	m=s.nextInt();
	int[] b=new int[m];
	System.out.println("Enter elements");
	for(int i=0;i<b.length;i++)
	{
		b[i]=s.nextInt();
	}
	 for(int i = 0; i < b.length; i++)
	        {
	        b1 += b[i]*Math.pow(10,b.length-i-1);   
	        }
	 if(String.valueOf(a1).contains(String.valueOf(b1)))
	 {
		 System.out.println("B is subarray of A");
	 }
	 else
	 {
		 System.out.println("not subarray");
	 }
	 
}
}
