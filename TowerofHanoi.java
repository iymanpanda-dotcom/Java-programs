public class TowerOfHanoi {
 static void tower(int n, char source, char auxiliary, char destination)
{
 if (n == 1) {
 System.out.println(
 "Move disk 1 from " + source +
 " to " + destination
 );
 return;
 }
 tower(n - 1, source, destination, auxiliary);
 System.out.println(
 "Move disk " + n +
 " from " + source +
 " to " + destination
 );
 tower(n - 1, auxiliary, source, destination);
 }
 public static void main(String[] args) {
    tower(3, 'A', 'B', 'C');
 }
}

