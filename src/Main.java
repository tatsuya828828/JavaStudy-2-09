import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		// 普段利用している様々なファイルは、文字列で構成されたテキストファイルとバイト列で構成されたバイナリファイルに分類できる
		// 人間が直接バイナリファイルを読んだり編集したりすることはできない
		// しかし、文字以外の情報を扱える、小さなデータ容量ですむ、高速に処理できるなどのメリットがあるため
		// データの保存や伝送のために広く利用されている
		// バイナリファイルにバイト列を書き込むためには、FileOutputStreamクラスを
		// 読み込むためには、FileInputStreamクラスを利用する
		// 両者はそれぞれFileWriterクラスやFileReaderクラスと極めてよく似ている
		// 取り扱うデータが文字ではなくバイト列であるだけで使い方はほぼ同じ
		FileOutputStream fos = new FileOutputStream("rpgsave.dat", true);
		fos.write(65);
		fos.flush();
		fos.close();
		// コンピュータの中では、様々な整数や文字、あるいは色を「一定個数の0と1の並び順で表現する」ことによって取り扱っている
		// 全ての文字には、そのバイト表現が決められている
		// 例えば「A」であれば「01000001」、「7」には「00110111」が割り当てられている
		// 日本人は、漢字、平仮名、カタカナなどたくさんの種類の文字を使うため文字を1バイトでは表示できない
		// そのため日本では、基本的に2バイトを使って1文字を表現する方式を採用している
		// しかし、ルールが何種類も提唱されて統一されなかった
		// これらのルールは、文字コード体系または、文字コードと呼ばれる(JIS、ShiftJIS、EUC、UTF-8などがよく知られている)
	}
}