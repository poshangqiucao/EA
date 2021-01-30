package SystemCoding.model.po;


/**
 * @author cg
 * @version 1.0
 * @created 29-12��-2019 16:39:10
 */
public class Admin {

	private int admin_id;
	private String admin_password;

	public Admin(){

	}

	public void finalize() throws Throwable {

	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password.trim();
	}
}//end Admin