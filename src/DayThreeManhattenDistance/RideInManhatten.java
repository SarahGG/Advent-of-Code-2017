package DayThreeManhattenDistance;

/**
 * Class description
 *
 * @author Sarah Guarino
 * @version 1.0
 */
public class RideInManhatten {
    private Integer xDifference;
    private Integer yDifference;
    private Integer manhattenDistance;

    public RideInManhatten(Integer goldenNumber) {
        this.xDifference = 0;
        this.yDifference = 0;
        Integer upperRoot = initUpperRoot(goldenNumber);
        Integer lowerRoot = upperRoot - 1;
        Integer lowerPrime = lowerRoot * lowerRoot;
        Integer primeHalfStep = goldenNumber - lowerPrime;
        this.manhattenDistance = initManhattenDistance(primeHalfStep, upperRoot);
    }

    private Integer initUpperRoot(Integer goldenNumber) {
        Integer upperRoot = 0;

        while((upperRoot * upperRoot) < goldenNumber) {
            upperRoot++;
        }

        return upperRoot;
    }

    private Integer initManhattenDistance(Integer primeHalfStep, Integer upperRoot) {
        if(primeHalfStep.equals(upperRoot)) {
            this.xDifference = Math.abs(upperRoot / 2);
            this.yDifference = Math.abs(upperRoot / 2);
        } else if(primeHalfStep < upperRoot) {
            this.xDifference = Math.abs(upperRoot / 2);
            this.yDifference = Math.abs(primeHalfStep - (upperRoot / 2 + 1));
        } else if (primeHalfStep > upperRoot) {
            this.yDifference = Math.abs(upperRoot / 2);
            this.xDifference = Math.abs(primeHalfStep - upperRoot - (upperRoot / 2));
        }

        return this.xDifference + this.yDifference;
    }

    public Integer getManhattenDistance() {
        return this.manhattenDistance;
    }
}
