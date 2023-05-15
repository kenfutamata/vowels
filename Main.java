import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        String sentence; 

        System.out.print("Enter String: ");
        sentence = input.nextLine(); 
        cap j1 = new cap(sentence); 
        j1.vowels();
        j1.lowercase(); 
    }

}
