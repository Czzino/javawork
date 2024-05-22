package _05_interface;

public class MySql implements DataAccess {

	@Override
	public void select() {
		System.out.println("MySql 검색 합니다.");
	}

	@Override
	public void insert() {
		System.out.println("MySql 삽입 합니다.");
	}

	@Override
	public void update() {

		System.out.println("MySql 수정 합니다.");
	}

	@Override
	public void delete() {
		System.out.println("MySql 삭제 합니다.");

	}

}
