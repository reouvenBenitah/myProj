
public class Driver {
    public static void main(String[] args) {
        Group group = new Group();
        Person person1 = new Person("Reuven","Benitah",12345,20,10,1949);
        Person person2 = new Person("Shimon","Pinto",1234576858,20,10,1923);
        Person person3 = new Person("Sarah","Amzallag",1234576858,1,1,1948);
        group.addPerson(person1);//add person to array/
        group.addPerson(person2);
        group.addPerson(person3);
        System.out.println("Names the person in the group: "+ "\n" +group.toString());
        System.out.println("The oldest person in the group: "+group.oldestPerson().getFirstName());
        System.out.println("The person whose last name is first in the dictionary: "+group.firstPerson());
        System.out.println("Are person1 and person2 born on the same date ? "+person1.sameBirthday(person2));
        System.out.println("Number of people born in the same month OCTOBER: "+group.bornInMonth(10));
        System.out.println("Number of people born in the same date: "+group.bornInDate(person1.getDateOfBirth()));
        System.out.println("Is person1 born after person3 ?: "+person1.getDateOfBirth().after(person3.getDateOfBirth()));
     }


}
