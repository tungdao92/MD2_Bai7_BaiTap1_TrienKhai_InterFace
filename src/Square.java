public class Square extends Rectangle implements IResizeable {
    private double side = 1.0;
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }


    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return getWith();
    }

    public void setSide(double side) {
        setWith(side);
        setLength(side);

    }
    @Override
    public void resize(double percent){
        this.side = this.side*(percent/100);
    }

    @Override
    public String toString() {
        return " A Square side: " + side ;
    }
}
