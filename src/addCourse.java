/**
 * class used to extract contents from the database table "addcourse"
 *
 */
public class addCourse {
	private String term, course, description;
	
	public addCourse(String term, String course, String description)
	{
		this.term=term;
		this.course=course;
		this.description=description;
		
	}
	public String getterm()
	{
		return term;
	}
	public String getcourse()
	{
		return course;
	}
	public String getdescription()
	{
		return description;
	}
}
