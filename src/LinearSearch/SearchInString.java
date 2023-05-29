package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {

        String name = "Asrar Shaikh";
        char target = 'S';
        char target1 = 'i';


        System.out.println( target +" Present at index : "+ search(name, target));

        System.out.println(search2(name, target1));

    }

    static int search(String str , char target){
        if(str.length() == 0){
            return -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== target){
                return i;
            }
        }
        return -1;
    }

    static boolean search2(String str , char target){
        if(str.length() == 0){
            return false;
        }

        //for each work on element not index
        for(char ch : str.toCharArray()){
            if(ch ==target){
                return true;
            }
        }
        return false;
    }
}
