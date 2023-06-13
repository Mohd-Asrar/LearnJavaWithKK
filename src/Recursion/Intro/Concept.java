package Recursion.Intro;

public class Concept {
    public static void main(String[] args) {
        concept(5);

    }

    static void concept(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);

//        concept(n--);
        concept(--n);


          /*  --n             vs         n--
          This will                 This will pass
          first subtract             the value and
          the value than             then subtract the
          pass the value              value


         */

    }
}
