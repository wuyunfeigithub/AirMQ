package massegeProtocol;

public class IllegalMessageTypeException extends Exception {
	private static String info = "this is a illegal MessageType for this message";
	public IllegalMessageTypeException(){
		super(info);
	}
}
