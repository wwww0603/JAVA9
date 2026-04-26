public class Project {

    private String name;
    private int requiredWork;
    private int progress;

    public Project(String name, int requiredWork) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid project name");
        }

        if (requiredWork <= 0) {
            throw new IllegalArgumentException("Required work must be positive");
        }

        this.name = name;
        this.requiredWork = requiredWork;
        this.progress = 0;
    }

    // Exercise 2
    public void addProgress(int amount) {

        if (amount < 0) {
            throw new IllegalArgumentException("Negative progress");
        }

        if (isFinished()) {
            System.out.println("Project already finished");
            return;
        }

        progress += amount;

        if (progress > requiredWork) {
            progress = requiredWork;
        }
    }

    public boolean isFinished() {
        return progress >= requiredWork;
    }

    public int getProgress() {
        return progress;
    }
}