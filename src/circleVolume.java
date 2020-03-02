public class circleVolume implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        Double r = Double.valueOf(input);
        System.out.println("The Volume Of The Ball is: " + 4/3*3.14*r*r*r);
    }
}
