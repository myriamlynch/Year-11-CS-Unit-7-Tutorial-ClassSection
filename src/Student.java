public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount;

    public Student(String first, String last, int ag, int yrlevel)
    {
       // studentCount++;
        id = studentCount;
        firstName = first;
        lastName = last;
        age = ag;
        yearLevel = yrlevel;
        studentCount++;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getYearLevel()
    {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel)
    {
        this.yearLevel = yearLevel;
    }

    public int getStudentCount()
    {
        return studentCount;
    }

    public boolean equals(Student comp)
    {
        if(this.age == comp.getAge() && this.yearLevel == comp.getYearLevel() && this.lastName.equals(comp.getLastName()) && this.firstName.equals(comp.getFirstName()))
            return true;
        return false;
    }

    public String toString()
    {
        return "Student{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "', age=" + age + "}";
    }
}
