package keyboardInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) throws FileNotFoundException {
		int number;
		String dNumber;
		String name;
		double sum;
		Scanner fileSc = new Scanner(new File("in.txt"));
		number = fileSc.nextInt();
		dNumber = fileSc.next();
		name = fileSc.next();
		fileSc.close();
		sum = Double.valueOf(dNumber) + number;
		System.out.println("name: " + name + "\n" + "number: " + number + "\n" + "Double: " + dNumber + "\n" + "Sum: " + sum);
	}

}
