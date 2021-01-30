package SystemCoding.model.po;


/**
 * @author cg
 * @version 1.0
 * @created 29-12��-2019 16:39:14
 */
public class Dean {

	private int dean_id;
	private String dean_name;
	private String dean_password;

	public Dean(){

	}

	public void finalize() throws Throwable {

	}

	public int getDean_id() {
		return dean_id;
	}

	public void setDean_id(int dean_id) {
		this.dean_id = dean_id;
	}

	public String getDean_name() {
		return dean_name;
	}

	public void setDean_name(String dean_name) {
		this.dean_name = dean_name;
	}

	public String getDean_password() {
		return dean_password;
	}

	public void setDean_password(String dean_password) {
		this.dean_password = dean_password.trim();
	}
}//end Dean