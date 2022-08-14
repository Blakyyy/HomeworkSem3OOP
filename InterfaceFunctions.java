import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class InterfaceFunctions implements UserInterface  {

    public void printInfoChild(String name, Tree tree) {
        List<Link> trees =  tree.getTreesInfo();
        for(Link i : trees) {
            if(i.getP1().getName().equals(name) && i.getRelations() == Relation.PARENT) {
                System.out.println(i.getP2());
            }
        }
    }

    public void printInfoSister(String name, Tree tree) {
        List<Link> trees = tree.getTreesInfo();
        for (Link i : trees) {
            if (i.getP1().getName().equals(name) && i.getRelations() == Relation.BROTHER) {
                System.out.println(i.getP2());
            }
        }
    }

    public void SaveRecord(Tree tree) {
        List<Link> trees = tree.getTreesInfo();
        String filepath = "save.txt";
        try (FileWriter fw = new FileWriter(filepath, true); BufferedWriter bw = new BufferedWriter(fw); PrintWriter pw = new PrintWriter(bw);){
            pw.println(trees);
            pw.println(" ");
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}