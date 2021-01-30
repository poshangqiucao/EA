package SystemCoding.model.factory;

import SystemCoding.model.dao.ITeacherDao;
import SystemCoding.model.dao.TeacherDaoImpl;

/**
 * @author cheng
 * @version 1.0
 * @created 15-12��-2019 17:22:42
 */
public class TeacherFactory {

	public TeacherFactory(){

	}

	public void finalize() throws Throwable {

	}
	public static ITeacherDao getTeacherDaoImpl(){
		return new TeacherDaoImpl();
	}
}//end TeacherFactory