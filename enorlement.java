package quanlithongtinkhoahoc;
/*author nguyenthanhnam
 * date 10/24/2016
 */
public class enorlement {
	private String status=" ";
	private String grade;
	private double numgrade;
	private student student;
//constructor
	/**
	 * @param i
	 * @param grades
	 * @param numgrade
	 * @param d
	 */
	public enorlement(String grades,double numgrade,String studentID,student student)
	{
		super();
	this.student=student;
		this.grade=grade;
		this.numgrade=numgrade;
		this.student=student;
		
	}
	//get va set
	/**
	 * @return
	 */

	/**
	 * @return
	 */
	public String getgrade()
	{
		return grade;
	}
	/**
	 * @param grade
	 */
	public void setgrade(String grade)
	{
		this.grade=grade;
	}
	/**
	 * @return
	 */
	public double getnumgrade()
	{
		return numgrade;
	}
	/**
	 * @param numgrade
	 */
	public boolean setnumgrade(double numgrade)
	{
		if(numgrade>=0&&numgrade<=10)
		{
			this.numgrade=numgrade;
			return true;
		}
		status+="\n diem ko hop le:";
		return false;
	}
}
