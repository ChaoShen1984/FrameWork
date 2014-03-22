package com.chao.fireit.framework;

/**
 * Use this interface to hide function from implementation level.
 * 
 * @author Chao
 *
 */
public interface Boy{

	public static final int FIRE_EVENT_LOVE = 0;
	public static final int FIRE_EVENT_KILL = 1;
	public static final int FIRE_EVENT_EAT = 2;
	
	public void fireEvent(int fireType);
}