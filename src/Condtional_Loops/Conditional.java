package Condtional_Loops;

public class Conditional {
    public static void main(String[] args) {


        /*
        Syntax of Contional

        if(Condtion  t/f){

              // Body

        }else{

             // Body

        }

         */

        int salary = 27500;

        if(salary > 10000){
            salary+= 1000;
        } else if (salary>20000) {
            salary+= 3000;
        }else {
            salary+= 40000;
        }

        System.out.println(salary);

    }
}
