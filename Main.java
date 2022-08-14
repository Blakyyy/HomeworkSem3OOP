public class Main {
    public static void main(String[] args) {
        Person p1 = new Family("Alex", 30);
        Person p2 = new Family("Clara", 28);
        Person p3 = new Family("Jorge", 7);
        Person p4 = new Family("Vikcy", 5);

        Tree tree1 = new Tree();
        tree1.addLink(p1, p2, Relation.HUSBAND);
        tree1.addLink(p1, p3, Relation.PARENT);
        tree1.addLink(p1, p4, Relation.PARENT);

        tree1.addLink(p4, p3, Relation.SISTER);
        tree1.addLink(p3, p4, Relation.BROTHER);

        JavaFunctions jf = new JavaFunctions();
        jf.compare(p4, p2);

        UserInterface ui1 = new InterfaceFunctions();
        ui1.printInfoChild("Alex", tree1);
        ui1.printInfoSister("Jorge", tree1);
        ui1.SaveRecord(tree1);
        
    }
}
