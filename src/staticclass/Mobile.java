package staticclass;

public class Mobile {
    String name;
    String mobileNumber;
    String brand;
    static String phone;

    public void show(){
        System.out.println("phone "+ phone + "mobile " + mobileNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static String getPhone() {
        return phone;
    }

    public static void setPhone(String phone) {
        Mobile.phone = phone;
    }
}
