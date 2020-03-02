import java.util.Scanner;

public class Main {

	private static ISubscriber subscribers [] = {
      new SummationSeries(),
			new MultiplicationSeries(),
			new LucasSeries(),
			new SphereArea (),
			new SphereVolume(),
			new circleVolume(),
		  new SphereCircumference(),
			new CircleCircumference(),
			new CircleArea(),
		        new Fibonacci(),
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		System.out.println("What do you prefer\n 1-Do all the operations at once\n 2-Choose only one of them");
		Scanner sc = new Scanner(System.in);
		int choice = Integer.parseInt(sc.nextLine());
		
		if (choice == 1) {
			for (ISubscriber sub : subscribers) {
				mathTopic.addSubscriber(sub);
			}
			
			String input = sc.next();
			mathTopic.dispatchEvent(input);
		}
		else if (choice == 2) {
			System.out.println("Choose one\n "
					+ "1-SummationSeries\n "
					+ "2-LucasSeries\n "
					+ "3-CircleCircumference\n "
					+ "4-SphereVolume\n "
					+ "5-BallVolume\n "
					+ "6-MultiplicationSeries\n "
					+ "7-SphereArea\n "
					+ "8-Fibonacci\n "
					+ "9-CircleArea\n "
					+ "0-SphereCircumference");
			int toDo = Integer.parseInt(sc.next());
			if (toDo == 1) {
				ISubscriber temp = new SummationSeries();
				mathTopic.addSubscriber(temp);
				System.out.print("number of terms = ");
				String n = sc.next();
				mathTopic.dispatchEvent(n);
			}
			else if (toDo == 2) {
				ISubscriber temp = new LucasSeries();
				mathTopic.addSubscriber(temp);
				System.out.print("number = ");
				String n = sc.next();
				mathTopic.dispatchEvent(n);
			}
			else if (toDo == 3) {
				ISubscriber temp = new CircleCircumference();
				mathTopic.addSubscriber(temp);
				System.out.print("redius of the circle = ");
				String r = sc.next();
				mathTopic.dispatchEvent(r);
			}
			else if (toDo == 4) {
				ISubscriber temp = new SphereVolume();
				mathTopic.addSubscriber(temp);
				System.out.print("redius of the sphere = ");
				String r = sc.next();
				mathTopic.dispatchEvent(r);
			}
			else if (toDo == 5) {
				ISubscriber temp = new circleVolume();
				mathTopic.addSubscriber(temp);
				System.out.print("redius of the ball = ");
				String r = sc.next();
				mathTopic.dispatchEvent(r);
			}
			else if (toDo == 6) {
				ISubscriber temp = new MultiplicationSeries();
				mathTopic.addSubscriber(temp);
				System.out.print("number = ");
				String n = sc.next();
				mathTopic.dispatchEvent(n);
			}
			else if (toDo == 7) {
				ISubscriber temp = new SphereArea();
				mathTopic.addSubscriber(temp);
				System.out.print("redius of the sphere = ");
				String r = sc.next();
				mathTopic.dispatchEvent(r);
			}
			else if (toDo == 8) {
				ISubscriber temp = new Fibonacci();
				mathTopic.addSubscriber(temp);
				System.out.print("number of terms = ");
				String n = sc.next();
				mathTopic.dispatchEvent(n);
			}
			else if (toDo == 9) {
				ISubscriber temp = new CircleArea();
				mathTopic.addSubscriber(temp);
				System.out.print("redius of the circle = ");
				String r = sc.next();
				mathTopic.dispatchEvent(r);
			}
			else if (toDo == 0) {
				ISubscriber temp = new SphereCircumference();
				mathTopic.addSubscriber(temp);
				System.out.print("redius of the sphere = ");
				String r = sc.next();
				mathTopic.dispatchEvent(r);
			}
			else 
				System.out.println("invalid choice");
		}
		else 
			System.out.println("invalid choice");
		sc.close();
	}
}
