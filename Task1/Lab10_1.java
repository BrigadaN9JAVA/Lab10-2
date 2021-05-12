package Task1;

public class Lab10_1 {

    static void result(FunctionalLab10 formula, double a, double b, double c, double d){
        System.out.println("> a => " + a + "; b => " + b + "; c => " + c + "; " + " d => " + d + ";");
        System.out.println("> Result => " + formula.formula(a, b, c, d));
    }
    
    public static void main(String[] args) {
        FunctionalLab10 formula = (a, b, c, d) -> (Math.pow(a, b) / Math.cosh(Math.abs(b))) + ((4 * Math.log10(c)) / Math.pow(d, 0.2));
        result(formula, 2.98, 5.55, 0.045, 0.129);
    }
}
