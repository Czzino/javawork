package _05_interface;

public interface DataAccess {

	public abstract void select(); // 검색

	public abstract void insert(); // 삽입

	public abstract void update(); // 수정

	public abstract void delete(); // 삭제

}
