package CodeWars.Parenting;


public class ChildOne extends Parent {

    private final String type;
    private double randomId;

    public ChildOne(){
        super();
        this.randomId = Math.random();
        this.type = "child one";
    }

    public String toString(){
        return super.name + " --- " + this.type + " --- " + "with " + this.randomId;
    }
    public String getType() {
            return type;
        }

        public double getRandomId() {
            return randomId;
        }

        public void setRandomId(double randomId) {
            this.randomId = randomId;
        }

}
