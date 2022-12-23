package multiplyTable;

public class Task {
    private int first;
    private int second;

    public Task(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return first + " * " + second;
    }
}
