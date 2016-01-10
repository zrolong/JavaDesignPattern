package com.example.composite;

/**
 * �������
 * @author ���ɵĺ���
 */
public interface Component {
	void operation();
}
/**
 * Ҷ��
 * @author ���ɵĺ���
 *
 */
interface Leaf extends Component{
	
}
/**
 * �������
 * @author ���ɵĺ���
 *
 */
interface Composite extends Component{
	void add();
	void remove();
	Component getChild(int index);
}