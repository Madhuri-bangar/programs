package udemyjava_oop;

public class Customer_main {
	private int cid;
	private String cname;
	private static String bank="SBI";
	
	private Account account;//using Account class reference variable
	
	public Customer_main(int cid, String cname, Account account) {
		this.cid=cid;
		this.cname=cname;
		this.account=account;
	}
	
	public void  disp() {
		System.out.println(cid+" "+cname+" "+bank);
		account.getAccount();
	}
	//main method
	public static void main(String[] args) {
		Account a1=new Account(12345,"Savings",133045);
		Customer_main c1=new Customer_main(122,"Om",a1);
	c1.disp();
	
	}

}

