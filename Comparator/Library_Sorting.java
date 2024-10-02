package Comparator;
import java.util.*;
public class Library_Sorting {

	public static void main(String[] args) {
		TreeSet<String> t1 = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		int opt;

        while (true) {
            System.out.println("\n1. Add New Book\n2. Display All Books\n3.Remove the book from the inventory\n4.Check the books exists or not\n5.Check the size of the set\n6.Exit\nEnter your option:");
            opt = sc.nextInt();

            if (opt == 1) {
                System.out.print("Enter name of the book: ");
                String Book = sc.next();
                t1.add(Book);
                System.out.println("Book Added Successfully...!");
            } else if (opt == 2) {
            	System.out.println("Displaying Book Details...!");
                	Iterator<String> itr = t1.iterator();
                	while(itr.hasNext()) {
                		System.out.println("Name : "+itr.next());
                	}
            } else if (opt == 3) {
                System.out.print("Enter the name of the book to be removed:");
                if(t1.remove(sc.next()))
                	System.out.println("Book Removed Successfully...!");
                else
                	System.out.println("No such book found!");
            } else if(opt == 4 ){
                System.out.print("Enter the name of the book to be searched:");
                if(t1.contains(sc.next()))
                	System.out.println("Book is found...!");
                else
                	System.out.println("Book is not found...!");
            }
            else if( opt == 5 ) {
            	System.out.println("Size of the set after computation is : "+t1.size());
            }
            else if( opt == 6 ){
            	System.out.println("Turning Off!!");
            	break;
            }
        }
        sc.close();
	}

}
