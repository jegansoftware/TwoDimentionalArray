package love;
import java.util.*;
public class TwoDimensionArray {
private int[][]a;
private int  row;
private int stud=10;
private int sub=5;

Scanner in=new Scanner(System.in);


	public TwoDimensionArray()
	{
		int i,j;
		System.out.printf("\nHow Many Should Students be allocated? :");
		stud=in.nextInt();
		
	
		a=new int[stud][sub];
		
		
		
		for(i=0;i<stud;i++)
		{
			
			
			System.out.printf("\n");
			for(j=0;j<sub;j++)
			{
				System.out.printf("%d ).", j+1);
				a[i][j]=in.nextInt();
				
				if(a[i][j]>100)
				{
					a[i][j]=100;
				}
				
			}
			
		}
	}
	
	
	
	public void Display()
	{
		int i,j;
		System.out.printf("\nRoll.No  Tamil      English    Mathematice      Science     Social Science");
		
		for(i=0;i<stud;i++)
		{
			System.out.printf("\n");
			System.out.printf("00%d", i+1);
			for(j=0;j<sub;j++)
			{
				System.out.printf("     %3d      ", a[i][j]);
			}
		}
	}

	
	public void sum()
	{
		int i;
		int sum=0;
		System.out.printf("\nWhich Should Row be Chosen?");
		row=in.nextInt();
		
		for(i=0;i<sub;i++)
		{
			sum=sum+a[row-1][i];
		}	
		
		System.out.printf("\nTotal :%d",sum);
		
	}
	
	public void min()
	{
		int i;
		int min=a[0][0];
		
		for(i=0;i<sub;i++)
		{
			if(min>a[row-1][i])
			{
				min=a[row-1][i];
			}
		
		}
		
		System.out.printf("\nMinimum Value :%3d",min);
		
	}
	
	
	public void max()
	{
		int i;
		int max=a[0][0];
		
		for(i=0;i<sub;i++)
		{
			if(max<a[row-1][i])
			{
				max=a[row-1][i];
			}
		
		}
		
		System.out.printf("\nMaximum Value :%3d",max);
		
	}

	
	
	
	
}
