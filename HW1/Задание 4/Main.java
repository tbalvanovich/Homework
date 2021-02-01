public class Main{
    public static void main(String[] args) {
	int number=1234;
	int newNumber=number % 10 *1000 + number/10 % 10 *100 + number/100 % 10 *10 + number/1000 % 10;


        System.out.println (number + " - " + newNumber);
}
}