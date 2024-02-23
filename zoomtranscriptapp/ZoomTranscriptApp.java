import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Tommy Lee
 * Removes the timestamps and whitespace from Zoom's Closed Caption Transcript 
 */
public class ZoomTranscriptApp {

    /**
     * Runs the program
     * @param args Command Line arguments.
     */
    public static void main(String[] args) {
        
        // Reads the raw text files from transcript, creates,
        // and writes to another text file labeled "info.txt".
        ArrayList<String> words = readFile(args[0]);
        createFile(args[0]);
        writeFile(words, args[0]);
        
    } // end main()

    /**
     * Writes all the words into the created "info.txt" file
     * @param w ArrayList of words.
     * @param folder The folder
     */
    public static void writeFile(ArrayList<String> w, String folder) {

        String fileName = folder + "/info.txt";
        String returnedWords = "";

        // Attempts to write all the words into "info.txt"
        try {
            FileWriter writer = new FileWriter(fileName);
            for (String word : w) {
                returnedWords += (word + "\n");
            }
            writer.write(returnedWords);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: ");
            e.printStackTrace();
        }

    } // end writeFile()

    /**
     * Creates a file "info.txt" inside the folder 
     * @param folder The folder
     */
    public static void createFile(String folder) {
        
        String fileName = folder + "/info.txt";

        // Attempts to create a new file inside the folder
        try {
            File text = new File(fileName);
            if (text.createNewFile()) {
                System.out.println("File created: " + text.getName());
            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            System.out.println("Error: ");
            e.printStackTrace();
        }

    } // end createFile()

    /**
     * Reads a transcript from a folder.
     * Example of valid folder: "2023-02-22 16.05.12 Tommy Lee's Zoom Meeting".
     * Note: name of folder should be a command line argument when running program.
     * @param folder The folder 
     * @return An ArrayList of all the words w/o timestamps or whitespace
     */
    public static ArrayList<String> readFile(String folder) {

        String fileName = folder + "/meeting_saved_closed_caption.txt";
        ArrayList<Integer> lines = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        String data;
        int i = 0;

        // Attempts to find a file and read every 3rd line of the file (data)
        // and adds data to the words ArrayList.
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                data = fileReader.nextLine();
                if (i % 3 == 1) {
                    words.add(data);
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: ");
            e.printStackTrace();
        }
        return words;

    } // end readFile()

}