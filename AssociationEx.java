package Association;

import java.util.ArrayList;
import java.util.List;
class Mobile{
	private long mobileno;
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "Mobile [mobileno=" + mobileno + "]";
	}
}
class Employee{
	 private String name;
	 List<Mobile> mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Mobile> getMobile() {
		return mobile;
	}
	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", mobile=" + mobile + "]";
	}  }
public class AssociationEx {

	public static void main(String[] args) {
		 Employee emp=new Employee();
		 emp.setName("");
		  Mobile no=new Mobile();
		  no.setMobileno(8273827);
		  Mobile no1=new Mobile();
		  no1.setMobileno(82738276);
		   
		   List<Mobile>numlist=new ArrayList<Mobile>();
		   numlist.add(no);
		   numlist.add(no1);
		    emp.setMobile(numlist);  
		   System.out.println(  emp.getName()+""+ emp.getMobile());
		    
	}

}