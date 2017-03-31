package massegeProtocol;

public class MessageHeader {
	public String getAMS_Source() {
		return AMS_Source;
	}
	public void setAMS_Source(String aMS_Source) {
		AMS_Source = aMS_Source;
	}
	public String getAMS_Destination() {
		return AMS_Destination;
	}
	public void setAMS_Destination(String aMS_Destination) {
		AMS_Destination = aMS_Destination;
	}
	public long getAMS_MessageID() {
		return AMS_MessageID;
	}
	public void setAMS_MessageID(long aMS_MessageID) {
		AMS_MessageID = aMS_MessageID;
	}
	public int getAMS_Type() {
		return AMS_Type;
	}
	public void setAMS_Type(int aMS_Type) {
		AMS_Type = aMS_Type;
	}
	public int getAMS_Status() {
		return AMS_Status;
	}
	public void setAMS_Status(int aMS_Status) {
		AMS_Status = aMS_Status;
	}
	private String AMS_Source;
	private String AMS_Destination;
	private long AMS_MessageID;
	private int AMS_Type;
	private int AMS_Status;
}
