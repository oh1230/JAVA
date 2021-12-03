package step2;

class Computer{
	private String os;
	private int memory;

	Computer(String os,int memory){
		this.os = os;
		this.memory = memory;
	}

	/**
	 * オブジェクト内のOSとメモリーをコンソール画面に出力するメソッド
	 */
	public void show(){
		System.out.println("このPCのOSは"+os+"です。");
		System.out.println("このPCのメモリーは"+memory+"です。");
	}

	/**
	 * オブジェクト内のOSの文字と引数のOSの文字が等しいかを調べるメソッド
	 * @param os : 調べる対象のOS
	 * @return : 同じであればtrue,違うのあればfalse
	 */
	public boolean isOsEmpty(String os){
		return (this.os.equals(os))?true:false;

	}

}

public class Main2 {
	public static void main(String[] args){

		Computer[] array = new Computer[2];
		array[0] = new Computer("Windows",2048);
		array[1] = new Computer("Mac",3192);

		int winCount = 0;
		for(int i = 0;i<array.length;i++){
			if(array[i].isOsEmpty("Windows")){
				winCount++;
			}
		}

		System.out.println("WindowsのOSを持つコンピュータは"+winCount+"個です。");

	}
}
