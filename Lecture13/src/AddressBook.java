import java.io.*;
import java.util.ArrayList;

public class AddressBook {

    ArrayList<Address>books;

	public AddressBook() {
		books = new ArrayList<Address>();
	}

	public void add(Address address) {
		books.add(address);
	}

	public void showAddress() {
		for(Address book : books) {
			System.out.println(book.toString());
		}
	}

	public void open (String filename){
	  try {
			BufferedReader fileReader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = fileReader.readLine()) != null)	{
				String[] addressInfo = line.split(",");
				books.add(new Address(addressInfo[0], addressInfo[1], addressInfo[2], addressInfo[3]));
			}
			fileReader.close();
		}catch (FileNotFoundException error){
	  	System.out.println("ファイルが見つかりませんでした");
		} catch (IOException error){
	  	System.out.println(error);
		}
	}

	public void save (String filename){
		try{
			PrintWriter fileWriter = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
			for (Address book : books){
				fileWriter.println(book);
			}
      fileWriter.close();
		}catch(IOException error){
			System.out.println(error);
		}
	}


	public static void main(String[] args) {
		AddressBook book = new AddressBook();
		System.out.println("ファイルから読み込む。");
		book.open("address.txt");
		System.out.println("一覧の表示。");
		book.showAddress();
		System.out.println("新規データの追加。");
		Address taroAddress = new Address("電大太郎", "東京都千代田区", "03-5280-XXXX", "taro@dendai.ac.jp");
		book.add( taroAddress );
		System.out.println("一覧の表示。");
		book.showAddress();
		System.out.println("ファイルに書き出す。");
		book.save("address2.txt");

    }
}
