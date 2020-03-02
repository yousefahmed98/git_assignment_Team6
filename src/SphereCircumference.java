public class SphereCircumference implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        int radius= Integer.parseInt(input);

        String message="The Sphere Circumference is: ";
        double circumference = Math.PI * 2 * radius;
        System.out.println(message+circumference);
    }
}
