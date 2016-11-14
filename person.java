package quanlithongtinkhoahoc;
/*author nguyenthanhnam
 * date 10/24/2016
 */
public class person {
protected String lastname;
protected String firstname;
//CONSTRUCTOR
/**
 * @param lastname
 * @param firstname
 */
public person(String lastname,String firstname)
{
	super();
	this.firstname=firstname;
	this.lastname=lastname;
}
public person()
{
	this.firstname=" ";
	this.lastname=" ";
}
//SET VA GETTER

/**
 * @return
 */
public String getlastname(){
	return lastname ;
}
/**
 * @param lastname
 */
public void setlastname(String lastname){
	this.lastname=lastname;
}

/**
 * @return
 */
public String getfirstname(){
	return firstname ;
}
/**
 * @param firstname
 */
public void setfirstname(String firstname){
	this.firstname=firstname;
}


}
