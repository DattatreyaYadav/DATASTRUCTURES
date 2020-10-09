package linkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class CountPairsum {

	public static void main(String[] args) {
	
       Scanner scan=new Scanner(System.in);
       System.out.println("enter number of elements in the first array ");
       int n1=scan.nextInt();
       Integer array1[]=new Integer[n1];
       for(int i=0;i<n1;i++)
       {
    	   array1[i]=scan.nextInt();
       }
       System.out.println("enter number of elements in the second array ");
       int n2=scan.nextInt();
       Integer array2[]=new Integer[n2];
       for(int i=0;i<n2;i++)
       {
    	   array2[i]=scan.nextInt();
       }
       LinkedList<Integer> head1= new LinkedList<Integer>(Arrays.asList(array1));
       LinkedList<Integer> head2= new LinkedList<Integer>(Arrays.asList(array2));
       
       System.out.println("enter the sum ");
       int sum=scan.nextInt();
       
       pairs dat=new pairs();
       System.out.println(dat.countPairs(head1,head2,sum));
       scan.close();
	}
}

class pairs
{
	public int countPairs(LinkedList<Integer> head1,LinkedList<Integer> head2,int sum)
	{
		int count=0;
		HashSet<Integer> hs =new HashSet<Integer>();
		Iterator <Integer> i =head1.iterator();
		while(i.hasNext())
		{
			hs.add(i.next());
		}
		Iterator <Integer> i2 =head2.iterator();
		while(i2.hasNext())
		{
			if(hs.contains(sum-i2.next()))
			{
				count++;
			}
		}
		return count;
	}
}
