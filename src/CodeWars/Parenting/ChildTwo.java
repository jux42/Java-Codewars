package CodeWars.Parenting;

import java.util.Random;

public class ChildTwo extends Parent {

    private final String type;
    private Character randomChar;


    public ChildTwo() {
        super();
        this.randomChar = 'a';
        this.type = "child two";
    }

    public String toString() {
        return super.name + " --- " + this.type + " --- " + "with " + this.randomChar;
    }

    public String getType() {
            return type;
        }

        public Character getRandomChar() {
            return randomChar;
        }

        public void setRandomChar(Character randomChar) {
            this.randomChar = randomChar;
        }
}
