package ClassTests;

class Array {
    int []arr;

    //getting the size via constructor
    Array(int size) {
        arr = new int[size];
    }

    //initializing the array
    void setArr(int index, int value) {
        arr[index] = value;
    }

    //getting the sum of the array
    int getSum() {
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    //finding the maximum value for array
    int findMax() {
        int max = -9999999;      // int max = -9999999 (as small as possible)

        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    //
    boolean sumChecker() {
        int sum = getSum();

        if (sum % 2 == 0)
            return true;
        else
            return false;
        //return sum % 2 == 0; can be written as well.
    }

    //checking if it's divisible by the parameter
    int divisibility(int n) {
        int divisibleTime = 0;

        for (int i=0; i<arr.length; i++) {
            if(arr[i] > 0) //size is 10, but 7 of 'em have been initialized; so by default unused value will be 0 [0%n=0]
            {
                if (arr[i] % n == 0) {
                    divisibleTime++;
                }
            }
        }

        return divisibleTime;
    }
}

public class CT1 {
    public static void main(String[] args)
    {
        Array arr = new Array(10); //passing the size to constructor

        //assigning the values to the array; up to size
        arr.setArr(0,1);
        arr.setArr(1,2);
        arr.setArr(2,3);
        arr.setArr(3,4);
        arr.setArr(4,5);
        arr.setArr(5,6);
        arr.setArr(6,7);

        //maximum value of the array
        System.out.println("maximum value : " + arr.findMax());

        //getting sum of the array
        System.out.println("sum of the array : " + arr.getSum());

        //checking if the input is odd or even
        System.out.println("sum of the array is even : " + arr.sumChecker());

        //checking times of division by the parameter
        System.out.println("divides " + arr.divisibility(2) + " times");
    }
}