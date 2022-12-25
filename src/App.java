import java.util.Arrays;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-----------------");
        System.out.println("FIRST CHALLENGE");
        System.out.println("-----------------");

        System.out.println("------INPUT------");
        FirstChallenge sort = new FirstChallenge();
        int [] numbers = { 10,4,32,34,543,3456,654,567,87,6789,98};
        
        System.out.println(Arrays.toString(numbers));

        System.out.println("------OUTPUT-----");
        sort.sortNumbers(numbers);
        
        System.out.println("-----------------");
        System.out.println("SECOND CHALLENGE");
        System.out.println("-----------------");

        SecondChallenge exchange = new SecondChallenge();

        System.out.println("------INPUT------");
        double value = 576.74f;
        System.out.println(String.format(Locale.US,"%.2f", value));

        System.out.println("------OUTPUT-----");
        exchange.toFiat(value);


        System.out.println("-----------------");
        System.out.println("THIRD CHALLENGE");
        System.out.println("-----------------");

        ThirdChallenge count = new ThirdChallenge();

        System.out.println("------INPUT------");
        int k = 2;
        int[] n = {1,5,3,4,2};

        System.out.println("k =" + k );
        System.out.println("n = " + Arrays.toString(n));

        System.out.println("------OUTPUT-----");
        count.counter(n, k);

        System.out.println("----------------");
        System.out.println("FOURTH CHALLENGE");
        System.out.println("----------------");
        System.out.println("------INPUT------");

        String[] data ={"5", "I ENIL SIHTHSIREBBIG S", "LEVELKAYAK", "H YPPAHSYADILO", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE" };
        System.out.println(Arrays.toString(data));

        FourthChallenge bug = new FourthChallenge();

        System.out.println("------OUTPUT-----");

        bug.fix(data);

        System.out.println("----------------");
        

    }

}