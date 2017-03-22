package number1;

public class test {

	public static void main(String[] args) {
        System.out.println(removerepeatedchar("¹s¹s¹s¹s¹s¹s"));
    }
    public static String removerepeatedchar(String s) {
        if (s == null)
            return s;
        StringBuffer sb = new StringBuffer();
        int i = 0, len = s.length();
        while (i < len) {
            char c = s.charAt(i);
            sb.append(c);
            i++;
            while (i < len && s.charAt(i) == c) {
                i++;
            }
        }
        return sb.toString();
    }

}
