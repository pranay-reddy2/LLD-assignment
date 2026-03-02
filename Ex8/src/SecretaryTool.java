public class SecretaryTool implements MinutesOps {

    private final MinutesBook book;

    public SecretaryTool(MinutesBook book) {
        this.book = book;
    }

    @Override
    public void addMinutes(String text) {
        book.add(text);
        System.out.println("Minutes added: \"" + text + "\"");
    }

    @Override
    public int getMinutesCount() {
        return book.count();
    }
}