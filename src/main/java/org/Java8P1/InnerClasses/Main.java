package org.Java8P1.InnerClasses;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.Node node = list.new Node();
        list.setKey("Key!!!");
        node.setValue("VALUE!!");
        System.out.println(node.toString());
    }

}
