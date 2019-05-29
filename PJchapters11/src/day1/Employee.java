package day1;

public class Employee {
	String name;
    int age;
    public static final int len=8;//规定每个员工名字长为八，长度不够用空格来补偿
    public Employee(String name,int age) {
    	super();
    	if(name.length()>len) {
    		name=name.substring(0,len);
    	}
    	else {
    		while(name.length()<len) {//长度不够用空格来补偿
    			name+="\u0000";
    		}
    	}
    	this.name=name;
    	this.age=age;
    }
}
