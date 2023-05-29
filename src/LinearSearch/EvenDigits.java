package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {-1325,-1345,2,6,78396};

        System.out.println(countEvenNumberDigit(arr));

        System.out.println(findNumbers(arr));
        System.out.println(digits(0));
        System.out.println(digit2(0));

    }


    //Q: FInd how many even number of digits contain this Array
    static int countEvenNumberDigit(int [] arr){

        if(arr.length==0) return -1;

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            int temp =0;
            while(arr[i] >0){
                arr[i] /=10;
                temp ++;
            }
            if(temp % 2 ==0){
                count++;
            }
        }
        return count;
    }

    static int findNumbers(int[] arr){
        if(arr.length==0)return 0;

        int count=0;

        for (int num : arr) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numberofdigit= digits(num);

        return numberofdigit % 2 == 0;
    }

    // count number of digits number Contain
    static int digits(int num){

        // if number is negative convert into positive
        if(num < 0){
            num = num * -1;
        }

        // if number itself is 0 then return false  bcz it contains 1 digit only!
        if(num ==0) return 1;

        int countDigit=0;
        while(num > 0){
            countDigit++;
            num/=10;
        }
        return countDigit;
    }

    //Optimize way to find number of digits!

    static int digit2(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0) return 1;

        return (int) Math.log10(num) +1;
    }
}
