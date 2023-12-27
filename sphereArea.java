import javax.swing.JOptionPane;

public class sphereArea {
    //Prompts user to input radius value 
    public static void main(String[] args) {
        String radiusString = 
            JOptionPane.showInputDialog("Input sphere radius");
        System.out.println(radiusString);

        double radius = Double.parseDouble(radiusString);

        double sphereVolume = sphere_volume(radius);

        String volume = "Sphere Volume: " + sphereVolume;
        JOptionPane.showMessageDialog(null, volume);
    }

    private static double sphere_volume(double r)
    {
        return (4.0/3.0)* Math.pow(r, 3) * Math.PI;
    }
}