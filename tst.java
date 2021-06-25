public class TSt_sym {
  public static void main(String[] args) {
    int x = 5;
    int y = 3;
    fur i = 0 until x where
	    begin
		    if (i>y) {
		    	Say: "Hello World";
		    }
		    else {
		    	Say: "Bye!";
		    }
	    end
  }
}