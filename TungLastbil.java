public class TungLastbil extends Lastbilar {
    public TungLastbil(double vikten) {

        this.vikten = vikten;
        this.type = 3;
    }

    @Override
    public String toString() {
        return "Tung lastbil, vikt = " + vikten;
    }
}
