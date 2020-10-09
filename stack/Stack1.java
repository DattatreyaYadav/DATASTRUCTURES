package data;

class stackdata {
	int max=10;
	int top=-1;
	int array[]= new int[max];
	boolean isEmpty() {
		return (top<0);
	}
	boolean push(int x) {
		if(top >= (max-1)) {
			System.out.println("stack is overflow");
			return false;
		}
		else {
			array[++top]=x;
			System.out.println(x +" pushed into stack");
			return true;	
		}
	}
	int pop() {
		if (top<0) {
			System.out.println("stack is underflow");
			return 0;
		}
		else {
			int x =array[top];
			//array[top++]=0;
			top--;
			return x;
		}
	}
	int peek() {
		if(top < 0) {
			System.out.println("stack is underflow");
			return 0;
		}
		else {
			int x= array[top];
			return x;
		}
	}
	
	void display() {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
			
	}


}
public class Stack1 {

	public static void main(String[] args) {
	stackdata sta = new stackdata();
	sta.push(10);
	sta.push(10);
	sta.push(10);
	sta.push(10);
	sta.push(10);
	System.out.println(sta.pop() + "poped from stack");
	sta.display();

	}

}
