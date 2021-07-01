import java.util.Scanner;

public class AllAlphabets {
        public static void main(String[] args) {
            Scanner n =new Scanner(System.in);
            System.out.println("Enter A String To Check if it contains All Alphabets or not : ");
            String S=n.nextLine();
            boolean h1=S.chars().allMatch(Character::isLetter);
            System.out.println(h1);
            n.close();
        }
    
}
