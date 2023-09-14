import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class RunnableThread2 extends Thread 
{
   
	public void run() 
	{
        file1();
        file2();
    }
	
	public void file1() 
	{
        File file1 = new File("World.txt");
        try 
        {
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            String line1;
            while((line1=br1.readLine())!=null) 
            {
                System.out.println(line1);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void file2() 
    {
        File file2 = new File("Everyone.txt");
        try 
        {
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            String line2;
            while((line2=br2.readLine())!=null) 
            {
                System.out.println(line2);
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
	public static void main(String[] args) 
	{
		RunnableThread2 thread = new RunnableThread2();
		thread.start();
	}
}




