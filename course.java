public class Course {
    private int id;
    private String name;
    private String instructor;
    private double fee;

   
    public Course() {
    }

    
    public Course(int id, String name, String instructor, double fee) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.fee = fee;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

   
    public void display() {
        System.out.println("Course ID: " + id);
        System.out.println("Course Name: " + name);
        System.out.println("Instructor: " + instructor);
        System.out.println("Fee: " + fee);
    }
}
