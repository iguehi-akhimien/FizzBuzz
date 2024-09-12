public class Multiples {
    public static void main(String[] args) {
        int multiples = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0) {
                multiples = multiples + 1;
                System.out.println("number of multiples: "+ multiples);
            } else if (i % 5 == 0) {
                multiples = multiples + 1;
                System.out.println("number of multiples: "+ multiples);
            }else{
                System.out.println("number of multiples: "+ multiples);
            }
        }
    }
}