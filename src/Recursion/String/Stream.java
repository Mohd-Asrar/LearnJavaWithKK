package Recursion.String;

public class Stream {
    public static void main(String[] args) {

        skip("", "dangal");
        System.out.println(skip1("lagan"));
        System.out.println(skipApple("SteveAppleorjobappleornewton"));
        System.out.println(skipAppNotApplele("playStoreappAppOrAplleappStore"));



    }

    public static void skip(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a' || ch == 'A'){
            skip(p, up.substring(1));
        }else {
            skip(p+ch, up.substring(1));
        }
    }

    public static String skip1(String up){
        if(up.isEmpty()){
            return " ";
        }

        char ch = up.charAt(0);

        if(ch =='a' || ch =='A'){
            return skip1(up.substring(1));
        }
        return ch+ skip1(up.substring(1));
    }

    public static String skipApple(String up){
        if(up.isEmpty()){
            return " ";
        }

        if(up.startsWith("apple") || up.startsWith("Apple")){
            //ye function hame ek particular string bataega us index se start ho raha hai ya
            // nahi agar hai to utne value index chord do or substring usse aage se start kro jaise yaha "apple" me
            // 5 character hai to ham substring  use krke index 5 tak  (0,1,2,3,4) skip krdenge and 5 se start krenge check krna!
            return skipApple(up.substring(5));
        }else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    public static String skipAppNotApplele(String up){
        if(up.isEmpty()){
            return " ";
        }

        if(up.startsWith("app") &&  !up.startsWith("apple") || up.startsWith("App") && !up.startsWith("Apple")){
           //Skip app or App only when they are not apple or Apple
            return skipAppNotApplele(up.substring(3));
        }else {
            return up.charAt(0) + skipAppNotApplele(up.substring(1));
        }
    }
}
