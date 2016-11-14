package quanlithongtinkhoahoc;

import java.util.Set;

/*author nguyenthanhnam
 * date 10/24/2016
 */
/**
 * @author dell
 *
 */
public class student extends person{
	private int Matriculated;
	private String STUDENTID;

//constructor
	


	public student()
	{
		this.Matriculated=0;
		this.STUDENTID=" ";
	}

	/**
	 * @param Matriculated
	 * @param STUDENTID
	 */
	public student(  int Matriculated,String STUDENTID,String lastname,String firstname)
	{
		super();
		
		this.Matriculated=Matriculated;
		this.STUDENTID=STUDENTID;
	}
	//get va set
	/**
	 * @return
	 */
	public String getSTUDENTID()
	{
		return STUDENTID;
	}
	/**
	 * @param STUDENTID
	 */
	public void setSTUDENTID(String STUDENTID)
	{
		this.STUDENTID=STUDENTID;
	}
	/**
	 * @return
	 */
	public int getMatriculated()
	{
		return Matriculated;
	}
	/**
	 * @param Mariculated
	 */
	public void setMariculated(int Mariculated)
	{
		this.Matriculated=Mariculated;
	}

}
