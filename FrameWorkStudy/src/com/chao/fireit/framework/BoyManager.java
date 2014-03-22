package com.chao.fireit.framework;
/**
 * Manager class for boy. 
 * @author Chao
 *
 */
class BoyManager {
	
	public static BoyImpl createBoy(){
		BoyImpl boy = new BoyImpl();
		return boy;
	}

}
