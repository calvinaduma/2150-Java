import java.util.*;
import java.io.*;

public class HelloWorld {
	public static void main(String[] args) {
		int x = 20;
		System.out.println(x);
		Scanner scannerObject = new Scanner(System.in);
		String input = scannerObject.nextLine();
		System.out.println(x+input);
	}
}
