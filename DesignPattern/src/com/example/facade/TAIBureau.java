package com.example.facade;

public interface TAIBureau{
	void checkName();  
}

class BeiJinTAIBureau implements TAIBureau{

	@Override
	public void checkName() {
		System.out.println("�������֣���˵��");
	}

}