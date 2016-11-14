package quanlithongtinkhoahoc;
/*author nguyenthanhnam
 * date 10/24/2016
 */
public class FACULITY extends person{
	private String FaculityID;
	private String office;
	FACULITY[] faculitylist;
	
//constructor
	/**
	 * 
	 */
	public FACULITY()
	{
		this.FaculityID=" ";
		this.office=" ";
	}
	/**
	 * @param firstname
	 * @param lastname
	 * @param FACULITYID
	 * @param office
	 */
	public FACULITY(String firstname,String lastname,String FACULITYID,String office)
	{
		super(firstname,lastname);
		this.FaculityID=FACULITYID;
		this.office=office;
	}
	//get va set
	/**
	 * @return
	 */
	public String getFACULITYID()
	{
		return FaculityID;
	}
	/**
	 * @param FaculityID
	 */
	public void setFaculityID(String FaculityID)
	{
		this.FaculityID=FaculityID;
	}
	/**
	 * @return
	 */
	public String getoffice()
	{
		return office;
	}
	/**
	 * @param office
	 */
	public void setoffice(String office)
	{
		this.office=office;
	}
	

}
