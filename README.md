# WZC-C-Compiler
基于Antlr，LLVM-IR，多种目标平台可选的，带有简单优化的2遍C语言编译器

掏空clang (笑

较完整的可运行代码见： https://github.com/I-Rinka/BIT-MiniCC/tree/master/src/bit/minisys/minicc/ncgen

本项目待整合。

模块结构: 

+ WzcParser
    + 读入c文件，语法分析，返回ast根 
    + 相当于同时进行词法和语法分析

+ WzcLLVM
    + 输入ast根，返回中间代码
    + （可以选择性）的将中间代码输出到字符串 

+ WzcIRScanner
    + 对一个函数内的指令进行扫描，划分基本块，并得到基块信息 

+ WzcTargetmaker
    + 接口，scanner对其进行调用，进行指令的分配以及寄存器的分配 

+ WzcLLOpt
    + 对llvm代码进行优化，输出优化后的llvm代码
