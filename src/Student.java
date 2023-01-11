public class Student extends User {
    private String registration;
    private String[] completedCourses;
    private String[] ongoingCourses;

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String[] getCompletedCourses() {
        return completedCourses;
    }

    public String[] getOngoingCourses() {
        return ongoingCourses;
    }
}
