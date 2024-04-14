import iooperations.InputOperations;
import iooperations.OutputOperations;


class Main {
	public static void main(String[] args) {
		InputOperations input = new InputOperations();
		OutputOperations output = new OutputOperations();

		output.print("Enter your name:");
		String name = input.readString();
		output.print("Hello, " + name);
	}
}