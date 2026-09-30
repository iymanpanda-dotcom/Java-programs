 public class CharacterCount {
 static int count(String str, char ch, int index) {
 if (index == str.length()) {
 return 0;
 }
 if (str.charAt(index) == ch) {
 return 1 + count(str, ch, index + 1);
 }
 return count(str, ch, index + 1);
 }
 public static void main(String[] args) {
    String str = "banana";
    System.out.println(
 count(str, 'a', 0)
 );
 }
}

