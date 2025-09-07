package librarybook;
import java.util.Scanner;

public class LibraryStack {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Stack st = null;
		
		
		System.out.println("WELCOME");
		System.out.println("1.Create an empty stack(choose the size)");
		System.out.println("2.Start with a raedy maid stack of the books");
		int choice = sc.nextInt();
		 
		
		if (choice ==1 )
		{
			System.out.println("enter the size");
			int size = sc.nextInt();
			st = new Stack(size);
			
		}
		else if (choice == 2)
		{
			System.out.println("Enter the number of books ");
			int n= sc.nextInt();
			int arr[] = new int[n];
			System.out.println("enter the book IDs");
			for (int i = 0; i< n;i++)
			{
				arr[i] =sc.nextInt();
			}
			st = new Stack(arr);
		}
		
		
		int option;
		do
		{
			 System.out.println(" Menu");
	            System.out.println("1. Push one book(ADD)");
	            System.out.println("2. Push two books");
	            System.out.println("3. Pop one book (DELETE)");
	            System.out.println("4. Pop multiple books");
	            System.out.println("5. Show all books");
	            System.out.println("6. Show top n books");
	            System.out.println("7. Exit");
	            System.out.print("Choose an option: ");
	            option = sc.nextInt();
			
			
			
		
	 switch(option)
	 {
     case 1:
         System.out.print("Enter book ID: ");
         int val = sc.nextInt();
         st.push(val);
         break;

     case 2:
         System.out.print("Enter two book IDs: ");
         int v1 = sc.nextInt();
         int v2 = sc.nextInt();
         st.push(v1, v2);
         break;

     case 3:
         int popped = st.pop();
         if (popped != -1)
             System.out.println("📤 Book popped: " + popped);
         break;

     case 4:
         System.out.print("How many books to pop? ");
         int n = sc.nextInt();
         st.pop(n);
         break;

     case 5:
         st.display();
         break;

     case 6:
         System.out.print("How many top books to see? ");
         int topN = sc.nextInt();
         st.display(topN);
         break;

     case 7:
         System.out.println(" Thank you! EXITING ");
         break;

     default:
         System.out.println(" INVALID CHOICE");
 }
} while(option != 7);

sc.close();
}

		
		
	}


