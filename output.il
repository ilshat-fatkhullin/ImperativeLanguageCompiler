.assembly example{}
.method public static void print_int32(int32 a) cil managed 
{
ldarg.0
call void [mscorlib]System.Console::WriteLine(int32)
ret
}
.method public static void add_value(int32 a) cil managed
{
ldarg.0
ldc.i4 1
add
starg 0
ldarg.0
call void print_int32(int32)
ret
}
.method public static void main() cil managed
{
.entrypoint
.locals init (
[0] int32 b
)
ldc.i4 3
ldc.i4 4
add
stloc.0
ldloc.0
ldc.i4 7
ceq
ldc.i4.0
beq IL_0003
br IL_0004
IL_0003:
ldc.i4 2
stloc.0
IL_0004:
ldloc.0
call void print_int32(int32)
ldloc.0
call void add_value(int32)
ret
}
