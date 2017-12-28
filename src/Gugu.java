public class Gugu {

    int zahl = 1;
    String name = "gugu";
    FlugRoboter flyFly = new FlugRoboter();
    TauchRoboter blubBlub = new TauchRoboter();


    public String waio() {
        return "Weil ich es so will";
    }


    public String toString() {
        return "Gugu{" +
                "zahl=" + zahl +
                ", name='" + name + '\'' + flyFly + blubBlub +
                '}';
    }
}