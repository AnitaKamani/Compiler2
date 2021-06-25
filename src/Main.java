import java.util.ArrayList;
import java.util.List;

public class Main {
	public static int x = 0;
	public static int y = 0;
	public static int iterator;
	public static int end = 0;
	public static int comp = 0;
	public static String str1;
	public static String str2;

	public static List<Integer> pointers = new ArrayList<Integer>();

	public static void main(String[] argv) {
		JavaParser.main(argv);
		;
	}

	public static void loop(Object b, Object e) {
		iterator = (Integer) b;
		String inp = ((String) e).toLowerCase();
		if (inp.equals("x"))
			end = x;
		else
			end = y;

		while (iterator < end) {
			if (comp >= 0) {
				System.out.println(str1);
			} else if (str2 != null) {
				System.out.println(str2);
			}
			iterator++;
			comp++;
		}
	}

	public static void assign(Object id, Object val) {
		String inp = ((String) id).toLowerCase();
		int val_ = (Integer) val;
		if (inp.equals("x"))
			x = val_;
		else
			y = val_;
	}

	public static int compare(Object g, Object l) {
		int tmp = 0;
		String gr = ((String) g).toLowerCase();
		String lo = ((String) l).toLowerCase();
		if (gr.equals("y")) {
			tmp = y;
		} else if (gr.equals("i")) {
			tmp = iterator;
		} else {
			tmp = (Integer) g;
		}

		if (lo.equals("y")) {
			tmp -= y;
		} else if (lo.equals("i")) {
			tmp -= iterator;
		} else {
			tmp -= (Integer) l;
		}
		return tmp;
	}

	public static void condition(Object e, Object s1, Object s2) {
		comp = (Integer) e;
		str1 = ((String) s1);
		str2 = ((String) s2);
	}
}