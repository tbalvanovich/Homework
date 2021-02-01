public class Main{
    public static void main(String[] args) {
	int number=124;
	if (number / 1000 == 0 && number / 100 > 0 )
		System.out.println (number + " - true Three-digit number");
	else
	System.out.println (number + " - false Three-digit number");
	
	if (number % 10 == 7 )
		System.out.println (number + " - true 7");
	else
	System.out.println (number + " - false 7");

	if (number % 2 == 0 )
		System.out.println (number + " - true even");
	else
	System.out.println (number + " - false even");

}	
}