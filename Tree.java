import java.util.ArrayList;
import java.util.List;

public class Tree {
    private List<Link> trees = new ArrayList<>();
    
    public List<Link> getTreesInfo() {
        return trees;
    }

    public void addLink(Person p1, Person p2, Relation link){
        Link l1 = new Link(p1, p2, link);
        trees.add(l1);
    }

    public List<Link> getTree() {
        return trees;
    }
}
