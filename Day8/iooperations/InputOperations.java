package iooperations;

import java.util.Scanner;
public class InputOperations {	
	private Scanner scanner;

	public InputOperations() {
		this.scanner = new Scanner(System.in);
	}

	public String readString() {
		return this.scanner.nextLine();
	}

	public int readInt() {
		return this.scanner.nextInt();
	}
	public double readDouble() {
		return this.scanner.nextDouble();
	}
}



