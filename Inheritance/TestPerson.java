package Inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
        public static void main(String[] args) throws ParseException {
        	BusinessMan b = new BusinessMan();
        	Doctor d = new Doctor();
        	Student s = new Student();
        	
        	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        	
        	System.out.println("--BusinessMan--");
        	b.setName("Amit Chandsarkar");
        	b.setAddress("Indore MP-452001");
        	b.setDob(sdf.parse("2003-9-23"));
        	b.setI(5000000);
        	
        	
        	System.out.println("Name:" + b.getName() + "\n" + "Address:" + b.getAddress() + "\n"+ "DOB :" + b.getDob() + "\n" + "Income:" + b.getI() + "\n + "Age:" + b.getAge());
}
}
