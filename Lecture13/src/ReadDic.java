import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDic {
  public static void main(String[] args) {
    String filename = "dic.txt";
    try {
      BufferedReader fileReader = new BufferedReader(new FileReader(filename));
      String line;
      while ((line = fileReader.readLine()) != null) {
        System.out.println(line);
      }
      fileReader.close();
    } catch (FileNotFoundException error) {
      System.out.println("ファイルが見つかませんでした。");
    } catch (IOException error) {
      System.out.println(error);
    }
  }
}
