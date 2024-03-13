import java.util.Random;
public class Main {
  public static void main(String[] args) {
  Random random = new Random();
   int suma = 0;
    System.out.println("Wylosowane liczby");
    for(int i = 0; i<5;i++)
  
      {
       int liczba = random.nextInt(100);
        System.out.println(liczba);
        int kwadrat=liczba*liczba;
        System.out.println(kwadrat);
        suma+=kwadrat;
      
      }
    
 
    System.out.println("Suma liczb: "+suma);


    
      }
  }
