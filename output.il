.assembly example{}
.method public static void print_int(int32 a) cil managed 
{
ldarg.0
call void [mscorlib]System.Console::WriteLine(int32)
ret
}

.method public static void print_real(float32 a) cil managed 
{
ldarg.0
call void [mscorlib]System.Console::WriteLine(float32)
ret
}

.method public static void print_boolean(bool a) cil managed 
{
ldarg.0
call void [mscorlib]System.Console::WriteLine(bool)
ret
}
.method public static bool add_value(bool a) cil managed
{
ldarg.0
ldarg.0
xor
starg 0
ldarg.0
call void print_boolean(bool)
ldarg 0
ret
}
.method public static void main() cil managed
{
.entrypoint
.locals init (
[0] bool b
)
ldc.i4.0
stloc.0
ldloc.0
ldc.i4.0
ceq
ldc.i4.0
beq IL_0003
br IL_0004
IL_0003:
ldc.i4.1
stloc.0
IL_0004:
ldloc.0
call void print_boolean(bool)
ldloc.0
call bool add_value(bool)
stloc.0
ldloc.0
call void print_boolean(bool)
ret
}
