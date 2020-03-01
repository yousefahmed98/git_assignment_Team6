
public class CircleCircumference implements ISubscriber{
	@Override
    public void notifySubscriber(String input) {
        double circumference = 0;
        double r=Double.parseDouble(input);
        circumference= 2 * 3.14 * r;
        System.out.println("The circle  circumference = " + circumference);
    }
}
