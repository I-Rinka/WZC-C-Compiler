package bit.minisys.minicc.ncgen.IRInstruction;

public class IR_ext implements IR_instruction
{
    String dest;
    String op;
    String src_type;
    String src;
    String target_type;
    public IR_ext(String dest,String op,String src_ltype,String src,String target_ltype)
    {
        this.dest=dest;
        this.op=op;
        this.src_type=src_ltype;
        this.target_type=target_ltype;
        this.src=src;
    }

    @Override
    public String toString()
    {
        return dest+" = "+op+" "+src_type+" "+src+" "+"to"+" "+target_type;
    }
}
