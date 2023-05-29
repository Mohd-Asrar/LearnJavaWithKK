package BinarySearch;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {

        char[] arr ={'c','f','j'};
        char target = 'j';
        System.out.println(smallestLettersGreaterThanTarget(arr,target));


    }

    static char smallestLettersGreaterThanTarget(char[] letters, char target){
        //  we can chck edge case like this, or we can use modulo shown below!
        //  if(target >=letters[letters.length-1]) return letters[0];

        int start=0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(letters[mid]> target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        //  use modulo %  for edge case if target is greater than  last char of array return 0th char using
        // modulo. we will lie always inside the length of array bcz of modulo.
        return letters[start % letters.length];

        // Or we can define edge case upper and here just return  like this
        // return letters[start];

    }

}
