package assignment02;

import java.util.ArrayList;
import java.util.List;

import assignment02.GraduateDecorator.Program;

abstract public class AbstractStudent {
	private String major;
	private Person innerSelf;
	public AbstractStudent (Person p) {
		innerSelf = p;
	}
	public Person getInnerSelf() {
		return innerSelf;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	// List all the methods here that appear in all the given decorators, so that
	// all  the decorators and the ConcreteStudent have the same interface.
	// FOR EXAMPLE:
	public String getCourses() {
		return "";
	}

	// getCourseList() should return new ArrayList<>()
	public List<String> getCourseList() {
		
		return new ArrayList<String>(); // remove this line, it is only here to make the code compile
	}
	
	
	// The other getter methods copied from the other decorators 
	// should print "Method not implemented"
	// and return "" or NONE, FOR EXAMPLE
	public UndergraduateDecorator.Level getLevel() {
		System.out.println("Method not implemented");
		return UndergraduateDecorator.Level.NONE;
	}

	public String getCountyOfResidence() {
		System.out.println("Method not implemented");
		return "";
	}

	public GraduateDecorator.Program getProgram() {
		System.out.println("Method not implemented");
		return GraduateDecorator.Program.NONE;
	}

	public String getVisa() {
		System.out.println("Method not implemented");
		return "";
	}
	
	// the setter methods copied from the other decorators 
	// should print "Method not implemented".
	// There is no return since the setters are void
	public void setGrade(String courseRubricIn, String courseNumberIn, String sectionIn, String gradeIn) {
		System.out.println("Method not implemented");
	}

	public void setCountyOfResidence(String countyOfResidence) {
		System.out.println("Method not implemented");
	}

	public void setProgram(GraduateDecorator.Program program) {
		System.out.println("Method not implemented");
	}

	public void setVisa(String visa) {
		System.out.println("Method not implemented");
	}

	public void setLevel(UndergraduateDecorator.Level level) {
		System.out.println("Method not implemented");
	}

	// methods implemented in ConcreteStudent:
	abstract public String getUniversity();
	abstract public void setUniversity(String university);
}
