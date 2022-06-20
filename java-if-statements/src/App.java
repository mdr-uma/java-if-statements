
public class App {
	public static void main(String[] args) {
		int num = 40;
		
		//simple if statement where if condition meets print something otherwise nothing to print
		if(5 > 4) {
			System.out.println("It's true");
		}
		
		//if statement with else where, if the condition is true print something otherwise print the else statement		
		if(num == 30) {
			System.out.println("It's true");
		}else{
			System.out.println("It's False");
		}
		
		//if statement with else if. You can have if else as many as you want		
		if(num == 30) {
			System.out.println("It's true");
		}else if(num > 40){
			System.out.println("It's False");
		}else {
			System.out.println("None of the above");
		}
	}

}
