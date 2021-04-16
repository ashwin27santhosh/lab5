package lab5;

public class ageException extends Exception {
	private String excMsg = "";

	public AgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeException(String message) {
		super(message);
		this.excMsg = message;
	}

	@Override
	public String toString() {
		return "Age Exception :- "+excMsg;
	}
}