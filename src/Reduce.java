public class Reduce {
    public static void main(String[] args) {
        int start = 100;
        int steps = 0;

        while (start != 0) {
            if (start % 2 == 0) {
                start = start / 2;
                steps++;

            } else {
                start = start - 1;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
