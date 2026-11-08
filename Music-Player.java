import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main (String[] args) {

        // audio file formats (.wav, .au, .aiff)
        String filepath = "ADD_YOUR_AUDIO_FILE_HERE";
        File file = new File(filepath);

        try (Scanner sc = new Scanner(System.in)) {
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);

            String response = "";
            while (!response.equals("Q")) {
                System.out.println("-----Music Controls-----");
                System.out.println("S: Start/Resume");
                System.out.println("P: Pause");
                System.out.println("R: Reset");
                System.out.println("Q: Quit");
                System.out.println("------------------------");
                System.out.print("Enter your choice: ");

                response = sc.next().toUpperCase();
                switch (response) {
                    case "S" -> clip.start();
                    case "P" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice.");
                }

            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate the file.");
        }
        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource.");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported.");
        }
        catch (IOException e) {
            System.out.println("Something went wrong!");
        }
        finally {
            System.out.println("Bye!");
        }
    }
}
