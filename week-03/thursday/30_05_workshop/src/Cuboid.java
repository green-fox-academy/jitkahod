public class Cuboid {
    public static void main(String[] args) {

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
        double a = 2.0;
        double b = 2.0;
        double c = 2.0;

        double surface;
        double volume;

        surface = 2 * (a * b) + 2 * (b * c) + 2 * (c * a);
        System.out.println("Surface Area: "+surface);

        volume = a * b * c;

        System.out.println("Volume: "+volume);


    }

}
