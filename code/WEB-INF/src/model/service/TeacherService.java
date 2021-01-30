package SystemCoding.model.service;

import java.util.ArrayList;

import SystemCoding.model.dao.ITeacherDao;
import SystemCoding.model.factory.TeacherFactory;
import SystemCoding.model.po.Grade;
import SystemCoding.model.po.Teacher;

/**
 * @author cheng
 * @version 1.0
 * @created 01-11��-2019 16:43:42
 */
public class TeacherService {

	public TeacherService(){

	}

	public void finalize() throws Throwable {

	}
	public boolean addTea(Teacher tea){
		ITeacherDao teaimpl = TeacherFactory.getTeacherDaoImpl();
		if(teaimpl.addTea(tea)){
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
		ITeacherDao teaimpl = TeacherFactory.getTeacherDaoImpl();
		if(teaimpl.addGrade(grade)){
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
		System.out.println(stringToMD5.toMD5(tea.getTea_password()));
		if(String.valueOf(tea.getTea_id()).length()!=6||tea.getTea_password().length()>20){
			return false;
		}else{
			tea.setTea_password(stringToMD5.toMD5(tea.getTea_password()));
			ITeacherDao teaimpl = TeacherFactory.getTeacherDaoImpl();
			if(teaimpl.login(tea)){
				return true;
			}else{
				return false;
			}
		}
		
	}

	public boolean updateGrade(Grade grade){
		ITeacherDao teaimpl = TeacherFactory.getTeacherDaoImpl();
		if(teaimpl.updateGrade(grade)){
			return true;
		}else{
			return false;
		}
	}

	public boolean delGrade(Grade grade){
		ITeacherDao teaimpl = TeacherFactory.getTeacherDaoImpl();
		if(teaimpl.delGrade(grade)){
			return true;
		}else{
			return false;
		}

	} 	

	public ArrayList<Grade> queryGradeById(Grade grade){
		ITeacherDao teaimpl = TeacherFactory.getTeacherDaoImpl();
		return teaimpl.queryGradeById(grade);

	} 
	
	public ArrayList<Grade> queryGradeByGradeName(Grade grade){
		ITeacherDao teaimpl = TeacherFactory.getTeacherDaoImpl();
		return teaimpl.queryGradeByGradeName(grade);

	} 

	public ArrayList<Grade> queryAllGrade(){
		ITeacherDao teaimpl = TeacherFactory.getTeacherDaoImpl();
		return teaimpl.queryAllGrade();

	} 

	public ArrayList<Teacher> queryAllTea(){
		ITeacherDao teaimpl = TeacherFactory.getTeacherDaoImpl();
		return teaimpl.queryAllTea();

	} 

	


}//end TeacherService