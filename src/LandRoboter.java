public class LandRoboter extends ForschungsRoboter {

    String fahrwerk;

    public LandRoboter(){
        fahrwerk = "allrad";
    }

    public LandRoboter(String f){
        this.fahrwerk = f;
    }

    @Override
    public String toString() {
        return super.toString()+  "\nLandRoboter{" +
                "\nfahrwerk='" + fahrwerk + '\'' +
                '}';
    }
}
