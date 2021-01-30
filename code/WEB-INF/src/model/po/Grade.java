package SystemCoding.model.po;


/**
 * @author cg
 * @version 1.0
 * @created 29-12��-2019 16:39:19
 */
public class Grade {

	private double grade;
	private double grade_end;
	private int grade_id;
	private double grade_middle;
	private String grade_name;
	private double grade_normal;
	private int stu_id;

	public Grade(){

	}

	public void finalize() throws Throwable {

	}

	public double getGrade() {
		return Double.parseDouble(String.format("%.2f",grade_middle*0.2+grade_end*0.6+grade_normal*0.2));
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public double getGrade_end() {
		return grade_end;
	}

	public void setGrade_end(double grade_end) {
		this.grade_end = grade_end;
	}

	public int getGrade_id() {
		return grade_id;
	}

	public void setGrade_id(int grade_id) {
		this.grade_id = grade_id;
	}

	public double getGrade_middle() {
		return grade_middle;
	}

	public void setGrade_middle(double grade_middle) {
		this.grade_middle = grade_middle;
	}

	public String getGrade_name() {
		return grade_name;
	}

	public void setGrade_name(String grade_name) {
		this.grade_name = grade_name.trim();
	}

	public double getGrade_normal() {
		return grade_normal;
	}

	public void setGrade_normal(double grade_normal) {
		this.grade_normal = grade_normal;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
}//end Grade