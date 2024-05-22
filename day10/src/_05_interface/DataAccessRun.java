package _05_interface;

public class DataAccessRun {

	public static void main(String[] args) {

		MySql sql = new MySql();
		System.out.println("My Sql : ");
		sql.select();
		sql.insert();
		sql.update();
		sql.delete();
		
		System.out.println("-------------------------------");
		System.out.println("Oracle : ");
		Oracle orc = new Oracle();
		orc.select();
		orc.insert();
		orc.update();
		orc.delete();
		System.out.println("주소 복사 : ");
		System.out.println("-------------------------------");
		// 주소복사
		DataAccess da = orc;
		da.select();
		da.insert();
		da.update();
		da.delete();
		System.out.println("주소 복사 : ");
		System.out.println("-------------------------------");
		DataAccess da2 = sql;
		da2.select();
		da2.insert();
		da2.update();
		da2.delete();

	}

}
