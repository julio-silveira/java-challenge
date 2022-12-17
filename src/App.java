public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------");
        System.out.println("First Challenge");
        System.out.println("----------------");

        FirstChallenge sort = new FirstChallenge();
        int [] numbers = { 10,4,32,34,543,3456,654,567,87,6789,98};
        sort.sortNumbers(numbers);

        System.out.println("----------------");
        System.out.println("Second Challenge");
        System.out.println("----------------");
        SecondChallenge exchange = new SecondChallenge();
        double value = 576.74f;
        exchange.toFiat(value);


        System.out.println("----------------");
        System.out.println("Third Challenge");
        System.out.println("----------------");
        ThirdChallenge count = new ThirdChallenge();
        int k = 2;
        int[] n = {1,5,3,4,2};

        count.counter(n, k);

        System.out.println("----------------");
        System.out.println("Fourth Challenge");
        System.out.println("----------------");
        String[] data ={"5", "I ENIL SIHTHSIREBBIG S", "LEVELKAYAK", "H YPPAHSYADILO", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE" };
        FourthChallenge bug = new FourthChallenge();
        bug.fix(data);
        System.out.println("----------------");

    }
}
