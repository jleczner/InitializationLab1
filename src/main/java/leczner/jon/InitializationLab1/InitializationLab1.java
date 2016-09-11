package leczner.jon.InitializationLab1;

/**
 * Created by jonathanleczner on 9/10/16.
 */
public class InitializationLab1 {
    public static void main(String[] args) {
        ColorfulThing blueThing = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing redThing = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing greenThing = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing yellowThing = new ColorfulThing(ColorfulThing.Color.YELLOW);
        ColorfulThing purpleThing = new ColorfulThing(ColorfulThing.Color.PURPLE);

        System.out.println(blueThing.getColor());
        System.out.println(redThing.getColor());
        System.out.println(greenThing.getColor());
        System.out.println(yellowThing.getColor());
        System.out.println(purpleThing.getColor());
    }
}
class ColorfulThing {
    private Color color;

    public enum Color {BLUE, RED, GREEN, YELLOW, PURPLE}

    public ColorfulThing(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
class BoringThing {}
