package lab1;

/**
 * @author Derrick Park
 */
public class Model {
    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    public Model() {
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     * @param canTravel
     * @param smokes
     */
    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeight(height);
        this.setWeight(weight);
        this.canTravel = canTravel;
        this.smokes = smokes;
    }

    /**
     *
     * @param firstName
     * @param lastName
     * @param height
     * @param weight
     */
    public Model(String firstName, String lastName, int height, double weight) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeight(height);
        this.setWeight(weight);
        this.canTravel = true;
        this.smokes    = false;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        if (firstName.length() < 3 || firstName.length() > 20) {
            System.err.println("you must 3 to 20 character.");
            return;
        }
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        if (lastName.length() < 3 || lastName.length() > 20) {
            System.err.println("you must 3 to 20 character.");
            return;
        }
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public int getHeight() {
        return this.height;
    }

    /**
     *
     * @param inches
     */
    public void setHeight(int inches) {
        if (inches < 24 || inches > 84) {
            System.err.println("you must 24 to 84 height.");
            return;
        }
        this.height = inches;
    }

    /**
     *
     * @param feet
     * @param inches
     */
    public void setHeight(int feet, int inches) {
        this.height = feet * INCHES_PER_FOOT + inches;
    }

    /**
     *
     * @return
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Set the weight in pounds
     * @param pounds pounds (lb)
     */
    public void setWeight(double pounds) {
        if (pounds < 80 || pounds > 280) {
            System.err.println("you must 80 to 280 pounds.");
            return;
        }
        this.weight = pounds;
    }

    /**
     *
     * @param kilograms
     */
    public void setWeight(long kilograms) {
        this.weight = kilograms * POUNDS_PER_KG;
    }

    /**
     *
     * @return
     */
    public boolean canTravel() {
        return this.canTravel;
    }

    /**
     *
     * @param canTravel
     */
    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     *
     * @return
     */
    public boolean isSmokes() {
        return this.smokes;
    }

    /**
     *
     * @param smokes
     */
    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    /**
     * Returns the height in feet and inches
     * @return the height in feet and inches
     */
    public String getHeightInFeetAndInches() {
        int feet = this.height / INCHES_PER_FOOT;
        int inch = this. height % INCHES_PER_FOOT;
        StringBuilder word = new StringBuilder();
        word.append(feet);
        word.append(" feet ");
        if (inch != 0) word.append(inch);
        if (inch == 1) word.append(" inch");
        if (inch > 1) word.append(" inches");
        return new String(word);
    }

    /**
     * Prints detail information about this Model
     */
    public void printDetails() {
        String name = this.getFirstName() + " " + this.getLastName();
        String format = """
                Name: %s
                Height: %d inches
                Weight: %d pounds""";
        StringBuilder result = new StringBuilder(format);
        if (canTravel) {
            result.append("\nDoes travel");
        } else {
            result.append("\nDoes not travel");
        }

        if (isSmokes()) {
            result.append("\nDoes smoke");
        } else {
            result.append("\nDoes not smoke");
        }

        System.out.printf((new String(result)) + "%n",
                name,
                this.getHeight(),
                (int)this.getWeight()
        );
    }

    /**
     *
     * @return
     */
    public long getWeightKg() {
        return Math.round(this.getWeight() * 0.45);
    }

    /**
     * Calculates a model's per-hour pay rate and returns the amount.
     * @return
     */
    public int calculatePayDollarsPerHour() {
        int sarary = BASE_RATE_DOLLARS_PER_HOUR;
        if(this.getHeight() >= TALL_INCHES && this.getWeight() <= THIN_POUNDS) sarary += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        if (isSmokes()) sarary -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        if (this.getHeight() >= TALL_INCHES) sarary += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        return sarary;
    }

    /**
     * Displays all the model's informatio
     */
    public void displayModelDetails() {
        String name = this.getFirstName() + " " + this.getLastName();
        String format = """
                Name: %s
                Height: %s
                Weight: %d pounds
                Travels:\s""";
        StringBuilder result = new StringBuilder(format);
        if (this.canTravel) {
            result.append("yep");
        } else {
            result.append("nope");
        }

        result.append("\nSmokes: ");

        if (isSmokes()) {
            result.append("yep");
        } else {
            result.append("nope");
        }

        result.append("\nHourly rate: $%d");

        System.out.printf((new String(result)) + "%n",
                name,
                this.getHeightInFeetAndInches(),
                (int)this.getWeight(),
                this.calculatePayDollarsPerHour()
        );
    }
}
