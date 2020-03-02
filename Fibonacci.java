public class Fibonacci implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        int steps =Integer.parseInt(input);
        int n1=0,n2=1,n3,i;
        System.out.print(n1+" "+n2);

        for(i=2;i<steps;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}