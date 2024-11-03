package model;

public class Program {
    String name;
    String nameOfHead;
    CourseCatalog programCourseCatalog;

    public Program(String name, String head) {
        this.name = name;
        this.nameOfHead = head;
        this.programCourseCatalog = new CourseCatalog(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameOfHead() {
        return nameOfHead;
    }

    public void setNameOfHead(String nameOfHead) {
        this.nameOfHead = nameOfHead;
    }

    public CourseCatalog getCourseCatalog() {
        return programCourseCatalog;
    }

    public void setCourseCatalog(CourseCatalog programCourseCatalog) {
        this.programCourseCatalog = programCourseCatalog;
    }

    public void printProgramDetails(){
        System.out.println("");
        System.out.println("Program: " + name);
        System.out.println("Managed by: " + nameOfHead);
        System.out.println("-------------------------------------------------");
        System.out.println("Required courses: ");
        for (Course reqCourse: programCourseCatalog.getRequiredCourses()) {
            reqCourse.printCourseInfo();
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Elective courses: ");
        for (Course electiveCourse: programCourseCatalog.getElectiveCourses()) {
            electiveCourse.printCourseInfo();
        }




    }


}
