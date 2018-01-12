// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`

public class Colors {

    public static void main(String[] args) {

        String[][] colors = {{"lime", "forest green", "olive", "pale green", "spring green"}, {"orange red", "red", "tomato"}, {"orchid", "violet", "pink", "hot pink"}};

        System.out.print("Shades of green: ");
        for (int j = 0; j < colors[0].length; j++) {
            System.out.print(" " + colors[0][j]);
        }
        System.out.println();
        System.out.print("Shades of red: ");
        for (int j = 0; j < colors[1].length; j++) {
            System.out.print(" " + colors[1][j]);
        }
        System.out.println();
        System.out.print("Shades of pink: ");
        for (int j = 0; j < colors[2].length; j++) {
            System.out.print(" " + colors[2][j]);
        }
    }
}
