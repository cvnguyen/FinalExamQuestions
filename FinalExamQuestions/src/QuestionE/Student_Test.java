package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Cindy", "Vy", "Nguyen", dBirthDate, "123 Street Road", "610-731-7729", "cvnguyen@udel.edu", "ELEG");
		Student stu3 = new Student("John", "Jacob", "Smith", dBirthDate, "123 Street Road", "610-731-7729", "cvnguyen@udel.edu", "ELEG");
		Student stu4 = new Student("Sarah", "Ann", "Doe", dBirthDate, "456 Road St", "484-123-4567", "sdfsdfd@mail.com", "ELEG");
		Student stu5 = new Student("Matt", "Andrew", "Smith", dBirthDate, "348 Road Rd","234-234-2342", "jkjk@mail.com",  "ELEG");
		
		
		assertTrue(5==5);
		
		HashMap hm = new HashMap();
		hm.put("Bert Randal Gibbons", stu1);
		hm.put("Cindy Vy Nguyen", stu2);
		hm.put("John Jacob Smith", stu3);
		hm.put("Sarah Ann Doe", stu4);
		hm.put("Matt Andrew Smith", stu5);
		
		
	}
	


}
