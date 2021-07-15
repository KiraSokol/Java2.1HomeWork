package HomeWork;

public class HomeWork {

    public static void main(String[] args) {

        Activities[] activities = {
                new Cat("Markiz ", 9, 500),
                new Cat("Desad ", 4, 200),
                new Robot("Azimov ", 6, 300),
                new Robot("Isaac ", 9, 250),
                new Human("William ", 5, 500),
                new Human("Golding ", 6, 200),
        };

        Obstacles [] obstacles = {
                new Treadmill(250),
                new Wall(4),
                new Treadmill(450),
                new Wall(8),
        };


        System.out.println("New competition!\n");

        for (Activities a : activities) {
            for (Obstacles q : obstacles) {
                if (!q.obstacle(a)) break;
            }
        }
    }
}
