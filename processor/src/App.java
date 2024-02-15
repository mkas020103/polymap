import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Command to execute Python script
        List<String> command = new ArrayList<>();
        command.add("python");
        command.add("C:\\Users\\mdfl0\\OneDrive\\Desktop\\repos\\polymap\\processor\\src\\connect.py");
        command.add("East Oval Runway (EOR)");
        command.add("South Hallway 5A (SH5A)");

        try {
            // Start the process
            ProcessBuilder pb = new ProcessBuilder(command);
            Process process = pb.start();

            // Read the output of the process
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            // Wait for the process to finish
            process.waitFor();

            // Close the reader
            reader.close();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}