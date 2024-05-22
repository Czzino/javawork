package _05_interface;

public class Oracle implements DataAccess {

	@Override
	public void select() {

		System.out.println("Oracle 검색 합니다.");
	}

	@Override
	public void insert() {

		System.out.println("Oracle 삽입 합니다.");
	}

	@Override
	public void update() {

		System.out.println("Oracle 수정 합니다.");
	}

	@Override
	public void delete() {
		System.out.println("Oracle 삭제 합니다.");

	}

}
