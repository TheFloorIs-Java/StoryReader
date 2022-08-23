import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StoryReader {
    /*
    an object usually contains STATES and BEHAVIORS
     */
    String filepath;
    File file;
    Scanner storyScanner;
    public StoryReader(String filepath) throws FileNotFoundException {
//        will print null if uncommented
//        System.out.println(file);
        file = new File(filepath);
        storyScanner = new Scanner(file);
    }
    //a method is a reusable block of code... so if we have repetitive, we typically separate that out into a method
//    and reuse that method whenever we want to write that code
//    when we're oop, we actually do a lot more! the idea is that the behavior of our methods might change
//    based off of what the STATE of the object is. so, what information it contains
//    in this case, the behavior of storyreader will change depending on the filepath it contains
//    as well as the file it's using
//    the idea is that each object will have unique behavior!
    public String readFirstLine() throws FileNotFoundException {
        Scanner inputScanner = new Scanner(file);
        String line = inputScanner.nextLine();
        return line;
    }
    public String readNextLine() throws FileNotFoundException {
        String line = storyScanner.nextLine();
        return line;
    }
    public boolean storyHasTextLeft() throws FileNotFoundException {
        boolean hasText = storyScanner.hasNext();
        return hasText;
    }
}
