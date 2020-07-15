import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Main {
	public static void main(String[] args) {
		String msg = "第一土曜日";
		// StringReaderクラスは、指定したString型変数から1文字ずつ読み取るための機能を提供する
		// このクラスはFileReaderクラスとにているが、終端がファイルではなくコンストラクタで指定された文字列である
		try(Reader sr = new StringReader(msg)){
			if(msg instanceof String) {
				char c1 = (char) sr.read();
				char c2 = (char) sr.read();
				char c3 = (char) sr.read();
				char c4 = (char) sr.read();
				char c5 = (char) sr.read();
				System.out.print(c1);
				System.out.print(c2);
				System.out.print(c3);
				System.out.print(c4);
				System.out.print(c5);
			}
		} catch(IOException e) {
			System.out.println("エラーです");
			e.printStackTrace();
		}
	}
}