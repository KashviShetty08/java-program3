package librarybook;


import java.util.Scanner;

public class Stack {
	private int arr[];
	private int top;
	private int capacity;
	
	
	Stack(int size){
		capacity = size;
		arr = new int[size];
		top = -1;
	}
	
	Stack(int[] inputArr)
	{
   capacity = inputArr.length;
   arr = new int[capacity];
   for (int i =0; i < capacity;i++)
   {
	   arr[i] = inputArr[i];
   }
   
   top = capacity - 1;
}
	//push one book
	void push(int x)
	{
		if (top == capacity -1)
		{
			System.out.println("NO MORE SPACE CANNOT PUSH THE BOOK ID");
			return;
		}
		arr[++top] = x;
		System.out.println("book pushed" +x);
		
		
	}
	// push two books
	void push (int x, int y)
	{
		push(x);
		push(y);
	}
	
	int pop()
	{
		if (top == -1)
		{
		System.out.println("NO BOOKS TO BE DELETED(POPPED,stack is empty)");
		return -1;
		
		}
		return arr[top--];
	}
	
	//to pop n books
	void pop(int n)
	{
		for(int i = 0;i<n;i++)
		{
			int val = pop();
			if (val == -1) {
			break;//stops if underflow happens
			}
			System.out.println(" book popped " + val);
		}
	}
	
	//to display all the books
	void display()
	{
		if (top == -1)
		{
			System.out.println(" stack is empty");
			return;
		}
		System.out.println("books in the stack");
		for(int i = top;i>=0;i--)
		{
			System.out.println(arr[i] +"");
		}
		System.out.println();
	}
	
	void display(int n) //doesnt show all the books just the recent 
	{
        if (top == -1) 
        {
            System.out.println(" Stack is empty.");
            return;
        }
        if (n > top + 1)
        {
            n = top + 1; 
        }
        System.out.print(" Top " + n + " books: ");
        for (int i = top; i > top - n; i--) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
			
		}
		
	
	
	
	
	
