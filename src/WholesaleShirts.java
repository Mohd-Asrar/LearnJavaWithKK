public class WholesaleShirts {
    public static void main(String[] args) {

    }
    public class ShirtSize{
        int large;
        int medium;
        int small;

        public ShirtSize(int large, int medium, int small) {
            this.large = large;
            this.medium = medium;
            this.small = small;
        }

        public boolean checkShirt(int shirtSize){
            if(shirtSize==1){
                if(large>0){
                    large--;
                    return true;
                }else{
                    return false;
                }
            }
            if(shirtSize==2){
                if(medium>0){
                    medium--;
                    return true;
                }else{
                    return false;
                }
            }

            if(shirtSize==3){
                if(small>0){
                    small--;
                    return true;
                }else{
                    return false;
                }
            }

            return false;
        }
        }
    }

