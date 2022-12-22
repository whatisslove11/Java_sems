public class Book {
    private int years;
    private String name;
    private int Number_of_Pages;
    public Book(int years, String name, int Number_of_Pages){
        this.years = years;
        this.name = name;
        this.Number_of_Pages = Number_of_Pages;
    }

    public int getOld(){
        return years;
    }

    public String getName(){
        return name;
    }
    public int getNumber_of_Pages(){
        return Number_of_Pages;
    }
    public void setOld(int years){
        this.years = years;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumber_of_Pages(int Number_of_Pages){
        this.Number_of_Pages = Number_of_Pages;
    }
    public void infoBook(){
        System.out.println("Name of the book - "+ name);
        if (years >= 15) {
            System.out.println("The book is old.");
        } else System.out.println("The book isn't old.");
        System.out.print("Book has " + Number_of_Pages + " pages.");
    }
}