public class Building {
    private Apartment[] apartments;
    private int numOfAppartments;
    private final int MAX_APARTMENTS = 20;

    public Building() {
        apartments = new Apartment[MAX_APARTMENTS];
        numOfAppartments = 0;
    }

    public boolean addApartment(Apartment a) {
        if (numOfAppartments == MAX_APARTMENTS)
            return false;
        apartments[numOfAppartments++] = a;
        return true;
    }

    public void raiseRent(int amount) {
        for (int i = 0; i < numOfAppartments; i++) {
            apartments[i].setRent(apartments[i].getRent() + amount);
        }
    }

    public int howManyNotRented() {
        int account = 0;
        for (int i = 0; i < numOfAppartments; i++) {
            if (!apartments[i].isRented()) {
                account++;
            }
        }
        return account;
    }

    public int howManyPays(String familyName) {
        int nameSumPay = -1;
        for (int i = 0; i < numOfAppartments; i++) {
            if (apartments[i].getFamilyName().equals(familyName)) {
                nameSumPay = apartments[i].getRent();
                break;
            }
        }
        return nameSumPay;
    }

    public Apartment maxRent() {
        Apartment apartmentPayMax = apartments[0];
        for (int i = 0; i < numOfAppartments; i++) {
            if (apartments[i].getRent() > apartmentPayMax.getRent()) {
                apartmentPayMax = apartments[i];
            }
            if (apartmentPayMax == null) {
                return null;
            }
        }
        return new Apartment(apartmentPayMax);
    }
    public String toString(){
        String str = "";
        System.out.println("This building has ["+this.numOfAppartments+"]"+" apartments:");
        for (int i = 0; i < numOfAppartments; i++) {
            str+="Family name: "+apartments[i].getFamilyName()+
                    ",s Rent apartment: "+apartments[i].getRent()+"\n";

        }
        return str;
    }
}


















