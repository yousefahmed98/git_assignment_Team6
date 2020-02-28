public class SummationSeries implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        int number = Integer.parseInt(input);
        System.out.println("Summation Series = "+((number*(number+1))/2));
        /*int sum=0;
        for (int i=1;i<=number;i++)
        {
            sum+=i;
        }
        System.out.println("Summation Series = "+ sum);*/
    }
}
