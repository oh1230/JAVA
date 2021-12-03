package ch04;

public class NumberInfo {

	private String userNumber;	//入力数値用変数
	private String judge;			//判定用変数

	NumberInfo(){
		userNumber = "";
		judge = "";
	}

	//変数userNumberのアクセサメソッド
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	//変数judgeのアクセサメソッド
	public String getJudge() {
		return judge;
	}
	public void setJudge(String judge) {
		this.judge = judge;
	}
}