class Student extends Person {
    private String major;

    // Constructor
    public Student(String name, int yearOfBirth, String major) {
        super(name, yearOfBirth);
        this.major = major;
    }

    // Getter and Setter
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // toString method
    public String toString() {
        return super.toString() + ", Major: " + major;
    }
}
