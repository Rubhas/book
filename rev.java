import java.io.*;
class rev
{
public static void main(String a[ ])
{
int n, m, rev = 0;
int k = Integer.parseInt(a[0]);
n = k;
while( n > 0 )
{
m = n % 10;
rev = ( rev * 10 ) + m;
n = n / 10;
}
if( rev == k )
System.out.println("palindrome" );
else
System.out.println(" not palindrome" );
}
}
