class Person {
    private String name;
    private int yearOfBirth;

    // Constructor
    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    // toString method
    public String toString() {
        return "Name: " + name + ", Year of Birth: " + yearOfBirth;
    }
}
