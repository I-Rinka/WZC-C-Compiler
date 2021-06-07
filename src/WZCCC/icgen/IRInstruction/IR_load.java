package bit.minisys.minicc.ncgen.IRInstruction;

public class IR_load implements IR_instruction
{
    String dest;
    String type;
    String src;
    public String postfix;

    public IR_load(String dest, String ltype, String src)
    {
        this.dest = dest;
        this.type = ltype;
        this.src = src;
    }

    @Override
    public String toString()
    {
        String rt_str = dest + " = " + "load" + " " + type + ", " + type + "* " + src;
        if (postfix != null)
        {
            rt_str += ", " + postfix;
        }
        return rt_str;
    }
}
