public class Matter {
    private Teacher  teacher = new Teacher();
    private String topic;
    private String url;
    private String[] exercises;
    private String[] classes;

    Teacher getTeacher() {
        return this.teacher;
    }

    private void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    String getTopic() {
        return this.topic;
    }

    private void setTopic(String topic) {
        this.topic = topic;
    }

    String getUrl() {
        return this.url;
    }

    private void setUrl(String url) {
        this.url = url;
    }

    String[] getExercises() {
        return this.exercises;
    }

    String[] getClasses() {
        return this.classes;
    }
}
