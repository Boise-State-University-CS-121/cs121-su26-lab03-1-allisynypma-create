import java.util.Scanner;

public class SphereCalculator 
{
    /* This program prints the Volume & Surface Area of a Shpere given the Radius by User */
    public static void main (String [] args)
    {
        /* Input Processing */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the sphere's radius: ");
        double userRadius = scan.nextDouble();
        
        /*Calculate Volume of a Shpere using, V= (4/3) * PI * r^3 */
        double userVolume = (4.0 /3.0 * Math.PI * Math.pow(userRadius, 3));

        /* Calculate Surface Area of a Shpere using, A= 4* PI * r^2 */
        double userArea = ( 4.0 * Math.PI * Math.pow(userRadius, 2));

        /* Output processing */
        System.out.printf("Volume: %.4f \n", userVolume);
        System.out.printf("Surface area: %.4f \n", userArea);
       






        scan.close();
    }



}
