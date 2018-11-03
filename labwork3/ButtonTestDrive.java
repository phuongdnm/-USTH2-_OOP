public class ButtonTestDrive {
    public static void main(String[] args) {
        Button button = new Button();
        button.setLabel();
        button.setColor();
        System.out.println("Press button! ");
        button.dePress();
        System.out.println("Stop!");
        button.unDepress();
    }
}

class Button {
    private String label;
    private String color;

    public void setColor() {
        this.color = "Red";
    }

    public void setLabel() {
        this.label = "Phuong";
    }

    public void dePress() {
        System.out.println("Name: " + this.label);
        System.out.println("Color: " + this.color);
    }

    public void unDepress() {
        System.out.println("Close.");
    }

}
