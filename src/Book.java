public class Book {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount) {
        if(pageCount <= 0){
            throw new IllegalArgumentException("Page count must be positive");
        }
        if(title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException("Title cannot be empty");
        }
            this.pageCount = pageCount;
            this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }
    @Override
    public String toString() {
        return "\"" + title + "\" (" + pageCount + " pages)";
    }
}
