// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
// 
// Surface Area: 600
// Volume: 1000

public class Cuboid {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        int surface = 2 * (a * b) + 2 * (a * c) + 2 * (b * c);
        int volume = a * b * c;

        System.out.println(surface);
        System.out.println(volume);
    }
}
