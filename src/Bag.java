public class Bag {

    private String books;
    private String waterbottle;
    private String compass;

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    private boolean locked;

    public String getBooks() {
        return books;
    }

    public void setBooks(String books) {
        this.books = books;
    }

    public String getWaterbottle() {
        return waterbottle;
    }

    public void setWaterbottle(String waterbottle) {
        this.waterbottle = waterbottle;
    }

    public String getCompass() {
        return compass;
    }

    public void setCompass(String compass) {
        this.compass = compass;
    }
}
