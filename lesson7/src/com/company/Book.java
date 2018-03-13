package com.company;

public class Book implements IBook {

    @Override
    public void setBookname(String name) {
        this.name = name;
    }

    @Override
    public String getAuthor() {
        return author.name;
    }

    private String name;

    public Author author;


    void setAuthor (String author){
        this.author.name =author;
    }

    public class Author {
        public String name;
        public int year;
        public void setName (String name) {
            class Test {
                public String value;

            }
            Test t = new Test ();
            t.value = "aaaaaaaaaaaaaaaaa";



            Book.this.setBookname(name); //чтобы обратиться к методу, который за пределами вложенного класса
        }
    }

    public Book (){
        author = new Author ();

    }

    public String getBookName (){
        return name;
    }
}
