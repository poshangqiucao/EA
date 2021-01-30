package SystemCoding.model.dao;
import SystemCoding.model.dao.TeacherDaoImpl;
import SystemCoding.model.po.Grade;
/**
 * @author cg
 * @version 1.0
 * @created 01-1��-2020 15:05:09
 */
public class TeacherDaoImplTest extends junit.framework.TestCase {

	public TeacherDaoImplTest(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param arg0
	 */
	public TeacherDaoImplTest(String arg0){
		super(arg0);
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		

	}

	/**
	 * 
	 * @exception Exception
	 */
	protected void setUp()
	  throws Exception{
		super.setUp();
	}

	/**
	 * 
	 * @exception Exception
	 */
	protected void tearDown()
	  throws Exception{
		super.tearDown();
	}

	public final void testAddGrade(){
		TeacherDaoImpl tea = new TeacherDaoImpl();

		Grade gd1 = new Grade();
		gd1.setStu_id(2017210316);
		gd1.setGrade_name("dssdsa");
		gd1.setGrade_normal(32.1);
		gd1.setGrade_middle(54.6);
		gd1.setGrade_end(67.8);

		Grade gd2 = new Grade();
		gd2.setStu_id(2017210316);
		gd2.setGrade_name("dssdsaswswqs");
		gd2.setGrade_normal(33.4);
		gd2.setGrade_middle(54.3);
		gd2.setGrade_end(69.9);

		assertTrue("gd1",tea.addGrade(gd1));
		assertTrue("gd2",tea.addGrade(gd2));

	}

	public final void testDelGrade(){
		// TeacherDaoImpl tea = new TeacherDaoImpl();

		// Grade gd1 = new Grade();
		// gd1.setStu_id(2017210316);
		// gd1.setGrade_name("dssdsa");
		// gd1.setGrade_normal(32.1);
		// gd1.setGrade_middle(54.6);
		// gd1.setGrade_end(67.8);

		// Grade gd2 = new Grade();
		// gd2.setStu_id(2017210316);
		// gd2.setGrade_name("dssdsaswswqs");
		// gd2.setGrade_normal(33.4);
		// gd2.setGrade_middle(54.3);
		// gd2.setGrade_end(69.9);

		// assertTrue("gd1",tea.delGrade(gd1));
		// assertFalse("gd2",tea.delGrade(gd2));

	}

	public final void testFinalize(){

	}

	public final void testLogin(){

	}

	public final void testQueryAllGrade(){

	}

	public final void testQueryGradeByGradeName(){

	}

	public final void testQueryGradeById(){

	}

	public final void testTeacherDaoImpl(){

	}

	public final void testUpdateGrade(){

	}
}//end TeacherDaoImplTest