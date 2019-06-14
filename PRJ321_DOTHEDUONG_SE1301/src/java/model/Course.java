package model;

public class Course {

    private String courseID, courseName, lecture;
    private int room;

    public Course() {
    }

    public Course(String courseID, String courseName, String lecture, int room) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.lecture = lecture;
        this.room = room;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    
}
