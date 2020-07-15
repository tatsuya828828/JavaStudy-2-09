import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		// try-catch構文を使って、例外処理を定義しておく
		try(FileWriter fw = new FileWriter("rpgsave.dat", true)){
			fw.write('A');
			fw.flush();
		} catch(IOException e) {
			System.out.println("ファイル書き込みエラーです");
			e.printStackTrace();
		}

		try(FileReader fr = new FileReader("rpgsave.dat")){
			int i = fr.read();
			while(i != -1) {
				char c = (char) i;
				System.out.print(c);
				i = fr.read();
			}
		} catch(IOException e) {
			System.out.println("ファイル読み込みエラーです");
			e.printStackTrace();
		}
	}
}