public class App {
    public static void main(String[] args) {
        if (args.length == 2) {
            try {
                int first = Integer.parseInt(args[0]);
                int second = Integer.parseInt(args[1]);
                Fibonacci f = new Fibonacci(first, second);
                f.output_fibonacciToNumber();
            } catch (Exception ex) {
                System.out.println("Please enter the number");
                System.exit(1);
            }
        } else {
            try {
                int first = Integer.parseInt(args[0]);
                int second = 0;
                Fibonacci f = new Fibonacci(first, second);
                f.outputFibonacci();
            } catch (Exception ex) {
                System.out.println("Please enter the number");
                System.exit(1);
            }
        }
    }
}
