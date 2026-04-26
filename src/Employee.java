public class Employee {

    private String name;
    private int skill;
    private double salary;

    public Employee(String name, int skill, double salary) {
        setName(name);
        setSkill(skill);
        setSalary(salary);
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name;
    }

    public void setSkill(int skill) {
        if (skill <= 0) {
            throw new IllegalArgumentException("Skill must be positive");
        }
        this.skill = skill;
    }

    // Exercise 1
    public void setSalary(double salary) {
        if (salary < 3000) {
            throw new IllegalArgumentException("Salary cannot be below 3000");
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSkill() {
        return skill;
    }

    public double getSalary() {
        return salary;
    }
}