import com.sun.jdi.Value;

public enum SolarSystem {
    MERCURY(1, 0,111.2,null, "VENUS"),
    VENUS(2, 11111, 222.2, MERCURY, "EARTH"),
    EARTH(3, 22222, 3333, VENUS, "MARS"),
    MARS(4, 33333, 4444, EARTH, "JUPITER"),
    JUPITER(5, 44444, 555.5, MARS, "SATURN"),
    SATURN(6, 55555, 777.7, JUPITER, "URANUS"),
    URANUS(7, 77777, 888.8, SATURN, "NEPTUNE"),
    NEPTUNE(8, 88888, 999.9, URANUS, null);

    private final int positionFromSun;
    private final long distanceFromPreviousPlanet;
    private final double distanceFromSun;
    private final double radius;
    private final SolarSystem previousPlanet;
    private final String nextPlanet;

    SolarSystem(int positionFromSun, long distanceFromPreviousPlanet, double radius, SolarSystem previousPlanet, String nextPlanet) {
        this.positionFromSun = positionFromSun;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.distanceFromSun = previousPlanet != null ? distanceFromPreviousPlanet + previousPlanet.getDistanceFromSun() : distanceFromPreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.nextPlanet = nextPlanet;

        System.out.println("Position from Sum: " + positionFromSun + ", Distance From Previous Planet: " + distanceFromPreviousPlanet + ", Distance From Sun: " + distanceFromSun + ", Radius: " + radius + ", Previous Planet: " + previousPlanet + ", Next Planet: " + nextPlanet);
    }


    public int getPositionFromSun() {
        return positionFromSun;
    }

    public long getDistanceFromPreviousPlanet() {
        return distanceFromPreviousPlanet;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getRadius() {
        return radius;
    }

    public SolarSystem getPreviousPlanet() {
        return previousPlanet;
    }

    public String getNextPlanet() {
        return nextPlanet;
    }
}
