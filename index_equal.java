
import java.util.Arrays;
import java.util.Scanner;

public class index_equal {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
    	System.out.println("enter total no of element");
    	int x=scan.nextInt(),i=0,flag=0;
    	int a[]=new int [x];
    	for(i=0;i<x;i++)
    		a[i]=scan.nextInt();
    	Arrays.sort(a);
    	for(i=0;i<x;i++)
    	{
    		if(i==a[i])
    		{
    			System.out.println(i+"\t");
    			flag=1;
    		}
    	}
    	if(flag==0)
    		System.out.println("Nothing match in given array");

	}

}
