package model;

import model.Program;

public class Course {
  private String id;
  private String name;
  private String description;
  private Program program;
  private boolean isRequired; // if not its elective
  private int creditHours;
  private String prereq;

  public Course(String id, String name, String description, Program program, boolean isRequired,
      int creditHours) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.program = program;
    this.isRequired = isRequired;
    this.creditHours = creditHours;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Program getProgram() {
    return program;
  }

  public void setProgram(Program program) {
    this.program = program;
  }

  public boolean isRequired() {
    return isRequired;
  }

  public void setRequired(boolean isRequired) {
    this.isRequired = isRequired;
  }

  public int getCreditHours() {
    return creditHours;
  }

  public void setCreditHours(int creditHours) {
    this.creditHours = creditHours;
  }

  public String getPrereq() {
    return prereq;
  }

  public void setPrereq(String prereq) {
    this.prereq = prereq;
  }

  public void printCourseInfo() {
    System.out.println(id + ". " + name + " (" + creditHours + " Hours)");
    // System.out.println(description);
  }

}
