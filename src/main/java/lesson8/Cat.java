package lesson8;

public class Cat implements Moving{
    private String name;
    private int maxRUN;
    private int maxJUMP;

    public Cat(int maxRUN, int maxJUMP, String name) {
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
