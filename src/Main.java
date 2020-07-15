import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Main {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("rpgsave.dat")){
			try(FileOutputStream fos = new FileOutputStream("rpgsave2.dat")){
				try(BufferedOutputStream bos = new BufferedOutputStream(fos)){
					try(GZIPOutputStream gos = new GZIPOutputStream(bos)){
						int i = fis.read();
						while(i != -1) {
							gos.write(i);
							i = fis.read();
						}
						System.out.println("コピーが完了しました");
					} catch(IOException e) {
						System.out.println("コピーに失敗しました");
						e.printStackTrace();
					}
				} catch(IOException e) {
					System.out.println("バッファリングに失敗しました");
					e.printStackTrace();
				}
			} catch(IOException e) {
				System.out.println("ファイルの作成に失敗しました");
				e.printStackTrace();
			}
		} catch(IOException e) {
			System.out.println("ファイルの読み込みに失敗しました");
			e.printStackTrace();
		}
	}
}