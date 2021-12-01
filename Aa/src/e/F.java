package e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class F {

	public static void main(String[] args) {
	
List l=new ArrayList();
Emp e=new Emp(44,"third");
Emp e1=new Emp(55,"four");
l.add(new Emp(11,"first"));
l.add(new Emp(22,"second"));

Emp e2=new Emp(44,"third");
Emp e3=new Emp(55,"four");
l.add(e);
l.add(e1);
l.add(e2);
l.add(e3);
System.out.println(l);
Collections.sort(l);
System.out.println(l);
Comparator c= new Comparator<Emp>() {

	@Override
	public int compare(Emp e1, Emp e2) {
		return e.empId-e2.empId;
	}
};
Comparator d= new Comparator<Emp>() {

	@Override
	public int compare(Emp e1, Emp e2) {
		return e1.empName.compareTo(e2.empName);
	}
};


Collections.sort(l,c);
System.out.println(l);
Collections.sort(l,d);
System.out.println(l);
	}

}
