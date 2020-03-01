public class LucasSeries implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        int Index = Integer.parseInt(input);
        System.out.println(Lucas(Index));
    }
    int Lucas (int pos){
        return Lucas(pos,1,2);
    }
    private int Lucas (int pos, int value , int prev)
    {

        return (pos==0 ? prev : Lucas(pos - 1,prev + value , value));
    }

}