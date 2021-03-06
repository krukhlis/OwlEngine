package com.owlengine.interfaces;

public interface Event {

	public static final int NULL = 0;
	
	// User Input Events
	// mouse
	public static final int MOUSE_MOVE = 1;
	public static final int MOUSE_DRAG = 2;
	public static final int MOUSE_KEY_LEFT = 3;
	public static final int MOUSE_KEY_RIGHT = 4;
	public static final int MOUSE_KEY_MIDDLE = 5;
	public static final int MOUSE_KEY_FORWARD = 6;
	public static final int MOUSE_KEY_BACK = 7;
	public static final int MOUSE_SCROLL = 8;
	public static final int MOUSE_KEY_UP = 9;
	
	// keys
	public static final int KEY_DOWN = 10;
	public static final int KEY_UP = 11;
	public static final int KEY_TYPE = 12;

	// Scene events
	public static final int SCENE_LOAD = 13;
	public static final int SCENE_CLOSE = 14;
	
	// Methods
	public void event(int code);
	public void event(int code, int data);
	public void event(int code, char data);
	public void customEvent(int code, Object data);
}
