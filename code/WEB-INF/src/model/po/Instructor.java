package SystemCoding.model.po;


/**
 * @author cg
 * @version 1.0
 * @created 29-12��-2019 16:39:15
 */
public class Instructor {

	private int instr_id;
	private String instr_name;
	private String instr_password;

	public Instructor(){

	}

	public void finalize() throws Throwable {

	}

	public int getInstr_id() {
		return instr_id;
	}

	public void setInstr_id(int instr_id) {
		this.instr_id = instr_id;
	}

	public String getInstr_name() {
		return instr_name;
	}

	public void setInstr_name(String instr_name) {
		this.instr_name = instr_name.trim();
	}

	public String getInstr_password() {
		return instr_password;
	}

	public void setInstr_password(String instr_password) {
		this.instr_password = instr_password.trim();
	}
}//end Instructor