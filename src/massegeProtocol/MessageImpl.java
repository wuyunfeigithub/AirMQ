package massegeProtocol;

public class MessageImpl implements Message {
	private MessageHeader header;
	private MessageBody body;

	@Override
	public MessageHeader getHeader() {
		return this.header;
	}

	@Override
	public void setHeader(MessageHeader header) {
		this.header = header;
	}

	@Override
	public MessageBody getBody() {
		return this.body;
	}

	@Override
	public void setBody(MessageBody body) {
		this.body = body;
	}
}
