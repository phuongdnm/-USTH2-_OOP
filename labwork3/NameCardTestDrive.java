public class NameCardTestDrive {
    public static void main(String[] args) {
        NameCard Polly = new NameCard();
        Polly.setName("Polly Morfism");
        Polly.setPhone(5550343);
        Polly.setEmail("pm@wiekedlysm.art");
    }
}

class NameCard{
    private String name;
    private int phone;
    private String email;

    public void setName(String name){
        this.name = name;
        System.out.println(this.name);
    }
    public void setPhone(int phone){
        this.phone = phone;
        System.out.println(phone);
    }

    public void setEmail(String email){
        this.email = email;
        System.out.println(email);
    }
}
