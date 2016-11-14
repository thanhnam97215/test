package quanlithongtinkhoahoc;

import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import bai1.hoadon.ODER;
import bai1.hoadon.PRODUCT;
import bai2.sofwareuml.laptrinhvien;
import bai2.sofwareuml.nhanvien;

public class test {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		ArrayList studentlist= new ArrayList();
		for ( int i=0 ; i<studentlist.size() ; i++){
		studentlist.add(new student( 2014,"140211","hoang","dung"));
		studentlist.add(new student( 2014,"140511","tran","binh"));
		studentlist.add(new student( 2014,"140811","le","huynh"));
		studentlist.add(new student( 2013,"140611","ho","huyen"));
		}
		ArrayList enorlementlist= new ArrayList();
		for ( int i=0 ; i<studentlist.size() ; i++){
		enorlementlist.add(new enorlement( "tam phay nam",8.5,"140211",(student)studentlist.get(i)));
		enorlementlist.add(new enorlement( "chin phay nam",9.5,"140511",(student)studentlist.get(i)));
		enorlementlist.add(new enorlement( "bay phay 0",8.5,"140811",(student)studentlist.get(i)));
		enorlementlist.add(new enorlement( "nam phay nam",8.5,"140611",(student)studentlist.get(i)));
		}
		
		 GregorianCalendar  calendar = new GregorianCalendar(2016,1,6);
		 //Locale local =new Locale("vi","VN");//Vietnam
		
		 //Locale local =new Locale("it","IT");//Italy
		 
		 Locale local =new Locale("vi","VN");//Hungarian
		 SimpleDateFormat dateformat= new SimpleDateFormat("dd/MM/yyyy",local);
		 System.out.println(dateformat.format(calendar.getTime()));
		 
		 ArrayList faculitylist= new ArrayList();
			for ( int i=0 ; i<studentlist.size() ; i++){
		faculitylist.add(new FACULITY("le","kim khanh","dfhfh","H5.01"));
		
			}
			 ArrayList courselist = new ArrayList();
			course course1 = new course("00P","LAPTRINHHUONGDOITUONG",4);
			for ( int i=0 ; i<studentlist.size() ; i++){
			course1.addSection("0602", "I(2015-2016)", "H5.01",(FACULITY)faculitylist.get(3),(enorlement)enorlementlist.get(i));
			}
			courselist.add(course1);
			
			/*for(int i=0; i<orderList.size();i++)
			{
				System.out.println(((Order)orderList.get(i)).toString());
			}*/
			for(Object obj:courselist)
			{
				System.out.println(((course)obj));
			}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		
//		Scanner in=new Scanner(System.in);
//		// TODO Auto-generated method stub
//		int x;
//		do
//		{
////		System.out.println("khoa hoc:[ OOP- LAP TRINH HUONG DOI TUONG(4TC)");
////		System.out.println("---- THONG TIN HOC PHAN-------");
//		System.out.println("0.thoat ung dung");
//		System.out.println("1.danh sach giang vien");
//		System.out.println("2.danh sach sinh vien");
//		System.out.println("3.khoa hoc");
//		System.out.println("4.lap danh sach sinh vien (enorlement)tham gia vao 1 khoa hoc");
//		System.out.println("5.in ra man hinh theo mau");
//		x=in.nextInt();
//		System.out.println("======>>");
//		switch(x)
//		{
//		case 1:
//			FACULITY FACULITY1=new FACULITY("LE","kimkhanh","vddsvsd","H5.01");
//			System.out.println(FACULITY1);
//			break;
//		case 2:
//			student student1=new student(4,"140211","hoang","dung");
//			student student2=new student(4,"140511","tran","binh");
//			student student3=new student(4,"140811","ho","huyen");
//			student student4=new student(4,"140611","le","huynh");
//			System.out.println(student1);
//			System.out.println(student2);
//			System.out.println(student3.toString());
//			System.out.println(student4.toString());
//			break;
//		case 3:
//			course course1=new course("I(2015-2016)",	"KHOA HOC-[OOP -LAPTRINH HUONG DOI TUONG]",0602);
//			System.out.println( course1);
//			break;
//		case 4:
//			enorlement enorlement1=new enorlement("tong ket",8.5," 140211");
//			break;
//		case 5:
//			System.out.println("khoa hoc:[ OOP- LAP TRINH HUONG DOI TUONG(4TC)");
//			System.out.println("---- THONG TIN HOC PHAN-------");
//			course course2=new course("I(2015-2016)",	"KHOA HOC-[OOP -LAPTRINH HUONG DOI TUONG]",0602);
//			System.out.println( course2.toString());
//			FACULITY FACULITY2=new FACULITY("LE","kimkhanh","vddsvsd","H5.01");
//			System.out.println(FACULITY2.toString());
//			System.out.println("---- DANHSACHSINHVIEN-------");
//			student student6=new student(4,"140211","hoang","dung");
//			student student7=new student(4,"140511","tran","binh");
//			student student8=new student(4,"140811","ho","huyen");
//			student student9=new student(4,"140611","le","huynh");
//			System.out.println(student9.toString());
//			System.out.println(student6.toString());
//			System.out.println(student7.toString());
//			System.out.println(student8.toString());
//			break;
//			
//		}
//	}while(x!=0);
//}
//}

		
		
		


