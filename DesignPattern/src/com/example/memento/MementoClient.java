package com.example.memento;

public class MementoClient {
	
	public static void main(String[] args) {
	
		CareTaker taker = new CareTaker();
		
		Emp emp = new Emp("emp", 18, 900);
		System.out.println("��һ�δ�ӡ����"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		taker.setMemento(emp.memento());   //����һ��
		
		emp.setAge(38);
		emp.setEname("reEmp");
		emp.setSalary(9000);
		System.out.println("�ڶ��δ�ӡ����"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		emp.recovery(taker.getMemento()); //�ָ�������¼���󱣴��״̬
		
		System.out.println("�����δ�ӡ����"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
	}
}