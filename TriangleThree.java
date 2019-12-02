public class TriangleThree {
	private int size;
	private String letter;

	public TriangleThree() {
		size = 0;
		letter = "";
	}

	public TriangleThree(int count, String let) {
		size = count;
		letter = let;
	}

	public void setTriangle(String let, int sz) {
		size = sz;
		letter = let;
	}

	public String toString(String str, int len) {
		String output="";

		for(int i = 1; i <= len; i++) {
			for(int k = (len-i); k >= 0; k--) {
				output += " ";
			}
			for(int j = 0; j<i; j++) {
				output += str;
			}
			output += "\n";
		}

		return output;
	}
}