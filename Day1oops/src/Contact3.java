
public class Contact3 {

	private int contactid;
	private String FirstName;
	private long mobileeno;
	private String email;
	private String company;
	public Contact3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact3(int contactid, String firstname, long mobileno, String email, String company) {
		
		this.contactid = contactid;
		this.FirstName = firstname;
		this.mobileeno = mobileeno;
		this.email = email;
		this.company = company;
	}
	public int getContactid() {
		return contactid;
	}
	public void setContactid(int contactid) {
		this.contactid = contactid;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public long getMobileeno() {
		return mobileeno;
	}
	public void setMobileeno(long mobileeno) {
		this.mobileeno = mobileeno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Contact3 [contactid=" + contactid + ", FirstName=" + FirstName + ", mobileeno=" + mobileeno + ", email="
				+ email + ", company=" + company + "]";
	}
	

	
}
