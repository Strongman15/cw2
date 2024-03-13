import java.util.Random;
public class Main {
  public static void main(String[] args) {
    for(int celsjusz=0; celsjusz<=300;celsjusz+=20)
      { 
        int faren=celsjusz*9/5+32;
        System.out.println("c "+celsjusz+" "+faren);
        }
  }
}
