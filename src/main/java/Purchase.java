public class Purchase {
    protected String title;
    protected int count;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }

    public Purchase() {
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

}

