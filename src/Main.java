import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
	public static void main(String[] args) throws IOException {
		// RandomAccessFileクラスは、ファイルの任意の場所を読み書きするための代表的なクラス
		RandomAccessFile f = new RandomAccessFile("file.txt", "rw");
		// seekメソッドを使ってファイルの先頭から何Byte目にアクセスするかを自在に指定できる
		f.seek(20);
		byte b = f.readByte();
		f.seek(18);
		f.writeByte(b);
		// ランダムアクセスでの読み書きはファイルの任意の場所を自由にアクセスできて便利だが、速度や扱えるデータ容量に関する制約がある
		// そのため、大量のデータを高速で扱えるシーケンシャルアクセスの方がファイル操作の基本的な手法と見做されている
	}
}