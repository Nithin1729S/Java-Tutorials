package Methods;

public class addNumsCMD
{
    public static void main(String[] args) {
        double sum=0;
        for(String x:args)
        {
            sum+=Double.parseDouble(x);
        }
        System.out.println(sum);
    }
}
