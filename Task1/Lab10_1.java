package Task1;

public class Lab10_1 {

    public static void main(String[] args) {
        FunctionalLab10 formula = (a, b, c, d) -> (Math.pow(a, b) / Math.cosh(Math.abs(b))) + ((4 * Math.log10(c)) / Math.pow(d, 0.2));
        System.out.println("> a => " + 2.98 + "; b => " + 5.55 + "; c => " + 0.045 + "; " + " d => " + 0.129 + ";");
        System.out.println("> Result => " + formula.formula(2.98, 5.55, 0.045, 0.129));
    }
}
