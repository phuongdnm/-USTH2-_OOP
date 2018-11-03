import java.util.ArrayList;

public class ShopingCartTestDrive {
    public static void main(String[] args) {
        ShopingCart cart = new ShopingCart();
        cart.getContent("5 apples");
        cart.getContent("3 bananas");
        cart.getContent("2 bottles of milk");
        cart.removeFromCart("3 bananas");
        cart.checkOut();
    }

}

class ShopingCart {
    private ArrayList<String> cartContents = new ArrayList<String>();

    public void getContent(String content) {
        cartContents.add(content);
    }

    public void removeFromCart(String content){
        cartContents.remove(content);
    }

    public void checkOut() {
        System.out.println(cartContents.toString());
    }

}