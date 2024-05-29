public class Break {

    public static void main(String[] args) {
  
      int i = 0;
  
      while (i <= 10) {
  
        i++;
  
        if (i % 5 == 0) {
          continue;
        } else {
          System.out.println(i);
        }
      }
      System.out.println("OVER");
    }
  }
  