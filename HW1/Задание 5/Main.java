public class Main{
    public static void main(String[] args) {
	int number=1234;
	int a = number % 10;
	int b = number/10 % 10;
	int c = number/100 % 10;
	int d = number/1000 % 10;
	if (a != b && a!=c && a!=d && b!=c && b!=d && c!=d)
		System.out.println (number + " - different");
	else
	System.out.println (number + " - same");

}
}