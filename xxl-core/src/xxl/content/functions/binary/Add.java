package xxl.content.functions.binary;

import xxl.content.literals.Literal;
import xxl.content.literals.Int;
import xxl.content.literals.InvalidValue;
import xxl.content.Content;

public class Add extends BinaryF {
    public Add(Content arg1, Content arg2) {
        super(arg1, arg2);
        setName("ADD");
    }

    public Literal value() {
        if (hasValidArguments())
            return new Int(((Int)_arg1).getValue() + ((Int)_arg2).getValue());
        return new InvalidValue();
    };
}