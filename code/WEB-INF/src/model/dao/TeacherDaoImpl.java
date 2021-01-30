package SystemCoding.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import SystemCoding.model.po.Grade;
import SystemCoding.model.po.Teacher;
import SystemDesign.model.dbutil.DbUtil;
/**
 * @author cheng
 * @version 1.0
 * @created 15-12��-2019 17:16:01
 */
public class TeacherDaoImpl implements ITeacherDao {

	public TeacherDaoImpl(){

	}

	public void finalize() throws Throwable {

	}
	public boolean addTea(Teacher tea){
		String sql = "insert into `teacher` (`TeacherID`,`Tea_password`) values(?,?)";
		PreparedStatement ps = DbUtil.executePreparedStatement(sql);
		int i = 0;
		try {
			ps.setInt(1, tea.getTea_id());
			ps.setString(2, tea.getTea_password());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close();
		}
		if(i>0){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * 
	 * @param grade
	 */
	public boolean addGrade(Grade grade){
		String sql = "insert into `grade` (`StudentID`,`Grade_name`,`Grade`,`Grade_middle`,`Grade_normal`,`Grade_end`) values(?,?,?,?,?,?)";
		PreparedStatement ps = DbUtil.executePreparedStatement(sql);
		int i = 0;
		try {
			ps.setInt(1, grade.getStu_id());
			ps.setString(2, grade.getGrade_name());
			ps.setDouble(3, grade.getGrade());
			ps.setDouble(4, grade.getGrade_middle());
			ps.setDouble(5,grade.getGrade_normal());
			ps.setDouble(6, grade.getGrade_end());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close();
		}
		if(i>0){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 
	 * @param tea
	 */
	public boolean login(Teacher tea){
		String sql = "select count(*) as num from teacher where TeacherID=? and Tea_password=?";
		PreparedStatement ps = DbUtil.executePreparedStatement(sql);
		int i = 0;
		try {
			ps.setInt(1, tea.getTea_id());
			ps.setString(2, tea.getTea_password());
			ResultSet data = ps.executeQuery();
			while(data.next()){
				i = data.getInt("num");
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close();
		}
		
		if(i>0){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 
	 * @param grade
	 */
	public boolean delGrade(Grade grade){
		String sql = "delete from grade where StudentID=? AND Grade_name=?";
		PreparedStatement ps = DbUtil.executePreparedStatement(sql);
		int i = 0;
		try {
			ps.setInt(1, grade.getStu_id());
			ps.setString(2, grade.getGrade_name());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close();
		}
		
		if(i>0){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 
	 * @param grade
	 */
	public boolean updateGrade(Grade grade){
		String sql = "update `grade` set `Grade` = ?,`Grade_normal`=?,`Grade_middle`=?,`Grade_end`=? where StudentID=? AND Grade_name=?";
		PreparedStatement ps = DbUtil.executePreparedStatement(sql);
		int i = 0;
		try {
			ps.setDouble(1, grade.getGrade());
			ps.setDouble(3, grade.getGrade_middle());
			ps.setDouble(2,grade.getGrade_normal());
			ps.setDouble(4, grade.getGrade_end());
			ps.setInt(5, grade.getStu_id());
			ps.setString(6, grade.getGrade_name());
			i = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close();
		}
		
		if(i>0){
			return true;
		}else{
			return false;
		}

	}

	public ArrayList<Grade> queryGradeById(Grade grade){
		String sql = "select * from grade where StudentID=?";
		PreparedStatement ps = DbUtil.executePreparedStatement(sql);
		ArrayList<Grade> grade_list = new ArrayList<Grade>();
		try {
			ps.setInt(1, grade.getStu_id());
			ResultSet data = ps.executeQuery();
			while(data.next()){
				Grade gd = new Grade();
				gd.setStu_id(data.getInt("StudentID"));
				gd.setGrade(data.getFloat("Grade"));
				gd.setGrade_name(data.getString("Grade_name"));
				gd.setGrade_middle(data.getDouble("Grade_middle"));
				gd.setGrade_normal(data.getDouble("Grade_normal"));
				gd.setGrade_end(data.getDouble("Grade_end"));
				grade_list.add(gd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close();
		}
		return grade_list;
	}

	public ArrayList<Grade> queryGradeByGradeName(Grade grade){
		String sql = "select * from grade where Grade_name=?";
		PreparedStatement ps = DbUtil.executePreparedStatement(sql);
		ArrayList<Grade> grade_list = new ArrayList<Grade>();
		try {
			ps.setString(1, grade.getGrade_name());
			ResultSet data = ps.executeQuery();
			while(data.next()){
				Grade gd = new Grade();
				gd.setStu_id(data.getInt("StudentID"));
				gd.setGrade(data.getFloat("Grade"));
				gd.setGrade_name(data.getString("Grade_name"));
				gd.setGrade_middle(data.getDouble("Grade_middle"));
				gd.setGrade_normal(data.getDouble("Grade_normal"));
				gd.setGrade_end(data.getDouble("Grade_end"));
				grade_list.add(gd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close();
		}
		return grade_list;
	}

	public ArrayList<Grade> queryAllGrade(){
		String sql = "select * from grade";
		ArrayList<Grade> grade_list = new ArrayList<Grade>();
		try {
			ResultSet data = DbUtil.executeQuery(sql);
			while(data.next()){
				Grade gd = new Grade();
				gd.setStu_id(data.getInt("StudentID"));
				gd.setGrade(data.getFloat("Grade"));
				gd.setGrade_name(data.getString("Grade_name"));
				gd.setGrade_middle(data.getDouble("Grade_middle"));
				gd.setGrade_normal(data.getDouble("Grade_normal"));
				gd.setGrade_end(data.getDouble("Grade_end"));
				grade_list.add(gd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close();
		}
		return grade_list;
	}

	public ArrayList<Teacher> queryAllTea(){
		String sql = "select * from teacher";
		ArrayList<Teacher> tea_list = new ArrayList<Teacher>();
		try {
			ResultSet data = DbUtil.executeQuery(sql);
			while(data.next()){
				Teacher gd = new Teacher();
				gd.setTea_id(data.getInt("TeacherID"));
				gd.setTea_password(data.getString("Tea_password"));
				gd.setTea_name(data.getString("Tea_name"));
				tea_list.add(gd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close();
		}
		return tea_list;
	}

}//end TeacherDaoImpl