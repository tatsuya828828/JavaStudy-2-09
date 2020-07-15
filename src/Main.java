import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) {
		// Pathインターフェースのgetメソッドを使うと特定のファイルを指し示すことができる
		// もしくは既にFileインスタンスが存在する場合は、toPathメソッドを使うことによってPathインスタンスに変換できる
		// Pathインスタンスは、あくまでファイルやフォルダを指し示す役割しか持たない
		// 実際に、指し示したものを操作するためのメソッドは、Filesクラスに定義されている
		Path p = Paths.get("rpgsave.dat");
		// Filesクラスのexistsメソッドを使うと、ファイルが存在するか確認してくれる
		boolean f = Files.exists(p);
		System.out.println(f);
	}
}