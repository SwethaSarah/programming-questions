import java.util.*;
import java.lang.Math;
class Square_and_Cube
{
	long find(int n)
	{
		for(int i=n;i>0;i--)
		{
			double square=Math.sqrt(i);
			double cube=Math.cbrt(i);
			if (square==(int)square && cube==(int)cube)
				return i;
		}
		return -1;
	}
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		Square_and_Cube obj=new Square_and_Cube();
		int number=s.nextInt();
		System.out.print(obj.find(number));
	}
}