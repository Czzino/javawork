package jhex02;

public class Member extends LibraryController {
	String name;
	String age;
	String gender;
	Member() {
		this("name", "age", "gender");
	}

	Member(String name, String age, String gender){
		super(name, age, gender);
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	String getName() {
		return name;
	}

	String getAge() {
		return age;
	}

	String getGender() {
		return gender;
	}
	
	@Override
	public String toString() {
		return "이름 : " + ":" + name + "," + "나이" + ":" + age + ":" + ", 성별" +  gender;
	}
}
