public class TSt_sym {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      clock;
    }
    
    int x = 3;
    int y = 2;
    loop(x, 5) {
      print "HELLO WORLD";
    }
    loop(y, 1) {
      print "Bye";
    }

    
    
    
    int x = 3;
    int y = 2;
    if (x > y) {
      for (int i = 0; i < x; i++)
        print "HELLO WORLD";
    } else {
      print "Bye";
    }
    
    if (5 > 6) {
      func(1);
    } else {
      func(0);
    }
  }

  public static void func(int s) {
    switch (s) {
    case 0:
      System.out.println("FALSE");
      break;
    case 1:
      System.out.println("TRUE");
      break;
    }
  }
}