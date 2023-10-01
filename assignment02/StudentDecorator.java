package assignment02;

import java.util.List;

public abstract class StudentDecorator extends AbstractStudent {
	protected AbstractStudent delegate;
	public StudentDecorator(AbstractStudent s) {
		super(s.getInnerSelf());
		delegate = s;
	}
	public Person getInnerSelf() {
		return delegate.getInnerSelf();
	}
	
	// ALL OTHER METHODS INHERITED FROM AbstractStudent SHOULD
	// ALSO PASS THE CALL TO THE delegate AS IS DONE IN THE getters
	// and setters LIST HERE ALREADY
	// FOR EXAMPLE
	public String getCourses() {
		return delegate.getCourses();
	}

	public List<String> getCourseList() {
		return delegate.getCourseList();
	}
	public UndergraduateDecorator.Level getLevel() {
		return delegate.getLevel();
	}

	public String getCountyOfResidence() {
		return delegate.getCountyOfResidence();
	}

	public GraduateDecorator.Program getProgram() {
		return delegate.getProgram();
	}

	public String getVisa() {
		return delegate.getVisa();
	}
	
	public String getMajor() {
		return delegate.getMajor();
	}
	public String getUniversity() {
		return delegate.getUniversity();
	}
	public int hashCode() {
		return delegate.hashCode();
	}
	public void setMajor(String major) {
		delegate.setMajor(major);
	}
	public void setUniversity(String university) {
		delegate.setUniversity(university);
	}

	public void setGrade(String courseRubricIn, String courseNumberIn, String sectionIn, String gradeIn) {
		delegate.setGrade(courseRubricIn, courseNumberIn, sectionIn, gradeIn);
	}

	public void setCountyOfResidence(String countyOfResidence) {
		delegate.setCountyOfResidence(countyOfResidence);
	}

	public void setProgram(GraduateDecorator.Program program) {
		delegate.setProgram(program);
	}

	public void setVisa(String visa) {
		delegate.setVisa(visa);
	}

	public void setLevel(UndergraduateDecorator.Level level) {
		delegate.setLevel(level);
	}
}
