package com.example.facade;

/**
 * �ʼ��
 * @author ���ɵĺ���
 *
 */
public interface QSBureau {

	void  orgCodeCertificate();  

}

class BeiJinQSBureau implements QSBureau{
	

	@Override
	public void orgCodeCertificate() {
		System.out.println("�����ʼ�ֲ��ʼ죡");
	}
}