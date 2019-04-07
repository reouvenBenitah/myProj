
public class Group {
    private int MAX = 10;
    private int numArrayPerson;
    private Person[] arrayPerson;

    /**
     * A constructor that initializes the class attributes
     */
    public Group() {
        numArrayPerson = 0;
        arrayPerson = new Person[MAX];
    }

    /**
     * A method that adds another person to the group and checks whether it is
     * present and whether there is room in the array
     * @param p An object as a parameter that represents the person
     * @return If there is a place added successfully and false if there is no place
     */
    public boolean addPerson(Person p) {
        if (numArrayPerson == MAX)//If there is room in the group
            return false;
        for (int i = 0; i < numArrayPerson; i++) {
            if (arrayPerson[i].equals(p))//if it is
                return false;
        }
        arrayPerson[numArrayPerson] = p;
        numArrayPerson++;
        return true;
    }

    /**
     * A method that receives a date and returns how many women were born on that date
     * @param d Which represents the date
     * @return Amount of people born on the same date
     */
    public int bornInDate(Date d) {
        int cuont = 0;//A parameter that will sum people up
        if (numArrayPerson == 0) {
            return 0;
        } else {
            for (int i = 0; i < numArrayPerson; i++) {
                if (arrayPerson[i].getDateOfBirth().equals(d)) {
                    cuont++;
                }//if
            }//for
            return cuont;
        }
    }

    /**
     * A method that receives a month and returns how many women were born on that month
     * @param m Which represents the month
     * @return Amount of people born on the same month
     */
    public int bornInMonth(int m) {
        int FIRST_MONTH = 1;
        int LEST_MONTH = 30;
        int cuont = 0;
        if (!(m > FIRST_MONTH && m < LEST_MONTH)) {
            return 0;
        } else {
            for (int i = 0; i < numArrayPerson; i++) {
                if (arrayPerson[i].equals(0)) {
                    return 0;
                }
                if (arrayPerson[i].getDateOfBirth().getMonth() == m) {
                    cuont++;
                }
            }
            return cuont;
        }
    }

    /**
     * A method that tests the oldest person in the group
     * @return You're the oldest person
     */

    public Person oldestPerson() {
        if (numArrayPerson == 0)//if there is room in the group
        {
            return null;
        }
        Person mostBiggerOfAge = arrayPerson[0];//Is defined as a person who is older than the group for testing
        for (int i = 1; i < numArrayPerson; i++) {
            if (mostBiggerOfAge.getDateOfBirth().before(arrayPerson[i].getDateOfBirth())) {
                mostBiggerOfAge = arrayPerson[i];
            }
        }
        return new Person(mostBiggerOfAge);

    }

    /**
     * A method that returns the person whose first surname is in the dictionary
     * @return the first name
     */
    public String firstPerson() {
        if (numArrayPerson == 0) {
            return null;
        }
        Person firstFamily = arrayPerson[0];//Is defined as the first person in the group whose last name is in the dictionary
        for (int i = 1; i < numArrayPerson; i++) {
            if (firstFamily.getLestName().compareTo(arrayPerson[i].getLestName()) < 0) {
                firstFamily = arrayPerson[i];
            }
        }
        return firstFamily.getFirstName();

    }

    /**
     * A method that prints the individual names of the people in the array
     * @return the first name
     */

    public String toString() {
        String str = "";
        for (int i = 0; i < numArrayPerson; i++) {
            str += arrayPerson[i].getFirstName() + " " + arrayPerson[i].getLestName() +"\n";
        }
        return str;
    }
}
























