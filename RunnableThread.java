import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileReadingTask implements Runnable {
   
	private String filename;
    public FileReadingTask(String filename) {
        this.filename = filename;
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        
    	String filename = "Ayush.txt";
        FileReadingTask fileReadingTask = new FileReadingTask(filename);
        Thread thread = new Thread(fileReadingTask);
        thread.start();
    }
}

