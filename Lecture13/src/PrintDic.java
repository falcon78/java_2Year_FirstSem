import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintDic {
  public static void main(String[] args) {
    String filename = "dic.txt";
    try {
      BufferedReader fileReader = new BufferedReader(new FileReader(filename));
      String line;
      while ((line = fileReader.readLine()) != null) {
        String[] stringArray = line.split(",");
        String outputString = String.format("英単語[%s]は、日本語の[%s]という意味です。", stringArray[0], stringArray[1]);
        System.out.println(outputString);
      }
      fileReader.close();
    } catch (FileNotFoundException error) {
      System.out.println("ファイルが見つかませんでした。");
    } catch (IOException error) {
      System.out.println(error);
    }
  }
}
