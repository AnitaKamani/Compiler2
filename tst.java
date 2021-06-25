public class TSt_sym {
  public static void main(String[] args) {
    int x = 6;
    int y = 5;
    fur i = 0 until x where
	    begin
	    if (i < y) {
	    	SAY: "Hello World";
	    } else {
	    	SAY: "Bye";
	    }
	    end
  }
}