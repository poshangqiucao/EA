package SystemCoding.control.action;
import SystemCoding.control.action.Result;
import java.util.*;

/**
 * @author cg
 * @version 1.0
 * @created 26-12��-2019 19:33:43
 */
public class Action2Mapping {

	private String className;
	private String method;
	private String name;
	private Map<String,Result> results;

	public Action2Mapping(){

	}

	public void finalize() throws Throwable {

	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Result> getResults() {
		return results;
	}

	public void setResults(Map<String, Result> results) {
		this.results = results;
	}
}//end Action2Mapping