package jp.co.f1.jdbc.test;

class Student {
	private int sid;
	private String name;
	private int id;
	private int score;

	/**
	 * 引数なしのコンストラクタ
	 */
	public Student() {
		this.id = 999;
		this.score = 0;
	}

	/**
	 * @return sid
	 */
	public int getSid() {
		return sid;
	}

	/**
	 * @param sid セットする sid
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score セットする score
	 */
	public void setScore(int score) {
		this.score = score;
	}


}
