import java.util.*;
public class sort
{
public static void main(String[] args)
{
int n,temp;
Scanner w=new Scanner(System.in);
n=w.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=w.nextInt();
}
for(int j=0;j<n;j++)
{
for(int k=j+1;k<n;k++)
{
if(a[j]<a[k])
{
temp=a[j];
a[j]=a[k];
a[k]=temp;
}
}
}
for(int l=0;l<n;l++)
{
System.out.println(a[l]);
}
}
}
