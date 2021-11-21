package lesson8;

public class Robot  implements Moving{
    private int maxRUN;
    private int maxJUMP;
    private String name;

    public Robot(int maxRUN, int maxJUMP, String name) {
        this.maxRUN = maxRUN;
        this.maxJUMP = maxJUMP;
        this.name = name;
    }

    public int getMaxRUN() {
        return maxRUN;
    }

    public int getMaxJUMP() {
        return maxJUMP;
    }


    @Override
    public boolean run(int length) {
        return this.maxRUN >= length;
    }

    @Override
    public boolean jump(int heigth) {
        return this.maxJUMP >= heigth;
    }
    @Override
    public String getName() {
        return this.name;
    }



}
