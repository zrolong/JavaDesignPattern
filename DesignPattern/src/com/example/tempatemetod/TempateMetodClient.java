package com.example.tempatemetod;

/**
 * ģ�巽�� -- �ص�����
 * 
 * @author ���ɵĺ���
 *
 */
public class TempateMetodClient {
	
	public static void main(String[] args) {
	
		BankTemplateMethod btm = new DrawMoney();
		btm.process();

		//���������ڲ���
		BankTemplateMethod btm2 = new BankTemplateMethod() {

			@Override
			public void transact() {
				System.out.println("��Ҫ��Ǯ��");
			}
		};
		btm2.process();

		BankTemplateMethod btm3 = new BankTemplateMethod() {
			@Override
			public void transact() {
				System.out.println("��Ҫ���ƣ���������2000��");
			}
		};

		btm3.process();

	}
}

class DrawMoney extends BankTemplateMethod {

	@Override
	public void transact() {
		System.out.println("��Ҫȡ�����");
	}

}