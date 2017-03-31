package massegeProtocol;

public interface MessageBody {
	public void setTextMessage(String message) throws IllegalMessageTypeException;
	public String getTextMessage() throws IllegalMessageTypeException;
	public void setByteMessage(byte[] message) throws IllegalMessageTypeException;
	public byte[] setTextMessage() throws IllegalMessageTypeException;
}
