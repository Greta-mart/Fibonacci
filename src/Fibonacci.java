public class Fibonacci {
    int firstNumber;
    int secondNumber;

    public Fibonacci(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void fibbonacci() {
        int sec = firstNumber + 1;
        int stop = secondNumber;
        int result = 0;
        for (int i = firstNumber; i <= stop; i++) {
            result = firstNumber + sec;
            if (firstNumber <= stop) {
                System.out.print(firstNumber + ", ");
                firstNumber = sec;
                sec = result;
            }
        }
    }
}
