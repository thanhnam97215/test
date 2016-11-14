package quanlithongtinkhoahoc;
/*author nguyenthanhnam
 * date 10/24/2016
 */
import java.util.Set;

public class section {

	private String semester;
	private String sectionNbr;
	private String room;
	private FACULITY facultyMember;
	private Set<enorlement> listEnrolls ;
	//constructor
	/**
	 * @param semester
	 * @param sectionNbr
	 * @param room
	 * @param faculityMember
	 * @param listEnrolls
	 */
	public section(String semester,String sectionNbr,String room)
	{
		super();
		this.semester=semester;
		this.sectionNbr=sectionNbr;
		this.room=room;
		
	}

	public section()
	{

	
		this.semester=semester;
		this.sectionNbr=sectionNbr;
		this.room=room;
		this.facultyMember=facultyMember;
		this.listEnrolls=listEnrolls;
	}
	//get va set
	/**
	 * @return
	 */
	public String getsemester()
	{
		return semester;
	}
	/**
	 * @param semester
	 */
	public void setsemester(String semester)
	{
		this.semester=semester;
	}
	/**
	 * @return
	 */
	public String getsectionNrb()
	{
		return sectionNbr;
	}
	/**
	 * @param sectionNrb
	 */
	public void setsectionNrb(String sectionNrb)
	{
		this.sectionNbr=sectionNrb;
	}
	/**
	 * @return
	 */
	public String getroom()
	{
		return room;
	}
	/**
	 * @param room
	 */
	public void setroom(String room)
	{
		this.room=room;
	}

}
