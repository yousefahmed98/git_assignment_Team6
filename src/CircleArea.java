public class CircleArea implements ISubscriber{

    @Override
    public void notifySubscriber(String input) {
        //calculations
        double pi = 3.14;
        double area =0.0;
        double r = Double.parseDouble(input);
        area = pi*r*r;
        System.out.println("Circle Area = "+area);
    }
}
