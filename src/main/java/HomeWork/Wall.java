package HomeWork;

public class Wall implements Obstacles{
    private int height;

    public Wall (int distance) {this.height = distance;}

    public boolean obstacle(Activities activities) {
        if (activities.jump(this.height)){
            System.out.printf("%s was able to jump over a wall of %d meters.\n", activities.getName(), height);
            return true;}
        System.out.printf("%s wasn't able to jump over a wall of %d meters.\n", activities.getName(), height);
        return false;
    }

}
