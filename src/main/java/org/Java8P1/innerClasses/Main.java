package org.Java8P1.innerClasses;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        LinkedList.Node node = list.new Node();
        list.setKey("Key!!!");
        node.setValue("VALUE!!");
        System.out.println(node.toString());

        // local class це класи які ми можемо створювати в рамках методів
        class Local {
            private String type;


            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            @Override
            public String toString() {
                return "Local{" +
                        "type='" + type + '\'' +
                        '}';
            }
        }
        Local local = new Local();
        local.setType("Java");
        System.out.println(local.toString());
    }
}
