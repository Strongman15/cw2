public class Main {
  public static void main(String[] args) {
  String e = "Hello World"; 
    for(int i=0; i<e.length();i++)
      { for( int j = 0; j < i; j++)
        {
          System.out.print(" ");
        }
        System.out.println(e.charAt(i));
      }
  }
}