class Student_course_information {
    String course;
    int sem;
    float marks;

    Student_course_information(String course, int sem, float marks) {
        this.course = course;
        this.sem = sem;
        this.marks = marks;
    }

    void displayinfo() {
        System.out.println("Course name: " + course + ", Sem: " + sem + ", Marks: " + marks);
    }
}

public class Program2 {
    public static void main(String[] args) {
        Student_course_information s1 = new Student_course_information("JAVA", 4, 30);
        Student_course_information s2 = new Student_course_information("DEVOPS", 4, 30);
        Student_course_information s3 = new Student_course_information("BIG DATA", 4, 30);

        s1.displayinfo();
        s2.displayinfo();
        s3.displayinfo();
    }
}
