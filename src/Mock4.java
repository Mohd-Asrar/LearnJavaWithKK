


/*Create class named Cuboid with fields length,width and height,
  not visible outside classClass Cuboid contains following functions:
  1. setLength(int l): sets the length of the cuboid
  2. setWidth(int w):  sets width of the cuboid
  3. setHeight(int h): sets height of the cuboid
  4. volume(): Prints the volume of the cuboid

 */
public class Mock4 {
    public static void main(String[] args) {

        Cuboid c = new Cuboid();
        c.setHeight(10);
        c.setWidth(20);
        c.setLength(30);
        System.out.println(c.volume(c.height, c.length,c.width));

    }
   static class Cuboid{
        private int length;
        private int width ;
        private int height;


        public void setLength(int length) {
            this.length = length;
        }
        public void setWidth(int width){
            this.width= width;
        }
        public void setHeight(int height){
            this.height= height;
        }

        public int volume(int l, int w, int h){
            return l*w*h;
        }
    }
}
