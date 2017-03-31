package massegeProtocol;

public interface Message {
	public MessageHeader getHeader();
	public void setHeader(MessageHeader header);
	public MessageBody getBody();
	public void setBody(MessageBody body);
}
