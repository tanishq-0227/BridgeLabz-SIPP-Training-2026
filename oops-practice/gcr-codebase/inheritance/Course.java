public class Course {
    private String courseName;
    private int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }
}
