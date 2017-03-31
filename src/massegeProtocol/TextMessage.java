package massegeProtocol;

public class TextMessage implements MessageBody {
	private String text;
	
	public TextMessage(){
		this.text = "";
	}
	public TextMessage(String text){
		this.text = text;
	}

	@Override
	public void setTextMessage(String message) {
		this.text = message;
	}
	@Override
	public String getTextMessage() {
		return this.text;
	}
	@Override
	public void setByteMessage(byte[] message) throws IllegalMessageTypeException{
		throw new IllegalMessageTypeException();
	}
	@Override
	public byte[] setTextMessage() throws IllegalMessageTypeException{
		throw new IllegalMessageTypeException();
	}	
}
