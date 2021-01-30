package SystemCoding.model.dao;

import java.util.ArrayList;

import SystemCoding.model.po.Grade;
import SystemCoding.model.po.Teacher;

/**
 * @author cheng
 * @version 1.0
 * @created 15-12��-2019 17:15:58
 */
public interface ITeacherDao {

	/**
	 * 
	 * @param grade
	 */
	public boolean addGrade(Grade grade);

	/**
	 * 
	 * @param tea
	 */
	public boolean login(Teacher tea);

	/**
	 * 
	 * @param grade
	 */
	public boolean delGrade(Grade grade);

	/**
	 * 
	 * @param grade
	 */
	public boolean updateGrade(Grade grade);

	/**
	 * 
	 * @param grade
	 */
	public ArrayList<Grade> queryGradeById(Grade grade);

	/**
	 * 
	 * @param grade
	 */
	public ArrayList<Grade> queryGradeByGradeName(Grade grade);

	public ArrayList<Grade> queryAllGrade();
	public boolean addTea(Teacher tea);
	public ArrayList<Teacher> queryAllTea();

}