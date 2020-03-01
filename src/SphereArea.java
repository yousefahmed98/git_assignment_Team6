public class SphereArea implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double area = 0;
        double R=Double.parseDouble(input);
        area= 4.0 * (22.0/7.0) * R*R;
        System.out.println("The Sphere Area = "+area);
    }


}
