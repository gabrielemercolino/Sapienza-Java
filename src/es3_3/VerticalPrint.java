package es3_3;

public class VerticalPrint {
  public static void print(String a, String b, String c) {
    int i = 0;
    StringBuffer sb = new StringBuffer();
    while (true) {
      if (i >= a.length() && i >= b.length() && i >= c.length())
        break;
      sb.append(i < a.length() ? a.charAt(i) : " ");
      sb.append(i < b.length() ? b.charAt(i) : " ");
      sb.append(i < c.length() ? c.charAt(i) : " ");
      sb.append("\n");
      i++;
    }
    System.out.println(sb);
  }

  public static void main(String[] args) {
    print("ciao", "buondì", "hello");
  }
}
