package xxl.content.functions.binary;

import xxl.content.Content;
import xxl.content.literals.Int;
import xxl.content.literals.InvalidValue;
import xxl.content.literals.Literal;
import xxl.visits.CellVisitor;

/**
 * Class representing a subtraction function.
 */
public class Sub extends BinaryFunction {
    
    /**
     * Constructor
     * 
     * @param arg1
     * @param arg2
     */
    public Sub(Content arg1, Content arg2) {
        super(arg1, arg2);
        setName("SUB");
    }

    @Override
    public Literal value() {
        try {
            if (hasValidArguments())
                return new Int(parseIntValue(getFirstArg()) - parseIntValue(getSecondArg()));
        } catch (ClassCastException e) {
            return new InvalidValue();
        }
        return new InvalidValue();
    }

    @Override
    public String toString() {
        return "SUB" + super.toString();
    }

    @Override
    public void accept(CellVisitor visitor) {
        visitor.visitSubFunction(this);
    }
}