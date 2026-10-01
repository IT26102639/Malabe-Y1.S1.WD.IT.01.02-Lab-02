public class IT26102639Lab2Q3 {

    public static void main(String[] args) {

        // Given lengths of the two legs of the right triangle
        double sideA = 3.0;
        double sideB = 4.0;

        // Calculate the length of the hypotenuse using the Pythagorean theorem
        // c = square root (sideA^2 + sideB^2)
        double hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);

        // Output the calculated hypotenuse
        System.out.println("length of the hypotenuse: " + hypotenuse);
    }
}