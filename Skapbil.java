public class Skapbil extends Lastbilar {
    public Skapbil(double weight) {
        super(1);
            this.weight = weight;
        }

        @Override
        public double getWeight() {
            return this.weight;
        }

        @Override
        public int getType() {
            return type;
        }

        @Override
        public String toString() {
            return "Skåpbil, vikt = " + weight;
        }
    }