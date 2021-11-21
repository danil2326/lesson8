package lesson8;

public class lesson8 {
    public static void main(String[] args) {
    Moving[] movings = {
            new Human(80,1,"Alex"),
            new Cat(100,5,"Chester"),
            new Robot(100,10,"Baks")
    };
    Let[] lets = {
            new Road(100),
            new Wall(10)
    };
        for (Moving m : movings) {
            for (Let l: lets) {
                if (!l.overcome(m)) break;

            }

        }
            }

        }







