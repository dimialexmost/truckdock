public abstract class Lastbilar {
    protected double weight;
    protected int type;

    Lastbilar(int type){

        this.type = type;
    }

    public abstract double getWeight();

    public abstract int getType();
}
