public class Link {
    private Person p1;
    private Person p2;
    private Relation relations;

    public Person getP1() {
        return this.p1;
    }

    public Person getP2() {
        return this.p2;
    }

    public Relation getRelations() {
        return this.relations;
    }

    public Link(Person p1, Person p2, Relation relations) {
        this.p1 = p1;
        this.p2 = p2;
        this.relations = relations;
    }

    @Override
    public String toString() {
        return "Link [p1=" + p1 + ", p2=" + p2 + ", relations=" + relations + "]";
    }
    
    
}