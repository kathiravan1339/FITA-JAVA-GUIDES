package fita.guides.exception.handling;

import java.io.IOException;

public class PropagationExample {

	// 1. This method originates the problem.
	// It refuses to handle it, so it uses 'throws' to pass the buck up.
	public void readFile() throws IOException {
		throw new IOException("File missing!");
	}

	// 2. This method calls readFile(). It ALSO refuses to handle it,
	// so it uses 'throws' to propagate it even further up.
	public void processData() throws IOException {
		readFile();
	}

	// 3. Main is the final stop. It finally catches and resolves it.
	public static void main(String[] args) {
		PropagationExample example = new PropagationExample();
		try {
			example.processData(); // The exception propagated all the way here

			DataSender dataSender = new DataSender();
			dataSender.sendData(1);
		} catch (IOException e) {
			System.out.println("Exception caught and handled in main: " + e.getMessage());
		}

	}
}
