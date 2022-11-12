import java.util.Scanner;
public class RetirementCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double balance = 0;
		double target;
		double contribution;
		double interest;
		int age;
		int ogAge;
		int years = 0;
		boolean goal = false;
		int age2;
		double balance2;
		int goalAge = 0;
		double caseInterest = 0;
		
		
		System.out.println("Initial amount of money:");
		balance = input.nextDouble();
		balance2 = balance;
		System.out.println("Target amount at age 65:");
		target = input.nextDouble();
		System.out.println("Contributions per year:");
		contribution = input.nextDouble();
		System.out.println("Annual growth in percent:");
		interest = input.nextDouble() * 0.01;
		System.out.println("Your current age:");
		ogAge = input.nextInt();
		age = ogAge;
		age2 = age;
		
		
		System.out.format("%5s%15s%15s%15s\n", "Age", "Interest", "Contribution", "End Balance");
		
		
		while( age < 65 ) {
			
				
			while (age2 < 65) {
				balance2 = balance2 + balance2 * interest;
				age2++;
			}
			if (balance2 >= target) {
				goal = true;
				contribution = 0;
				if (years == 0) {
					years = age - ogAge;
					goalAge = age;
				}
				caseInterest = balance * interest;
				balance = balance + balance * interest;
			} else {
				caseInterest = balance * interest;
				balance = balance + balance * interest + contribution;
			}	
			
			
			
			
			
			age++;
			System.out.format("%5d%15.2f%15.2f%15.2f\n", age, caseInterest, contribution, balance);
			age2 = age;
			balance2 = balance;
		}
		
		if (goal)
			System.out.println("Congratulations! You can reach that target by saving your yearly contribution amount for " + years + " year(s) until age " + goalAge + ", then coasting the rest of the way to 65.");
		if (!goal)
			System.out.println("Sorry, that target is unreachable :(");
		

	}

}
