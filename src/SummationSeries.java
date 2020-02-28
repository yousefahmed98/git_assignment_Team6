public class SummationSeries {
private int number;
    public SummationSeries(int n)
    {
        number=n;
    }

    public int sum()
    {
        //return ((number*(number+1))/2);
        int sum=0;
        for (int i=1;i<=number;i++)
        {
            sum+=i;
        }
        return sum;
    }
}
