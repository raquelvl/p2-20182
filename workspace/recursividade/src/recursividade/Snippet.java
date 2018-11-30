package recursividade;

public class Snippet {
	public static boolean foo(String str, int i, int j) {
		if (i >= j) {
			return true;
		} else {
			boolean iguais = str.charAt(i) == str.charAt(j);
			return iguais && (j - i == 1 ? true : foo(str, i + 1, j - 1));
		}
	}

	public static void main(String[] args) {
		String str1 = "radar";
		String str2 = "nadar";
		System.out.println(str1 + " eh ??? " + foo(str1, 0, str1.length() - 1));
		System.out.println(str2 + " eh ??? " + foo(str2, 0, str2.length() - 1));
	}
}
