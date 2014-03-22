package com.chao.fireit.framework;

import java.util.HashMap;
/**
 * Fire event listener.
 * @author Chao
 *
 */
public interface FireIt {

	HashMap<Integer, FireEventHandler> fireMap = new HashMap<Integer, FireEventHandler>();

	public void fireIt(int fireType);

	public void setFireMap(int fireType, FireEventHandler handler);
}
