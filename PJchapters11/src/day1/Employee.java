package day1;

public class Employee {
	String name;
    int age;
    public static final int len=8;//�涨ÿ��Ա�����ֳ�Ϊ�ˣ����Ȳ����ÿո�������
    public Employee(String name,int age) {
    	super();
    	if(name.length()>len) {
    		name=name.substring(0,len);
    	}
    	else {
    		while(name.length()<len) {//���Ȳ����ÿո�������
    			name+="\u0000";
    		}
    	}
    	this.name=name;
    	this.age=age;
    }
}
