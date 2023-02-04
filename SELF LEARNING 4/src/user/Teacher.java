package user;

import major.Major;

public class Teacher extends User{
    private static int id = 0;
    private int teacherID = setID();
    private Major major;

    public Teacher(String username, String password, String name, Major major) {
        super(username, password, name);
        this.major = major;
    }

    public static int setID() {
        return id++;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

}
