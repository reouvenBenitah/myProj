import java.util.Scanner;

public class OneDArraysMethods {

    //    question 4
    public void inputArray(int[] a) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("pleas numbers ");
            int num = scan.nextInt();
            a[i] = num;
        }
    }

    //    question 5
    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    //    question 6
    public void printBack(int[] a) {
        for (int i = a.length - 1; i <= a.length; i--) {
            System.out.print(a[i] + "\t");
        }
    }

    //    question 7
    public double average(double[] dArr) {
        double sum = 0;
        double accuont = 0;
        for (int i = 0; i < dArr.length; i++) {
            sum += dArr[i];
            accuont++;
        }
        return sum / accuont;
    }

    //    question 8
    public int maxlnArray(int[] arr) {
        int bigNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (bigNum < arr[i]) {
                bigNum = arr[i];
            }
        }
        return bigNum;
    }

    //    question 9
    public int difference(int[] arr) {
        int bigNum = arr[0];
        int smallNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (bigNum < arr[i]) {
                bigNum = arr[i];
            }
            for (int j = 0; j < arr.length; j++) {
                if (smallNum > arr[j]) {
                    smallNum = arr[j];
                }
            }
        }
        return bigNum - smallNum;
    }

    // question 10
    public boolean isSorted(int[] a) {
        for (int i = 0; i <= a.length; i++) {
            if (a[i] <= a[i + 1])
                return true;
        }
        return false;
    }

    //    question 11
    public int couontNums(double[] dArr, double num) {
        int account = 0;
        for (int i = 0; i < dArr.length; i++) {
            if (dArr[i] >= num)
                account++;
        }
        return account;
    }

    //    question 12
    public int countOdd(int[] nums) {
        int account = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0)
                account++;
        }
        return account;
    }

    //    question 13
    public boolean isPalindrom(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            int first = a[i];
            int last = a[(a.length-1)-i];
            if(first!=last){
                return false;
            }
        }
        return true;
    }
//    question 14A
    public int[] createArray1(int size){
        int arr[] = new int [size];
        return arr;
    }

//    question 14B
    public int[]createArray2(int size,int num){
        int mahpelot[]= new int[num];
        for (int i = 0; i <= num; i++) {
            if((size*i)%size==0)
                mahpelot[i]=size*i;
        }
        return new int [mahpelot[num]];
    }

}

class testerArray {
    public static void main(String[] args) {
        OneDArraysMethods array = new OneDArraysMethods();
        int[] a = {1,2,1};
        System.out.println(array.isPalindrom(a));
//        System.out.println(array.createArray2(3,3));
    }
}
