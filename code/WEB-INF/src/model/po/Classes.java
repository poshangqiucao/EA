package SystemCoding.model.po;


/**
 * @author cg
 * @version 1.0
 * @created 29-12��-2019 16:39:13
 */
public class Classes {

	private int class_id;
	private String class_name;
	private int class_num;

	public Classes(){

	}

	public void finalize() throws Throwable {

	}

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name.trim();
	}

	public int getClass_num() {
		return class_num;
	}

	public void setClass_num(int class_num) {
		this.class_num = class_num;
	}
}//end Classes