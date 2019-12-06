.assembly example{}
.method public static void print_integer(int32 a) cil managed 
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
.method public static void main() cil managed
{
.locals init (
[0] int32 a
)
.entrypoint
ldc.i4 0
stloc.0
IL_0001:
ldloc.0
ldc.i4 10
clt
ldc.i4.0
beq IL_0002
ldloc.0
call void print_integer(int32)
ldloc.0
ldc.i4 1
add
stloc.0
br IL_0001
IL_0002:
ret
}
