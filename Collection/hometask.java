package Collection;
import java.util.*;
public class hometask {

	Stack<String> history=new Stack<>();

	public void Add(String URL) {

		history.push(URL);

		System.out.println("The Visited URL is: "+URL);

	}

	public void Previous() {

		if(!history.isEmpty()) {

			history.pop();

			if(!history.isEmpty()) {

				System.out.println("The Previous Url is: "+history.peek());

			}

			else {

				System.out.println("There is no Previous URL");

			}

		}

		else {

			System.out.println("There is no Previous URL");

		}

	}

	public void Current() {

		if(!history.isEmpty()) {

			System.out.println("The Current URL is: "+history.peek());

		}

		else {

			System.out.println("There is no URL in the History");

		}

	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		hometask br=new hometask();

		String opt,URL;

		do {

			System.out.println("1)VisitingURL,2)PreviousURL,3)CurrentURL,4)Exit");

			opt=sc.next()+sc.nextLine();

			switch(opt) {

			case "VisitingURL":

				System.out.print("Enter the URL To Visit: ");

				URL=sc.next()+sc.nextLine();

				br.Add(URL);

				break;

			case "PreviousURL":

				br.Previous();

				break;

			case "CurrentURL":

				br.Current();

				break;

			case "Exit":

				System.out.println("Exiting...");

				break;

			}

		}while(!opt.equals("Exit"));
		sc.close();

	}


}