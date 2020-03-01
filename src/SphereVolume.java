public class SphereVolume implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        double volume=0;
        double R=Double.parseDouble(input);
        volume= (4.0/3.0) * (22.0/7.0) * R*R*R;
        System.out.println("Sphere volume = "+volume);
    }
}
