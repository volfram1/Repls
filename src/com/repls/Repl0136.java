package com.repls;
    /*
    Please create methods with different access modifiers (one for each access modifier)
    and call them properly in main method one by one
    In each method write the logic accordingly like for private method write the logic in the
    println Statement as "This is Private Method" accordingly for rest
    of the methods that have different access modifiers should be a total of 4 outputs,
    please make sure they are in the same order that is printed below.
    Expected Output:
    This is Private Method
    This is Default Method
    This is Protected Method
    This is Public Method
     */

public class Repl0136 {

    private void a(){
        System.out.println("This is a Private method");
    }
    void b(){
        System.out.println("This is a Default method");
    }
    protected void c(){
        System.out.println("This is Protected method");
    }
    public void d(){
        System.out.println("This is a Public method");
    }

    public static void main(String[] args) {
        Repl0136 a1=new Repl0136();
        a1.a();
        a1.b();
        a1.c();
        a1.d();
    }
}
