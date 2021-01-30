package SystemCoding.control.action;
import SystemCoding.control.action.Action2Mapping;
import java.util.*;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
// import java.lang.RuntimeException.RuntimeException;


/**
 * @author cg
 * @version 1.0
 * @created 26-12��-2019 20:22:49
 */
public class Action2MappingManager {

	private Map<String,Action2Mapping> allActions;

	public Action2MappingManager(){
		allActions = new HashMap<String, Action2Mapping>();
        this.init();
	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param name
	 */
	public Action2Mapping getAction2Mapping(String name){
		if (name == null) {
            // throw new RuntimeException("args err gmsstruts path");
            return null;
        }

        Action2Mapping actionMapping = allActions.get(name);
        if (actionMapping == null) {
            // throw new RuntimeException(actionName+" path not find");
            return null;
        }
        return actionMapping;

	}

	public Map<String,Action2Mapping> getAllActions(){
		return allActions;
	}

	public void init(){
		try {
            SAXReader reader = new SAXReader();
            System.out.println("reader built success!");
            InputStream in = this.getClass().getResourceAsStream("../../../../gmsstruts.xml");
            System.out.println("get resourse success!");
            Document doc = reader.read(in);
            System.out.println("get resourse success!");
            Element root = doc.getRootElement();
            Element ele_package = root.element("package");
            List<Element> listAction = ele_package.elements("action");
            for (Element e : listAction) {

                Action2Mapping actionMapping = new Action2Mapping();
                actionMapping.setName(e.attributeValue("name"));
                actionMapping.setClassName(e.attributeValue("class"));
                actionMapping.setMethod(e.attributeValue("method"));

                Map<String,Result> results = new HashMap<String,Result>();

                Iterator<Element> it = e.elementIterator("result");
                while(it.hasNext()){
                    Element ele_result = it.next();
                    Result res = new Result();
                    res.setName(ele_result.attributeValue("name"));
                    res.setType(ele_result.attributeValue("type"));
                    res.setPage(ele_result.getTextTrim());
                    results.put(res.getName(),res);
                }

                actionMapping.setResults(results);

                allActions.put(actionMapping.getName(),actionMapping);
            }

        } catch (Exception e) {
            // throw new RuntimeException("start err",e);
            e.printStackTrace();
        }

	}
}//end Action2MappingManager