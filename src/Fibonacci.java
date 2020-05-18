public class Fibonacci {
    int firstNumber;
    int secondNumber;

    public Fibonacci(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void output_fibonacciToNumber() {
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

    public void outputFibonacci(){
        if (firstNumber >= 0 && firstNumber <= 9) {
            int sec = firstNumber + 1;
            int result = 0;
            for (int i = firstNumber; i <= 9; i++) {
                result = firstNumber + sec;
                if (firstNumber <= 9) {
                    System.out.print(firstNumber + ", ");
                    firstNumber = sec;
                    sec = result;
                }
            }
        } else if (firstNumber >= 10 && firstNumber <= 99) {
            int sec = firstNumber + 1;
            int result = 0;
            for (int i = firstNumber; i <= 99; i++) {
                result = firstNumber + sec;
                if (firstNumber <= 99) {
                    System.out.print(firstNumber + ", ");
                    firstNumber = sec;
                    sec = result;
                }
            }
        } else if (firstNumber >= 100 && firstNumber <= 999) {
            int sec = firstNumber + 1;
            int result = 0;
            for (int i = firstNumber; i <= 999; i++) {
                result = firstNumber + sec;
                if (firstNumber <= 999) {
                    System.out.print(firstNumber + ", ");
                    firstNumber = sec;
                    sec = result;
                }
            }
        }
    }
}
