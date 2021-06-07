package bit.minisys.minicc.ncgen.BasicBlockInfo;

import bit.minisys.minicc.ncgen.IRInstruction.IR_instruction;

import java.util.LinkedList;

public class FunctionContent
{
    public String name;
    public String ltype;
    LinkedList<IR_instruction> InsBuffer;
    LinkedList<String> used_param;

    public FunctionContent(String func_name, LinkedList<IR_instruction> InsBuffer, LinkedList<String> used_param)
    {
        this.name = func_name;
        this.InsBuffer = InsBuffer;
        this.used_param = used_param;
    }
}
