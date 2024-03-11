package org.example;

import jdepend.swingui.JDepend;

public class SwingUIMain {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend();
        depend.addDirectory("T:\\lethingocmai_20005501\\Library-Assistant-master");
        depend.analyze();
        System.out.println("DONE");
    }
}
