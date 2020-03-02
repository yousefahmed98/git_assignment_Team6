public class circleVolume implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        Double r = Double.valueOf(input);
        System.out.println("The Volume Of The Circle is: " + 2*r*3.14);
    }
}
