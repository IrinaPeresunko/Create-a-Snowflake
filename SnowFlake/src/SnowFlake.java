
public class SnowFlake {

	public static void drawSnowFlake(int start,int end,int n)
	{
		for(int j=0;j<n;j++)
		{
		if(j==start)
		for(int k=start;k<end+1;k++) System.out.print("*");
		else System.out.print(" ");
		}
		System.out.print("\n");
	}
	public static void main(String[] args) {
		int n=7,start=(n/2)+1,end=n/3;
		for(int i=0;i<n;i++)
		{
			if(i<(n/2)+1)
			{
				start--;end++;
				drawSnowFlake(start,end,n);
			}
			else
			{
				start++;end--;
				drawSnowFlake(start,end,n);	
			}
		}	
	}
}
