package udemyjava;

//user defined exception
public class VotingApp {
	public  void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("under age");
		else
			System.out.println("welcome to vote");
	}

	public static void main(String[] args) {
		VotingApp v1=new VotingApp();
		try {
			v1.validate(23);
			v1.validate(17);// age<18-->exception must be thrown
		} catch (Exception e) {
			System.out.println(e);
		}
			finally {
				System.out.println("finally always gets executed");
			}
		System.out.println("rest of the code ...follows");
	}
}
