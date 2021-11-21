package lesson8;

public class Road implements Let {
private int roadLength;

    public Road(int roadLength) {
        this.roadLength = roadLength;
    }

    public int getRoadLength() {
        return roadLength;
    }

    @Override
    public boolean overcome(Moving moving) {
      if (moving.run(this.roadLength)) {
          System.out.println(moving.getName() + " " + "running distance" + " " + roadLength);
          return true;
      } else
          System.out.println(moving.getName() + " " + "DNF run" + " " + roadLength);
        return false;
    }
}
