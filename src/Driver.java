
import org.joda.time.DateTime;

import main.java.Course;
import main.java.Module;
import main.java.Student;

public class Driver {

	public static void main(String[] args) {
		
		// create students
		Student john = new  Student("John", "22", "020298", "17358875");
		Student mary = new Student("Mary", "22", "060698", "17373344");
		Student patrick = new Student("Patrick", "25", "160795", "14457685");
		
		// add students to modules
		Student[] softEngStudents = {john, mary};
		Student[] dspStudents = {mary, patrick};

		// create modules
		Module softEng = new Module("Software Engineering", "CT417", softEngStudents);
		Module dsp = new Module("Digital Signal Processing", "EE445", dspStudents);

		// add modules to course
		Module[] eceModules = {softEng, dsp};
		
		// create course start and end dates with jodatime
		DateTime startDate = new DateTime(2020, 9, 28, 0, 0);
		DateTime endDate = new DateTime(2021, 6, 2, 0, 0);
		
		// create course
		Course ece = new Course("ECE", startDate, endDate, eceModules);
		
		// print out course info
		System.out.println(ece);
	}

}
