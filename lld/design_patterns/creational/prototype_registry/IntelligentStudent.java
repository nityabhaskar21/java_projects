package lld.design_patterns.creational.prototype_registry;

public class IntelligentStudent extends Student{
    int iq;
    @Override
    public IntelligentStudent copy() {
        IntelligentStudent is = new IntelligentStudent();
        is.id=this.id;
        is.name=this.name;
        is.psp=this.psp;
        is.iq = iq;

        return is;
    }

}
