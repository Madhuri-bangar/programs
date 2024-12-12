package udemyjava;

public class SyncTest {

	public static void main(String[] args) {
		Table_sync t = new Table_sync();

		// Now create instances of First and Second using the Table_sync instance
		Table_sync.First t1 = t.new First(t);
		Table_sync.Second t2 = t.new Second(t);
		Table_sync.Third t3 = t.new Third(t);

		t1.start();
		t2.start();
		t3.start();
	}
}
