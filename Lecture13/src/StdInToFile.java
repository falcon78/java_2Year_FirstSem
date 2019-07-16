import java.io.*;

public class StdInToFile {
  public static void main(String[] args) {
    String filename = "test.txt";
    try {
      BufferedReader stdInput = new BufferedReader(new InputStreamReader(System.in));
      PrintWriter fileWriter = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
      String line;
      while ((line = stdInput.readLine())!= null){
        fileWriter.println(line);
      }
      stdInput.close();
      fileWriter.close();
    }catch (IOException error){
      System.out.println(error);
    }
  }
}
