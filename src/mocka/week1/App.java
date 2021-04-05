package mocka.week1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gasPrice = 3.19;
		double moneyInWallet = 100.00;
		int numberOfFriends = 6;
		int myAge = 30;
		String firstName = "Jean";
		String middleName = "B.";
		String lastName  = "Mizero";
		
//		Addition, subtraction and concatenation
		double moneyLeft = moneyInWallet - gasPrice;
		int numberOfFriendsEachYear = myAge + numberOfFriends ;
		String fullName = firstName + " " + middleName + " " + lastName;
		
//		Print out the result
		System.out.println("Money left after shopping is : "+"$" + moneyLeft );
		System.out.println("I made lot of friends after six years: " + numberOfFriendsEachYear);
		System.out.println("My fullname is: " + fullName);

	}

}











