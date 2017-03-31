package massegeProtocol;

public class ByteMessageBody implements MessageBody {
	private byte[] bytes;

	public ByteMessageBody() {
		this.bytes = null;
	}
	
	public ByteMessageBody(byte[] fileByte) {
		this.bytes = fileByte;
	}

	@Override
	public void setTextMessage(String message) throws IllegalMessageTypeException {
		throw new IllegalMessageTypeException();
	}

	@Override
	public String getTextMessage() throws IllegalMessageTypeException{
		throw new IllegalMessageTypeException();
	}

	@Override
	public void setByteMessage(byte[] message) {
		this.bytes = message;
	}

	@Override
	public byte[] setTextMessage() {
		return this.bytes;
	}	
}
