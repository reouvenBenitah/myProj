public class Apartment {
    private String familyName;
    private int rent;
    private boolean isRented;

    public Apartment(int rent){
        this.familyName="";
        this.rent = rent;
        this.isRented = false;
    }

    public Apartment(String familyName,int rent){
        this.familyName = familyName;
        this.rent = rent;
        this.isRented = true;
    }

    public Apartment(Apartment other){
        this.familyName = other.familyName;
        this.rent = other.rent;
        this.isRented = true;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public String toString (){
        String str1 =", not rented yet.";
        String str2 =", rented to "+getFamilyName();
        if(isRented==false)
            return "Apartment rent: "+this.rent+str1;
        else
            return "Apartment rent: "+this.rent+str2;

    }
}
class testerApartment{
    public static void main(String[] args) {
        Apartment apartment = new Apartment("Benitah",9000);
        Apartment apartment1 = new Apartment("Amzallag",5500);
        Apartment apartment2 = new Apartment("Pinto",8000);
        Building building = new Building();
        building.addApartment(apartment);
        building.addApartment(apartment1);
        building.addApartment(apartment2);
        System.out.println(building.toString());

    }
}