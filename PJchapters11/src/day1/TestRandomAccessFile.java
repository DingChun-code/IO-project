package day1;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
public static void main(String[] args) throws Exception {
	Employee e1=new Employee("zhangsan",18);
	Employee e2=new Employee("����",26);
	Employee e3=new Employee("wangwu",22);
	RandomAccessFile raf=new RandomAccessFile("a.txt","rw");//�������ļ����������
	raf.writeChars(e1.name);
	raf.writeInt(e1.age);
	raf.writeChars(e2.name);
	raf.writeInt(e2.age);
	raf.writeChars(e3.name);
	raf.writeInt(e3.age);
	RandomAccessFile raf1=new RandomAccessFile("a.txt","r");//���ļ�����д�������
	raf1.skipBytes((Employee.len)*2+4);//һ���ַ������ֽڣ�һ��int�ĸ��ֽ�,������һ��
	String strname="";
	for(int i=0;i<Employee.len;i++){
		strname+=raf1.readChar();
	}
	System.out.println(strname.trim()+":"+raf1.readInt());
	raf1.seek(0);
	String strname1="";
	for(int i=0;i<Employee.len;i++){
		strname1+=raf1.readChar();
	}
	System.out.println(strname1.trim()+":"+raf1.readInt());
	raf1.skipBytes((Employee.len)*2+4);
	String strname2="";
	for(int i=0;i<Employee.len;i++){
		strname2+=raf1.readChar();
	}
	System.out.println(strname2.trim()+":"+raf1.readInt());
}
}
