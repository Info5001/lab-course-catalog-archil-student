import model.CourseCatalog;
import model.Program;
import model.Course;

public class CourseCatalogMain {
  public static void main(String[] args) throws Exception {

    Program msisBridge = new Program("Masters of Information Systems", "Prof. Bugrara");

    CourseCatalog msisBridgeCatalog = msisBridge.getCourseCatalog();

    Course info5001 = msisBridgeCatalog.createNewCourse("Info5001", "Applications Modeling & Design", "We learn Java basics and modeling here", true, 4);
    Course info5002 = msisBridgeCatalog.createNewCourse("Info5002", "Introduction to Python", "Learn basics of Python", true, 4);

    Course info6150 = msisBridgeCatalog.createNewCourse("Info6150", "Web Design and Engineering", "Introduction to Frontend", false, 4);
    Course info6250 = msisBridgeCatalog.createNewCourse("Info6250", "Enterprise Web", "How to build web backend", false, 4);

    msisBridgeCatalog.deleteCourse("Info6150");

    msisBridge.printProgramDetails();


  }
}
