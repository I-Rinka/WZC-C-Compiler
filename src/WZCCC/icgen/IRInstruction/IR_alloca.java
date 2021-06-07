package bit.minisys.minicc.ncgen.IRInstruction;

public class IR_alloca implements IR_instruction
{
    String dest;
    String type;
    public String postfix = null;

    public IR_alloca(String dest, String ltype)
    {
        this.dest = dest;
        this.type = ltype;
    }

    @Override
    public String toString()
    {
        if (postfix != null)
        {
            return dest + " = " + "alloca " + type + ", " + postfix;
        }
        return dest + " = " + "alloca " + type;
    }
}
