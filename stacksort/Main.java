package stacksort;

public class Main {

	public static void main(String[] args) {
		Stack data=new Stack();
		data.push(2);
		data.push(3);
		data.push(6);
		data.push(1);
		data.push(9);
		data.push(7);
		System.out.println("sorted array");
		sorting d=new sorting();
		int result[]=d.sortingdata();
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
		System.out.println();
	}

}
