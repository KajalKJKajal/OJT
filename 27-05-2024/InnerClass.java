// class OuterClass {
//     int x = 10;
  
//     static class InnerClass {
//       int y = 5;
//     }
//   }
  
//   public class InnerClass {
//     public static void main(String[] args) {
//       OuterClass.InnerClass myInner = new OuterClass.InnerClass();
//       System.out.println(myInner.y);
//     }
//   }

class OuterClass {
  int x = 10;

  class InnerClass {

    public int myInnerMethod() {
      return x+1;
    }
  }
}

public class InnerClass {
  public static void main(String[] args) {

    OuterClass myOuter = new OuterClass();

    OuterClass.InnerClass myInner = myOuter.new InnerClass();

    System.out.println(myInner.myInnerMethod());
  }
}