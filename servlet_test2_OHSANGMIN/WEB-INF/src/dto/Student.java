package dto;

/**
 * DTOクラス
 */
public class Student {
	private String id; // ID
	private String name; // 名前
	private int age; // 年齢
	private String major; // 専攻

	public Student() {
		// コンストラクタで値を初期化
		this.id = "";
		this.name = "";
		this.age = 0;
		this.major = "";
	}

	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param major セットする major
	 */
	public void setMajor(String major) {
		this.major = major;
	}
}
