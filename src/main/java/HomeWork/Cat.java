package HomeWork;

public class Cat implements Activities {
    private String name;
    private int maxJump;
    private int maxRun;

    public Cat(String name, int maxJump, int maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }



    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean run(int distance) {
        return maxRun >= distance;
    }

    @Override
    public boolean jump(int height) {
        return maxJump >= height;
    }
}

