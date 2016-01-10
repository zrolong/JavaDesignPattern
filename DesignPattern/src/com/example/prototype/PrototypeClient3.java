package com.example.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 
 * ʹ�����л��ͷ����л����
 * 
 * @author ���ɵĺ���
 *
 */
public class PrototypeClient3 {
	
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

		Sheep s1 = new Sheep("",new Date());
		System.out.println(s1);
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream    oos = new ObjectOutputStream(bos);
		
		oos.writeObject(s1);
		byte[] bytes = bos.toByteArray();
		
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		ObjectInputStream 	 ois = new ObjectInputStream(bis);
		
		Sheep s2 = (Sheep) ois.readObject();
		s2.setBirthday(new Date(000000000));
		System.out.println(s2);
	
	
	
	}
}