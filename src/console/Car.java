package console;

public class Car
{
    // attributes
    // accessibility modifiers return_type  name = default
    // primitive data values have built in defaults;
    // like zero, false or "null" for strings
    public String color = "red";
    protected int doors;
    private final byte WHEELS = 4;
    // enums in 2 parts, declaration & instance variable
    public enum EngineTypes {V4, V6, V8};
    private EngineTypes engine;
    public enum Gears {R, D, N, P};
    private Gears gear = Gears.P;
    private boolean started;
    public int oilLevel = 0;
    final int MINIMUM_OIL_LEVEL = 200;
    float thing0 =123.45f;
    double thing1 = 123d;
    long thing2 = 1234L;
    String thing3 = "string";
    char thing4 = 'c';
    int thing5 = 0;

    /*FORMAT STRINGS
    d = digit
    f = float
    s = string
    \n \t, new line, tab
    \r returns to front of same line
     */


    /*THROWING EXCEPTIONS
    throw new IllegalArgumentException {String.format("%.0f  is not value", speedToAdd)}
     */


    /* ACCESS MODIFIERS
        class:
            public - world
            default = package
        attributes, methods, constructors: (2 more modifiers)
            private - class only
            protected - subclass & package
      NON ACCESS -
            final - constant or sterile (for class), not inheritable
            static - belong to the class, don't need an object
            abstract class - empty methods(), body from subclass
       LITERAL = value after an equal sign "string",  'char'
     */

    // METHODS:   ALT + INSERT
    // camelCase() for methods

    // getters and setters for private values

    public EngineTypes getEngine() {
        return engine;
    }
    // SIGNATURE = unique combination of
    // name, parameter amount, parameter datatype
    // both of these are unique signatures
    // java doesn't care about name of variable
    public void setEngine(EngineTypes engine) {
        this.engine = engine;
    }
    public void setEngine(String engine) {
        //this.engine = engine;
    }
    // CUSTOM METHODS
    public boolean isOn(){return started;}
    public boolean needsOil(){ return MINIMUM_OIL_LEVEL > oilLevel;}
    public boolean needsGas(){return false;}
    public Gears gearIn() { return gear;}

    // overriding equals operation - automatic
    /*@Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
     */

    @Override
    public String toString()
    {
        return "Car{" +
                "color='" + color + '\'' +
                ", doors=" + doors +
                ", WHEELS=" + WHEELS +
                ", engine=" + engine +
                ", gear=" + gear +
                ", oilLevel=" + oilLevel +
                '}';
    }
        // manual
        @Override
        public boolean equals(Object ob)
        {
            try
            {
                Car compare = (Car)ob;
                return compare.toString().equals( this.toString() );
            }
            catch (Exception e)
            {
                return false;
            }
        }
    }

