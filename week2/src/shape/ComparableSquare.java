package shape;
import java.lang.Comparable;

public class ComparableSquare extends Square implements Comparable<ComparableSquare>{
    ComparableSquare(double size){
        super(size);
    }

    @Override
    public int compareTo(ComparableSquare squareObj) {
        if (this.getSize() > squareObj.getSize()) return 1;
        else if (this.getSize() < squareObj.getSize()) return -1;
        else return 0;
    }
}
