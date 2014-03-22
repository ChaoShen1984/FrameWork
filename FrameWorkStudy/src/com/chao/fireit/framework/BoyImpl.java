package com.chao.fireit.framework;

public class BoyImpl implements Boy, FireIt{

	private LoveHandler loveHandler;
	private EatHandler eatHandler;
	private KillHandler killHandler;
	public BoyImpl(){
		loveHandler = new LoveHandler();
		eatHandler = new EatHandler();
		killHandler = new KillHandler();
		setFireMap(FIRE_EVENT_LOVE, loveHandler);
		setFireMap(FIRE_EVENT_KILL, killHandler);
		setFireMap(FIRE_EVENT_EAT, eatHandler);
	}
	public void fireIt(int fireType) {
		fireMap.get(fireType).handle();
	}

	public void setFireMap(int fireType, FireEventHandler handler) {
		fireMap.put(fireType, handler);
	}
	
	public void fireEvent(int fireType) {
		fireIt(fireType);
	}
}

class LoveHandler extends FireEventHandler{

	public void handle() {
		System.out.println("I love it!");
	}
}

class KillHandler extends FireEventHandler{

	public void handle() {
		System.out.println("I kill it!");
	}
}

class EatHandler extends FireEventHandler{

	public void handle() {
		System.out.println("I eat it!");
	}
}
