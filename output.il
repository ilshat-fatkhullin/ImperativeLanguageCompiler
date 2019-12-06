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
[0] int32 i
)
.entrypoint
ldc.i4 1
stloc.0
ldloc.0
ldc.i4 3
cgt
ldc.i4.1
beq IL_0001
br IL_0002
IL_0001:
ldc.i4 3
stloc.0
IL_0002:
ldloc.0
ldc.i4 1
sub
stloc.0
IL_0003:
ldloc.0
ldc.i4 1
clt
ldloc.0
ldc.i4 3
clt
or
ldc.i4.0
beq IL_0004
ldloc.0
ldc.i4 1
add
stloc.0
ldc.i4.0
call void print_boolean(bool)
br IL_0003
IL_0004:
ret
}
