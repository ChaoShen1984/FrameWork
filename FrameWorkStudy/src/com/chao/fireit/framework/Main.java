package com.chao.fireit.framework;

public class Main {
	
	public static void main(String[] args) {
		Boy a = BoyManager.createBoy();
		a.fireEvent(Boy.FIRE_EVENT_KILL);
	}

}
