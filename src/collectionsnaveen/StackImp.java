package collectionsnaveen;

public class StackImp {
	
	int size;
	int arr[];
	int top;
	
	public StackImp(int size)  
	{
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
		
	}
	
	public boolean isFull()
	{
		return (size-1 == top);
		
	}
	
	public int peek()
	{
		if(!this.isEmpty())
		{
			return arr[top];
		}
		else 
		{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public void push(int element)
	{
		if(!isFull())
		{
			top++;
			arr[top]=element;
			System.out.println("pushed element = " + element);
		}
		else
		{
			System.out.println("Stack is full now ");
		}
	}
	
	public int pop()
	{
		if(!isEmpty())
		{
			int returnedTop = top;
			top--;
			System.out.println("poped element = " + arr[returnedTop]);
			return arr[returnedTop];
		}
		else
		{
			System.out.println("stack is empty");
			return -1;
		}
	}
	
	public static void main(String[] args)
	
	{
		
	}

}
