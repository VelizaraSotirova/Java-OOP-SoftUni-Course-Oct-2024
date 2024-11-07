package Exercise._04_Calculator;

public class Extensions {

    public static InputInterpreter buildInterpreter(CalculationEngine engine) {
        return new ExtensionInputInterpreter(engine);
    }
}
