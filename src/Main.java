public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("Tình yêu màu nắng", "Hay", "B1", 45000, "3/7/2015");
        Book book = new Book("Sách giáo khoa Toán 12", "...", "T12", 14000, "Nhà xuất bản Giáo dục Việt Nam", "Giáo dục", 65);

        mp3.showInfo();
        book.showInfo();
    }
}
