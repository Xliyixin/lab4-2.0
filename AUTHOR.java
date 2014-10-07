public class AUTHOR {
	private String id;// 作者id
	private String name;// 作者姓名
	private int age;// 作者年齡
	private String country;// 作者国籍


	public AUTHOR() {
	}

	public AUTHOR(String id, String name, int age, String country) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
