public abstract class Gyvunas implements Comparable {
    protected String name;
    protected String type;

    public Gyvunas(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int compareTo(Gyvunas g) {
        int comparison;
        if ((comparison = type.compareTo(g.getType())) != 0) {
            return comparison;
        }
        if ((comparison = name.compareTo(g.getName())) != 0) {
            return comparison;
        }
        return 0;
    }
}
