package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pooja Mantri
 *
 */
public class Employees implements Cloneable {

	private List<String> list;

	public Employees() {
		list = new ArrayList<String>();
	}

	public Employees(List<String> list) {
		this.list = list;
	}

	public void loadData() {
		// read all employees from database and put into the list
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
	}

	public List<String> getEmployees() {
		return list;
	}

	//Deep copy
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmployees()) {
			temp.add(s);
		}
		return new Employees(temp);
	}

}