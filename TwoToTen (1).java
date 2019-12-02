import static java.lang.System.*;

public class TwoToTen {
  private String binary;

  public TwoToTen() {
    setTwo("0");
  }

  public TwoToTen(String bin) {
    setTwo(bin);
  }

  public void setTwo(String bin) {
    binary = bin;
  }

  public long getBaseTen() {
    long ten = 0;

    for (int i = 0; i < binary.length(); i++) {
      ten += Integer.parseInt(Character.toString(binary.charAt(i))) * Math.pow(2, binary.length() - 1 - i);
    }

    return ten;
  }

  public String toString() {
    return binary + " == " + getBaseTen();
  }
}