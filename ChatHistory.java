import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatHistory {
    private static final String LOG_FILE = "chat_history.txt";

    // Method to log a message to the file
    public static synchronized void logMessage(String username, String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(LOG_FILE, true))) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            writer.println("[" + timestamp + "] " + message);
            // writer.println("[" + timestamp + "] " + username + ": " + message);
        } catch (IOException e) {
            System.out.println("Error logging message: " + e.getMessage());
        }
    }

    // Method to print chat history
    public static void displayChatHistory() {
        try (BufferedReader reader = new BufferedReader(new FileReader(LOG_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading chat history: " + e.getMessage());
        }
    }
}
