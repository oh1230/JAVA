package step4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIn {
    BufferedReader br = null;               // BufferedReaderクラス

    /* ファイルのオープンを行うメソッド */
    public boolean open(String fname) {
        boolean sts = true;
        try {                               // ファイルオープンに相当する処理
            br  = new BufferedReader(new FileReader(fname));
        } catch (IOException e) {
            sts = false;
        }
        return sts;
    }

    /* ファイルからデータの読み込みを行うメソッド */
    public String readLine() {
        String buff;
        try {
            buff = br.readLine();           // 1行分のデータをファイルから入力
        } catch(IOException e) {
            System.out.println("読み込みエラー\n" + e);
            buff = null;
        }
        return buff;
    }

    /* ファイルのクローズを行うメソッド */
    public boolean close() {
        boolean sts = true;
        try {
            br.close();                     // ファイルのクローズ
        } catch(IOException e) {
            System.out.println("ファイルクローズエラー\n" + e);
            sts = false;
        }
        return sts;
    }
}
