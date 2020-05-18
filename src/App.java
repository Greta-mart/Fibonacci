public class App {
    public static void main(String[] args) {
        try {
            int first = Integer.parseInt(args[0]);
            int second = Integer.parseInt(args[1]);
            Fibonacci f = new Fibonacci(first, second);
            f.fibbonacci();
        } catch (Exception ex) {
            System.out.println("Please enter the number");
            System.exit(1);
        }
    }
}
