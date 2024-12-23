package lesson_24.interfaces;

public class Presentation implements ColorPrintable{
    private String titel;
    private String autor;
    private String thema;
    private int pages;

    public Presentation(String titel,String autor,String thema,int pages) {
        this.titel = titel;
        this.autor = autor;
        this.thema = thema;
        this.pages = pages;
    }

    @Override
    public void colorPrint() {
        System.out.println("Отправляю презентацию в типографию!");
        System.out.println("Презентация: " + autor + "тема: " +thema);
    }

    @Override
    public void print() {
        System.out.println("Презентация: " + titel + "; страниц: " + pages);
    }
}
