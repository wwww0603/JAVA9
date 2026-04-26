public class Company {

    private String name;
    private int employees;
    private double money;

    // Exercise 4
    public Company(String name, int employees, double money) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid company name");
        }

        if (employees < 0) {
            throw new IllegalArgumentException("Employees cannot be negative");
        }

        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }

        this.name = name;
        this.employees = employees;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getEmployees() {
        return employees;
    }

    public double getMoney() {
        return money;
    }
}