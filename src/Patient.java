public class Patient {

    private String name;
    private String email;
    private String addres;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;

    public String blood;

    public Patient(String name, String email) {
        this.name = name;
        this.email = email;
        this.weight = 54.5;
        System.out.println("Construido der patient mon amico");
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return this.weight + " Kg.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("Debe de ser de 8 digitos el numero");
        } else if(phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("No fue valido carnal");
        }
    }

    public String getAddres() {
        return addres;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public double getHeight() {
        return height;
    }

}
