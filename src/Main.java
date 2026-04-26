public class Main {

    public static void main(String[] args) {

        // Exercise 1
        Employee e = new Employee("Anna", 8, 5000);
        System.out.println("Employee Salary = " + e.getSalary());

        // Exercise 2
        Project p = new Project("Website", 100);

        p.addProgress(30);
        p.addProgress(50);
        p.addProgress(40);

        System.out.println("Project Progress = " + p.getProgress());
        System.out.println("Finished = " + p.isFinished());

        p.addProgress(10);

        // Exercise 3
        Budget b = new Budget(1000);

        b.addMoney(500);
        b.spendMoney(300);

        System.out.println("Budget Balance = " + b.getBalance());

        // Exercise 4
        Company c = new Company("TechCorp", 10, 25000);

        System.out.println("Company Name = " + c.getName());
        System.out.println("Employees    = " + c.getEmployees());
        System.out.println("Money        = " + c.getMoney());
    }
}