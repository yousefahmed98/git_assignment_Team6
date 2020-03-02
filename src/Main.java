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
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		mathTopic.dispatchEvent(input);
		sc.close();
	}
}
