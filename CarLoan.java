public class CarLoan {
  //declares variables globally as possbily useful for other parts of the preliminary class build
  int carLoan = 10000;
  int loanLength = 3;
  int interestRate = 5;
  int downPayment = 2000;
  int remainingBalance;
  int months;
  int monthlyBalance;
  int interest;
  int monthlyPayment;
  
  //CarLoan constructor: allows the carLoan class to make objects representing different car loans
  public CarLoan() {
    System.out.println("Generating a car loan!");
  }

  //Method used to calculate the monthly payment of a car loan object
  public void calculateMonthlyPayment(){
    if(loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if(downPayment >= carLoan) {
      System.out.println("The car can be paid in full.");
    } else {
      remainingBalance = carLoan - downPayment;
      months = loanLength * 12;
      monthlyBalance = remainingBalance / months;
      interest = (monthlyBalance * interestRate)/100; 
      monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }
  }
 

	public static void main(String[] args) {
    //makes a car loan named "mine"
    CarLoan mine = new CarLoan();
    //calculates the monthly payment
    mine.calculateMonthlyPayment();
	}
}