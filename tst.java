public class test {
  public static void main(String[] args) {
    method();
  }

  public static void method() {

    int x = 8;
    int y = 2;
    fur i = 0 until x where
    begin
	    if (i > y) {
	      Say: "Hello World";
	    }
	    else {
	      Say: "Bye!";
	    }
    end

  }
}