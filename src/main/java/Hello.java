import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) throws FileNotFoundException {
//        SCANNER is a class, it functions as a blueprint for a Scanner object
//        myScanner is the name of that said object
//        SCANNER is to DOG as myScanner is to FidoTheDog
/*
        Scanner myScanner = new Scanner(System.in);
        String input = myScanner.nextLine();
        System.out.println("hello, "+input);
*/

        StoryReader reader = new StoryReader("story.txt");
        /*
        String line = reader.readNextLine();
        System.out.println(line);
        String line2 = reader.readNextLine();
        System.out.println(line2);
        String line3 = reader.readNextLine();
        System.out.println(line3);
        */
        /*
        conditionals and loops
         */
        while(reader.storyHasTextLeft()==true){
            String line = reader.readNextLine();
            System.out.println(line);
        }
    }
}
