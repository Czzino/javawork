package jhex02;

public class BookRun {

	public static void main(String[] args) {
		LibraryController control = new LibraryController("천진호","35","남자");
		Book contro11 = new Book();
		control.insertBook(contro11);
		control.selectAll();
		control.info();
		
//		Tv tv = new Tv();
//		Computer com = new Computer();
//		GameDevice game = new GameDevice()
//		b.buy(tv);
//		b.buy(com);
//		b.buy(game);
//		b.info();
//		b.refund(com);
//		b.info();
//		control.insertBook();
//		aList1 = control.selectAll();
//		System.out.println(aList1);
	}

}
