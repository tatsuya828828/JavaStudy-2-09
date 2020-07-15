import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		// シーケンシャルアクセスでの読み書き
		// ファイルに文字情報を書き込むには、FileWriteクラスを利用する
		// FileWriteをインスタンス化することで、ファイルを開くことができる
		// もし指定したファイルが存在しない場合は、自動的にそのファイル名でファイルが作成され書き込みに備える
		// ちなみに第二引数にtrueを渡すことで既にファイルが存在していた場合、上書きではなく、末尾に追記される
		FileWriter fw = new FileWriter("c:¥rpgsave.dat", true);
		// writeメソッドで書き込む
		fw.write('A');
		// writeメソッドはデータの書き込みを要求するだけの命令であり、呼び出したらすぐにファイルにデータが書き込まれるとは限らない。
		// これはファイルの読み書きを高速化するためのバッファという仕組みによって、後でまとめて書き込み処理がされることがあるため
		// そこでファイルを閉じる前に、強制書き込みの役割を果たすflushメソッドを渡す必要がある
		fw.flush();
		// closeはファイルを閉じるメソッド
		// ファイルが開いたままの状態だと、思わぬ不具合を起こす可能性があるため、開いた後は必ず閉じる
		fw.close();


		// ファイルの文字情報を読み込むにはFileReaderクラスを利用する
		// FileReaderをインスタンス化してファイルを開く
		FileReader fr = new FileReader("c:¥rpgsave.dat");
		System.out.println(("全てのデータを読み込んで表示します"));
		// readメソッドで1文字だけ読む
		int i = fr.read();
		// readの戻り値はint形であるが、これは
		// 次の1文字を正しく読み込めたら、その文字情報を返せば良い
		// もしファイルの最後まで読み終わってしまい、もうこれ以上読むデータがない場合、その事実を呼び出し元に伝えなければならない
		// その場合は-1を返すがchar型では-1という数値は返すことができないため苦肉の策としてint型で返すという理由からである
		// その特性を使いwhile文で戻り値が-1になるまで文字を読み込み続けるようにする
		while(i != -1) {
			char c = (char) i;
			System.out.print(c);
			i = fr.read();
		}
		System.out.println();
		System.out.println("ファイルの末尾に到達しました");
		// ファイルを閉じる
		fr.close();
	}
}