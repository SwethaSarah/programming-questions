// Maze Runner problem 
// Find number of ways to reach the top right from bottom left
import java.util.*;
class maze_runner
{
	long count(long[][] mat,int row ,int col)
	{
		for(int i=0;i<row;i++)
			mat[i][0]=1;
		for(int j=0;j<col;j++)
			mat[row-1][j]=1;
		for(int i=row-2;i>=0;i--)
		{
			for(int j=1;j<col;j++)
			{
				mat[i][j]+=mat[i][j-1];
				mat[i][j]+=mat[i+1][j];
				mat[i][j]%=100000000;
			}
		}
		return mat[0][col-1];
	}
	public static void main(String a[])
	{
		Scanner s=new Scanner(System.in);
		maze_runner obj=new maze_runner();
		int r=s.nextInt();
		int c=s.nextInt();
		long [][] mat=new long[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=0;
			}
		}
		System.out.print(obj.count(mat,r,c));
	}
}