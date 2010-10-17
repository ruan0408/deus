package it.unipr.ce.dsg.deus.example.d2v.message;

/**
 * 
 * Message base class. Is is used to exchange data between two different nodes.
 * At the moment there are not the management of the type of used protocol like UDP 
 * or TCP. These features will be added in the future version.
 *
 * Message Structure: MSG_TYPE | SenderID | DestinationID | PayLoad
 *  
 * @author Marco Picone picone@ce.unipr.it
 *
 */
public class Message {

	private String type = null;
	private int senderNodeId;
	private byte[] payload;
	private float ttl = 1000;
	
	/**
	 * Build a message instance starting from input parameters
	 * 
	 * @param type
	 * @param senderNodeId
	 * @param destinationNodeId
	 * @param payload
	 */
	public Message(String type, int senderNodeId,
			byte[] payload) {
		super();
		this.type = type;
		this.senderNodeId = senderNodeId;
		this.payload = payload;
	}
	
	public String getMessageHash()
	{
		return senderNodeId+"#"+payload;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSenderNodeId() {
		return senderNodeId;
	}
	public void setSenderNodeId(int senderNodeId) {
		this.senderNodeId = senderNodeId;
	}
	public byte[] getPayload() {
		return payload;
	}
	public void setPayload(byte[] payload) {
		this.payload = payload;
	}

	public float getTtl() {
		return ttl;
	}

	public void setTtl(float ttl) {
		this.ttl = ttl;
	}
	
	
}
