import java.util.ArrayList;

public class ClassSection {

    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students;

    public ClassSection(String sb, int cap, int yr)
    {
        subject = sb;
        capacity = cap;
        yearLevel = yr;
        students = new ArrayList<>();
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public int getYearLevel()
    {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel)
    {
        this.yearLevel = yearLevel;
    }

    public ArrayList<Student> getStudents()
    {
        return students;
    }

    public void addStudent(Student stu)
    {
        if(stu.getYearLevel() == yearLevel && !isStudentEnrolled(stu))
            students.add(stu);
    }

    public void removeStudent(Student stu)
    {
        for(int i = 0; i < students.size(); i++)
        {
            if(students.get(i).equals(stu))
                students.remove(i);
        }
    }

    public boolean isStudentEnrolled(Student stu)
    {
        boolean contains = false;
        for(int i = 0; i < students.size(); i++)
        {
            if(students.get(i).equals(stu)) {
                contains = true;
            }
        }
        return contains;
    }

    public String toString()
    {
        return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", students=" + students.toString() + "}";
    }
}
