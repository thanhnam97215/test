package quanlithongtinkhoahoc;

import java.util.ArrayList;
import java.util.Set;

import bai1.hoadon.oderdetail;
import bai2.sofwareuml.nhanvien;

public class course  {
	private String courseNbr;
	private String courseTitle;
	private int credits;
	private Set<section> sections;
	
	
	ArrayList<student> ds=new ArrayList<>();
	//
	/**
	 * @param sectionNbr
	 * @return
	 */
	public int getNbrStudents(String sectionNbr){
		return credits;
	//body of the method
	}
	/**
	 * @param sectionNbr
	 * @param semester
	 * @param room
	 * @param facultyMember
	 * @param listEnrolls
	 */
	public void addSection(String sectionNbr, String semester,String room,FACULITY facultyMember,enorlement listEnrolls){
	//body of the method
		student section = new student();
		ds.add(section);
		
}
	
	
	//constructor

public course()
	{
	super();
		this.courseNbr=" ";
		this.courseTitle=" ";
		this.credits=0;
	}
	/**
	 * @param courseNbr
	 * @param courseTitle
	 * @param credits
	 */
	public course(String courseNbr,String courseTitle,int credits)
	{
		this.courseNbr=courseNbr;
		this.courseTitle=courseTitle;
		this.credits=credits;
	}
	
	
	//get va set
	public String getCourseNbr() {
		return courseNbr;
	}
	/**
	 * @param courseNbr
	 */
	public void setCourseNbr(String courseNbr) {
		this.courseNbr = courseNbr;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	/**
	 * @param courseTitle
	 */
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public int getCredits() {
		return credits;
	}
	/**
	 * @param credits
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}

}


