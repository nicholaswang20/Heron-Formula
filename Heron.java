public class Heron {
    public static void main (String [] args) {
        // String validation 
        final String a_s = args[0];
        final String b_s = args[1];
        final String c_s = args[2];
        if(!(valueValidate(a_s) && valueValidate(b_s) && valueValidate(c_s))) {
            System.err.println("Input value error");
            System.exit(13);
        }
        
        // Convert string to double 
        final double a = Double.parseDouble(a_s);
        final double b = Double.parseDouble(b_s);
        final double c = Double.parseDouble(c_s);

        if (!triangleCheck(a, b, c)) {
            System.err.println("Not a Triangle");
            System.exit(13);
        }

        System.out.println(triangleArea(a, b, c));
    }

    private static boolean valueValidate(String s) {
        final String digits = ".0123456789";
        int n_dots = 0;
        for(int i = 0; i < s.length(); i++) {
            String letter = s.substring(i, i+1);
            if (letter.equals(".") ) { n_dots++; }
            if (digits.indexOf(letter) == -1) { return false; }
        }
        if(n_dots > 1) { return false; }
        return true;
    }

    private static boolean triangleCheck (double a, double b, double c) {
        if (a + c < b) { return false; }
        if (a + b < c) { return false; }
        if (b + c < a) { return false; } 
        return true; 
    }
    
    private static double triangleArea (double a, double b, double c) {
        final double s = (a + b + c)/2;
        return Math.sqrt(s* (s-a) * (s-b) * (s-c));
    }
}