package lesson8;

public class Wall implements Let{
    private int wallHeigth;

    public Wall(int wallHeigth) {
        this.wallHeigth = wallHeigth;
    }

    public int getWallHeigth() {
        return wallHeigth;
    }

    @Override
    public boolean overcome(Moving moving) {
        if (moving.jump(this.wallHeigth)) {
            System.out.println(moving.getName() + " " + "jumping distance" + " " + wallHeigth);
            return true;
        } else
            System.out.println(moving.getName() + " " + "DNF jump" + " " + wallHeigth);
        return false;
    }
}
