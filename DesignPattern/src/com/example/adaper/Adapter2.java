package com.example.adaper;

/**
 * 
 * @author ���ɵĺ���
 *
 */
public class Adapter2 implements Target{
	
	private Adaptee adaptee;
	
	
	public Adapter2(Adaptee adaptee) {
		this.adaptee = adaptee;
	}


	@Override
	public void handleReq() {
		adaptee.request();
	}

}
