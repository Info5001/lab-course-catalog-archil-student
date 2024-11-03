package model;

import java.util.ArrayList;

public class CourseCatalog {
  private Program program;
  private ArrayList<Course> courseList;

  public CourseCatalog(Program p) {
    this.program = p;
    courseList = new ArrayList<Course>();
  }

  public Course createNewCourse(String id, String name, String description, boolean isRequired,
      int creditHours) {
    Course newCourse = new Course(id, name, description, this.program, isRequired, creditHours);
    courseList.add(newCourse);
    return newCourse;
  }

  public Course findCourseById(String id){
    for (Course eachCourse : courseList){
      if(eachCourse.getId().equals(id)){
        // this will return the value and stop
        return eachCourse;
      }
    }

    return null;
  }

  public ArrayList<Course> getRequiredCourses(){
    ArrayList<Course> result = new ArrayList<Course>();

    for (Course maybeRequired : courseList){
      if(maybeRequired.isRequired() == true){
        result.add(maybeRequired);
      }
    }

    return result;
  }

  public ArrayList<Course> getElectiveCourses(){
    ArrayList<Course> result = new ArrayList<Course>();

    for (Course maybeElective : courseList){
      if(!maybeElective.isRequired()){ // not (!) required
        result.add(maybeElective);
      }
    }

    return result;
  }

  public boolean deleteCourse(Course courseToDelete){
    return courseList.remove(courseToDelete);
  }

  public boolean deleteCourse(String courseId){
    Course courseToDelete = findCourseById(courseId);
    if (courseToDelete == null) return false;
    return deleteCourse(courseToDelete);
  }


  public Program getProgram() {
    return program;
  }

  public void setProgram(Program program) {
    this.program = program;
  }


  public void printCourseCatalog() {
    System.out.println("Course Catalog for ");
    System.out.println("-----------------");

    for (Course everyCourse : courseList) {
      everyCourse.printCourseInfo();
      System.out.println("-----------------");
    }
  }

}
