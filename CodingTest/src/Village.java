import java.util.Scanner;

public class Village 
{
	 public static void main(String[] args) 
	{
		int n,max,temp=0,temp1=0;
		int no = 10000;
		for(int j=0;j<=no;j++)
		{
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter the no of person");
			n=Sc.nextInt();
			int a[]=new int[2];
			System.out.println("Enter the cost of fair");
			for(int i=0;i<n;i++)
			{
				a[i]=Sc.nextInt();
			
			}
			max=a[0];
		
			for(int i=0;i<n;i++)
			{
				if(max<a[i])
				{
					max=a[i];
				
				}
			}
			System.out.println("maximum value:"+max);
			
			if(n==1)
			{
			System.out.println("maximum total of all Fair:"+max);
			temp=max;
			}
			
			else
			{
			
			 temp1 = temp+max;
			System.out.println("maximum total of all Fair:"+temp1);
			}
			
			
		
			System.out.println("Enter the no of person");
			n=Sc.nextInt();
			int a1[]=new int[2];
			System.out.println("Enter the cost of fair");
			for(int i=0;i<n;i++)
			{
				a[i]=Sc.nextInt();
				
			}
			max=a[0];
			
			for(int i=0;i<n;i++)
			{
				if(max<a[i])
				{
					max=a[i];
					
				}
			}
			System.out.println("maximum value of Fair:"+max);
		
			
			int temp2 = temp1+max;
			System.out.println("maximum total of all Fair:"+temp1);
			int temp3=temp2+temp1;
			System.out.println("maximum total of all Fair:"+temp3);


		}
	}
}

