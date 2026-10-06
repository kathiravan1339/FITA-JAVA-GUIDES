package fita.guides.exception.handling;

import java.io.IOException;

public class DataSender {
	// 1. "throws" warns the caller they must handle IOException
	public void sendData(int systemCode) throws IOException {
		if (systemCode < 0) {
			// 2. "throw" actively triggers the exception object
			throw new IOException("Invalid system code: " + systemCode);
		}
		System.out.println("Data sent successfully.");
	}
}
