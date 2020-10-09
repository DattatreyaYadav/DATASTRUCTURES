package graphs;

import java.util.Scanner;

public class MatrixsImplementation {
	int vertices;
	int matrix[][];
	public MatrixsImplementation(int vertices) {
		this.vertices=vertices;
		matrix=new int [vertices][vertices];
	}
	public void addEdge(int source,int destination)
	{
		matrix[source][destination]=1;
		matrix[destination][source]=1;
	}
	public void print(){
		for(int i=0;i<vertices;i++)
		{
			for(int j=0;j<vertices;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of vertices");
		int vertices=scan.nextInt();
		MatrixsImplementation mat=new MatrixsImplementation(vertices);
		System.out.println("enter number of edges");
		int edges=scan.nextInt();
		for(int i=0;i<edges;i++)
		{
			System.out.println("enter the source ");
			int source=scan.nextInt();
			System.out.println("enter the destination");
			int destination=scan.nextInt();
			mat.addEdge(source,destination);
		}
		mat.print();
        scan.close();
	}

}
