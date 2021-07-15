package HomeWork;

public class Treadmill implements Obstacles{
    private int distance;

    public Treadmill(int distance) {this.distance = distance; }


    public boolean obstacle(Activities activities) {
        if (activities.run(this.distance)){
            System.out.printf("%s ran a distance of %d meters.\n", activities.getName(), distance);
            return true;}
        System.out.printf("%s couldn't run a distance of %d meters.\n", activities.getName(), distance);
        return false;
    }
}
