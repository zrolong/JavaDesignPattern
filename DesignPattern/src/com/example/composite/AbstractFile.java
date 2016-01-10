package com.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ���ɵĺ���
 *
 */

public interface AbstractFile {
	void killVirus();
}

class  ImageFile implements AbstractFile{
	
	private String name;
	
	public ImageFile(String name){
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("ImageFile��" + name + "���в�ɱ");
	}
}

class  TextFile implements AbstractFile{
	
	private String name;
	
	public TextFile(String name){
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("TextFile��" + name + "���в�ɱ");
	}
}

class  VideoFile implements AbstractFile{
	
	private String name;
	
	public VideoFile(String name){
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("VideoFile��" + name + "���в�ɱ");
	}
}

class Folder implements AbstractFile{
	
	private String name;
	private List<AbstractFile> list = new ArrayList<>();
	
	public Folder(String name) {
		super();
		this.name = name;
	}

	@Override
	public void killVirus() {
		System.out.println("�ļ���" + name + "�����в�ɱ��"); 
		for(AbstractFile file : list){
			file.killVirus();
		}
	}
	
	public void add(AbstractFile file){
		list.add(file);
	}
	
	public void remove(AbstractFile file){
		list.remove(file);
	}
	
	public AbstractFile getChaild(int index){
		
		return list.get(index);
	}
	
}