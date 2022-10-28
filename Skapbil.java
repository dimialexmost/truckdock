public class Skapbil extends Lastbilar {
    public Skapbil(double vikten) {

        this.vikten = vikten;
        this.type = 1;
    }

    @Override
    public String toString() {
        return "Skåpbil, vikt = " + vikten;
    }
}
