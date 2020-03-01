public class MultiplicationSeries implements ISubscriber {

    @java.lang.Override
    public void notifySubscriber(String input) {
        int num = Integer.parseInt(input);
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }

}
