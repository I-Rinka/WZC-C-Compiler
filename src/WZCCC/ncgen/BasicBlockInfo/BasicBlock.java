package bit.minisys.minicc.ncgen.BasicBlockInfo;

import bit.minisys.minicc.ncgen.IRInstruction.IR_instruction;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class BasicBlock
{
    String tag;
    public LinkedList<IR_instruction> DAGS;
    LinkedList<String> out_edge;
    LinkedList<String> in_edge;

    LinkedHashSet<String> IN_live_reg;
    LinkedHashSet<String> OUT_live_reg;

    LinkedHashSet<String> DEF_live_reg;
    LinkedHashSet<String> USE_live_reg;

    public BasicBlock()
    {
        this.DAGS = new LinkedList<>();
        this.out_edge = new LinkedList<>();
        this.in_edge = new LinkedList<>();

        this.IN_live_reg = new LinkedHashSet<>();
        this.OUT_live_reg = new LinkedHashSet<>();

        this.DEF_live_reg = new LinkedHashSet<>();
        this.USE_live_reg = new LinkedHashSet<>();
    }
}
