import java.util.*;
import java.lang.Math;
class Product_and_Sum
{
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		Product_and_Sum obj=new Product_and_Sum();
		int sum=s.nextInt();
		int number=s.nextInt();
		int k=s.nextInt();
		int[] arr=new int[number];
	    int j=0;
		int sum_arr=0;
		for (int i=2;i<=(int)Math.sqrt(number);i++)
		{
			while(number%i==0)
			{
				arr[j]=i;
				sum_arr+=i;
				j++;
				number/=i;
			}
		}
		if (number>1)
		{
			arr[j]=number;
			sum_arr+=number;
			j++;
		}
		if(j<=k)
		{
			if (j<k)
			{
				int sumdiff=sum-sum_arr;
				while(sumdiff>0)
				{
					arr[j]=1;
					j++;
					sumdiff--;
				}
				if(j==k)
				{
				for(int i=0;i<j;i++)
				System.out.print(arr[i]+" ");
				}
				else
				System.out.print("No");
			}
		}
		else if (j>k)
		{
		   int[] ans=new int[k];
		   int i=0,ind=0,h=j;
		   while(j!=k && i+1<h)
		   {
			   ans[ind]=arr[i]*arr[i+1];
			   ind++;
			   i+=2;
			   j--;
			   
		   }
		   while(i<h && ind<k)
		   {   ans[ind]=arr[i];
		       i++;
			   ind++;
		   }
		   if(j==k)
		   {
		   for(int l=0;l<j;l++)
				System.out.print(ans[l]+" ");
		   }
		   else
		   {
			   System.out.println("No");
		   }
	    }
			
		
}
}