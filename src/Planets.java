public enum Planets {
    MERCURY(1, 0, 40,  null, null),
    VENUS(2, 100, 50, null, MERCURY),
    EARTH(3, 200, 60, null, VENUS),
    MARS(4, 300, 45,  null, EARTH),
    JUPITER(5, 400, 59,  null, MARS),
    SATURN(6, 500, 56,  null, JUPITER),
    URANUS(7, 600, 87,  null, SATURN),
    NEPTUNE(8, 700, 34,  null, URANUS);

    private int order;
    private int disFromPreviousPlanet;
    private int radius;
    private  int disFromSunn = 150;
    private Planets next;
    private Planets previous;

    Planets(int order, int disFromPreviousPlanet, int radius, Planets next, Planets previous) {
        this.order = order;
        this.disFromPreviousPlanet = disFromPreviousPlanet;
        this.radius = radius;
        this.disFromSunn = previous != null ? disFromPreviousPlanet + previous.disFromSunn : disFromSunn;
        this.next = next;
        this.previous = previous;

    }
    public void init() {
        MERCURY.next = VENUS;
        VENUS.next = EARTH;
        EARTH.next = MARS;
        MARS.next = JUPITER;
        JUPITER.next = SATURN;
        SATURN.next = URANUS;
        URANUS.next = NEPTUNE;
    }

    public int getOrder() {
        return order;
    }

    public int getDisFromPreviousPlanet() {
        return disFromPreviousPlanet;
    }

    public int getRadius() {
        return radius;
    }

    public Planets getNext() {
        return next;
    }

    public Planets getPrevious() {
        return previous;
    }

    public int getDisFromSun() {
        return disFromSunn;
    }
}
