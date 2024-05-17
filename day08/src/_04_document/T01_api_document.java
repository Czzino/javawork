package _04_document;

public class T01_api_document {
	String name;
	int count; // 기본값 0
	
	T01_api_document(){
		System.out.println("제목없음" + ++count);
	}
	
	T01_api_document(String name){
		this.name = name;
		System.out.println("문서" + this.name + "생성됨");
	}
}
