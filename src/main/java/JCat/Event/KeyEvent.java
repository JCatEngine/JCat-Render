package JCat.Event;

public class KeyEvent extends Event{

	/**
	 * key up event
	 */
	static public String KEY_UP="keyup";
	/**
	 * key down event
	 */
	static public String KEY_DOWN="keydown";
	
	
	/**
	 * keycode of the event,compare with the field in Keycode class to know which key 
	 */
	public int keyCode;
	/**
	 * key char
	 */
	public String keyChar;
	
	
	public KeyEvent(String type) {
		super(type);
		
		
	}
	
	@Override
	public KeyEvent clone() {
		
		KeyEvent event=new KeyEvent(type);
		event.keyCode=keyCode;
		event.keyChar=keyChar;
		defaultClone(event);
		
		return event;
		
	}

	@Override
	public String toString() {
		return "KeyEvent [keyCode=" + keyCode + ", " + (type != null ? "type=" + type + ", " : "")
				+ (currentTarget != null ? "currentTarget=" + currentTarget + ", " : "")
				+ (eventPhase != null ? "eventPhase=" + eventPhase + ", " : "")
				+ (target != null ? "target=" + target + ", " : "") + "bubbles=" + bubbles + ", isStop=" + isStop + "]";
	}

	
	
	
	
}
