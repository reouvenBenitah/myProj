import java.util.Scanner;

public class loop {

    //a question5
    public int factorial(int n) {
        if (n == 0) return 1;
        if (n < 0) return -1;
        int sumFactorial = 1;
        for (int i = 1; i < n; i++) {
            sumFactorial *= i;
            System.out.print(i + "*");
        }
        sumFactorial *= n;
        System.out.print(n);
        System.out.print("=");
        return sumFactorial;
    }

    //a question 6
    public double avarge() {
        Scanner scaan = new Scanner(System.in);
        System.out.println("pleaseb enter numers");
        double number = scaan.nextDouble();
        double acuont = 0;
        double sum = 0;
        while (number != -1) {
            acuont++;
            sum += number;
            System.out.println("pleaseb enter numers");
            number = scaan.nextDouble();

        }
        return sum / acuont;

    }

    //a question 7
    public int howManyeEven(int num) {
        int account = 0;
        while (num != 0) {
            if ((num % 10) % 2 == 0)
                account++;
            num /= 10;
        }
        return account;
    }
    //a question 8

    public boolean isAscending(int num) {
        int lastDigit = 10;
        while (num != 0) {
            int ahadot = num % 10;
            if (ahadot > lastDigit) {
                return false;
            }
            lastDigit = ahadot;
            num /= 10;
        }
        return true;
    }
    //a question 9

    public int maxDigit(int num) {
        int maxDigit = 0;
        while (num != 0) {
            int ahadot = num % 10;
            if (maxDigit < ahadot) {
                maxDigit = ahadot;
            }
            num /= 10;
        }
        return maxDigit;
    }

    // a question 10
    public int howManyOccurences(int num, int d) {
        int account = 0;
        while (num != 0) {
            int numDigit = num % 10;
            if (numDigit == d) {
                account++;
            }
            num /= 10;
        }
        return account;
    }
//    // a question 13
//    public int reverse(int  num){
//
//    }

    //    public int filter(int num, int d) {
//
//    }
    public boolean isUpdownNumber(int num) {
        boolean isUp = true;
        int lastDigit = -1;
        while(num>0) {
            int ahadot = num%10;
            if(ahadot<lastDigit) {
                isUp=false;
            }
            if(!isUp && ahadot>lastDigit) {
                return false;
            }
            lastDigit = ahadot;
            num/=10;
        }
        return true;
    }

    public boolean isUpdownNumber1(int num) {
        String longNumber = "" + num;
        boolean isUp = true;
        for (int i = 0; i < longNumber.length()-1; i++) {
            if(longNumber.charAt(i)>longNumber.charAt(i+1)) {
                isUp=false;
            }
            if(!isUp && longNumber.charAt(i)<longNumber.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }

    // question 14
    public void printMultipyl() {
        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int j = 1; j < 11; j++) {
                System.out.print(" ");
                System.out.print(j * i + "\t");
            }
        }
    }

    // question 15A
    public void PrintSquare(int n) {
        if (n <= 0) System.out.println("Invalid Input");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }

        }
    }

    //    question 15B
    public void tringle1(int n) {
        if (n <= 0) System.out.println("Invalid Input");
        for (int i = 1; i < n; i++) {
            System.out.println();
            for (int j = 1; j < i; j++) {
                System.out.print("*" + " ");

            }
        }
    }

    public void tringle2(int n) {
        if (n <= 0)
            System.out.println("Invalid Input");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.println("*" + "\t");

            }

        }
    }

}

class tester {
    public static void main(String[] args) {
        loop l = new loop();
//      double avr = l.avarge();
        System.out.println(l.isUpdownNumber(12343));
        System.out.println(l.isUpdownNumber(15543));
        System.out.println(l.isUpdownNumber(1567));
        System.out.println(l.isUpdownNumber(7654));
        System.out.println(l.isUpdownNumber(12323));
        l.tringle1(8);
    }
}








