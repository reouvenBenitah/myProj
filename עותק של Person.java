
public class Person {
    private String firstName, lestName;
    private int id;
    private Date dateOfBirth;

    /**
     * A constructor that initializes the class attributes
     * @param firstName The operator's first name
     * @param lestName The operator's lest name
     * @param id The operator's id
     * @param d The operator's day
     * @param m The operator's month
     * @param y The operator's year
     */
    public Person(String firstName, String lestName, int id, int d, int m, int y) {
        this.firstName = firstName;
        this.lestName = lestName;
        this.id = id;
        this.dateOfBirth = new Date(d, m, y);
    }

    /**
     * copy constructor
     * @param p Parameter as the person object obtained from who is running the method
     */
    public Person(Person p) {
        this.firstName = p.firstName;
        this.lestName = p.lestName;
        this.id = p.id;
        this.dateOfBirth = new Date(p.dateOfBirth);
    }

    /**
     *A method that checks whether human beings are alike
     * @param other Parameter as the person object obtained from who is running the method
     * @return true or false
     */
    public boolean equals(Person other) {
        return other.getFirstName().equals(this.firstName) && other.getLestName().equals(this.lestName) && other.getId() == this.id;
    }

    /**
     * Method who receives another person and checks whether they were born on the same date.
     * @param other  Parameter as the person object obtained from who is running the method
     * @return true or false
     */
    public boolean sameBirthday(Person other) {
        return other.getDateOfBirth().equals(this.dateOfBirth);
    }

    public boolean older(Person other) {
        return  other.dateOfBirth.before(this.dateOfBirth);
    }

    public String toString() {
        return "First Name: " + this.firstName + " ,Lest Name: " + this.lestName +
                " ,ID: " + this.id + " ,Date of birth: " + this.dateOfBirth;
    }

    /**
     * gets the first name
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method redefines the first name
     * @param firstName Representing the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * gets the lest name
     * @return the lest name
     */
    public String getLestName() {
        return lestName;
    }

    /**
     * Method redefines the first name
     * @param lestName Representing the lest name
     */
    public void setLestName(String lestName) {
        this.lestName = lestName;
    }

    /**
     * gets the ID
     * @return the ID
     */
    public int getId() {
        return id;
    }

    /**
     * Method redefines the ID
     * @param id Representing the ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * gets the date of birth
     * @return Returns a date object
     */
    public Date getDateOfBirth() {
        return new Date(dateOfBirth);
    }

    /**
     * Method redefines the date of birth
     * @param dateOfBirth Representing the date of birth
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = new Date(dateOfBirth);
    }


}

