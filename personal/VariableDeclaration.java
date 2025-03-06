package personal;

public class VariableDeclaration {
    // static int x, y=z, z=10; //Cannot reference a field before it is defined
    static int x, y=5, z=y+x; //Valid

}
