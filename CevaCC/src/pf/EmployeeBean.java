package pf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class EmployeeBean {
	private List<Employee> employeeList = new ArrayList<Employee>();
	
	

	public EmployeeBean() {
		for(int i=0; i< 10; i ++) {
			Employee employee = new Employee();
			employee.setId(i);
			employee.setName("Mohammad "+i);
			employee.setAddress("USA"+i);
			employee.setPhoneNumber("5555 "+i);
			
			employeeList.add(employee);
			
		}
	}



	public List<Employee> getEmployeeList() {
		return employeeList;
	}
}