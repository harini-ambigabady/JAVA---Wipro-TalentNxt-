class Foundation {
    private int var1 = 1;          // private access
    int var2 = 2;                 // default (package-private) access
    protected int var3 = 3;       // protected access
    public int var4 = 4;          // public access

    // Getters for demonstration purposes
    public int getVar1() { return var1; }
    public int getVar2() { return var2; }
    public int getVar3() { return var3; }
    public int getVar4() { return var4; }
}


public class TestFoundation {
    public static void main(String[] args) {
        Foundation foundation = new Foundation();
        
        // Accessing variables of Foundation class
        // System.out.println("var1: " + foundation.var1); // Not accessible (private)
        // System.out.println("var2: " + foundation.var2); // Not accessible (default access)
        // System.out.println("var3: " + foundation.var3); // Not accessible (protected access)
        System.out.println("var4: " + foundation.var4); // Accessible (public access)
        
        // Accessing through getters
        System.out.println("var1 (via getter): " + foundation.getVar1()); // Accessible (via public getter)
        System.out.println("var2 (via getter): " + foundation.getVar2()); // Accessible (via public getter)
        System.out.println("var3 (via getter): " + foundation.getVar3()); // Accessible (via public getter)
        System.out.println("var4 (via getter): " + foundation.getVar4()); // Accessible (via public getter)
    }
}
