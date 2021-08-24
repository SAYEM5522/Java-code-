
class StudenInfo {
  private String name;
  private int id;
  private double marks;
  private int section;
  private int courseCode;
  private String courseFaculty;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getMarks() {
    return marks;
  }

  public void setMarks(double marks) {
    this.marks = marks;
  }

  public int getSection() {
    return section;
  }

  public void setSection(int section) {
    this.section = section;
  }

  public int getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(int courseCode) {
    this.courseCode = courseCode;
  }

  public String getCourseFaculty() {
    return courseFaculty;
  }

  public void setCourseFaculty(String courseFaculty) {
    this.courseFaculty = courseFaculty;
  }

  public StudenInfo(String name, int id, double marks, int section, int courseCode, String courseFaculty) {
    this.name = name;
    this.id = id;
    this.marks = marks;
    this.section = section;
    this.courseCode = courseCode;
    this.courseFaculty = courseFaculty;
  }

}

class CSE_Students extends StudenInfo {
  private String SubjectName;

  public String getSubjectName() {
    return SubjectName;
  }

  public CSE_Students(String name, int id, double marks, int section, int courseCode, String courseFaculty,
      String subjectName) {
    super(name, id, marks, section, courseCode, courseFaculty);
    SubjectName = subjectName;
  }

  public void setSubjectName(String subjectName) {
    SubjectName = subjectName;
  }

  @Override
  public String toString() {
    return "CSE_Students [Name= " + super.getName() + " id= " + super.getId() + " Marks= " + super.getMarks()
        + " Section = " + super.getSection() + " CourseCode= " + super.getCourseCode() + " Coursefaculty= "
        + super.getCourseFaculty() + "]";
  }

}

class EEE_Students extends StudenInfo {
  private String SubjectName;

  public EEE_Students(String name, int id, double marks, int section, int courseCode, String courseFaculty,
      String subjectName) {
    super(name, id, marks, section, courseCode, courseFaculty);
    SubjectName = subjectName;
  }

  public String getSubjectName() {
    return SubjectName;
  }

  public void setSubjectName(String subjectName) {
    SubjectName = subjectName;
  }

  @Override
  public String toString() {
    return "EEE_Sudents [Name= " + super.getName() + " id= " + super.getId() + " Marks= " + super.getMarks()
        + " Section = " + super.getSection() + " CourseCode= " + super.getCourseCode() + " Coursefaculty= "
        + super.getCourseFaculty() + "]";
  }

}

public class MainII {
  public int n = 0;
  StudenInfo[] exam = new StudenInfo[10];

  public StudenInfo[] getExam() {
    return exam;
  }

  public double averageMid(double arr[]) {
    double avgM = 0;
    double sum = 0;
    for (int i = 0; i < 5; i++) {
      sum = sum + arr[i];
    }
    avgM = sum / 5;

    return avgM;
  }

  public void setExam(StudenInfo[] exam) {
    this.exam = exam;
  }

  public void AddExam(StudenInfo s) {
    exam[n++] = s;
  }

  public static void main(String[] args) {


    CSE_Students cse_mid = new CSE_Students("a", 2, 100, 10, 215, "AAA", "CSE215");
    CSE_Students cse_quiz1 = new CSE_Students("a", 2, 30, 10, 215, "AAA", "CSE215");
    CSE_Students cse_quiz2 = new CSE_Students("a", 2, 50, 10, 215, "AAA", "CSE215");
    CSE_Students cse_quiz3 = new CSE_Students("a", 2, 80, 10, 215, "AAA", "CSE215");
    CSE_Students cse_Final = new CSE_Students("a", 2, 90, 10, 215, "AAA", "CSE215");
    // EEE_Students eee_mid = new EEE_Students("b", 2, 40, 10, 215, "AAB",
    // "EEE141");
    // EEE_Students eee_quiz1 = new EEE_Students("b", 2, 50, 10, 215, "AAB",
    // "EEE141");
    // EEE_Students eee_quiz2 = new EEE_Students("b", 2, 60, 10, 215, "AAB",
    // "EEE141");
    // EEE_Students eee_quiz3 = new EEE_Students("b", 2, 30, 10, 215, "AAB",
    // "EEE141");
    // EEE_Students eee_Final = new EEE_Students("b", 2, 100, 10, 215, "AAB",
    
    // "EEE141");
    MainII m = new MainII();
    m.AddExam(cse_mid);
    m.AddExam(cse_quiz1);
    m.AddExam(cse_quiz2);
    m.AddExam(cse_quiz3);
    m.AddExam(cse_Final);
    // m.AddExam(eee_mid);
    // m.AddExam(eee_quiz1);
    // m.AddExam(eee_quiz2);
    // m.AddExam(eee_quiz3);
    // m.AddExam(eee_Final);
    double[] arr = new double[5];
    for (int i = 0; i < 5; i++) {
      System.out.println(m.exam[i].toString());

      arr[i] = m.exam[i].getMarks();
    }
    System.out.println(m.averageMid(arr));

  }
}
