package com.lesson2;

/**
 * @author yuriismac on 2020-11-13.
 * @project lesson2_abstract_and_interface
 */
/*Создать статический метод printMagazines(Printable[] printable) в классе Magazine, который выводит на консоль названия только журналов.
Создать статический метод printBooks(Printable[] printable) в классе Book, который выводит на консоль названия только книг. Используем оператор instanceof.*/
public class Main {
    public static void main(String[] args) {

        Printable[] printable = new Printable[6];

        Book book1 = new Book(1,"Karnegi", "Description");
        Magazine magazine1 = new Magazine(1,"Maxim", "Description");
        Book book2 = new Book(2,"Brown", "Description");
        Book book3 = new Book(3,"Potter", "Description");
        Book book4 = new Book(4,"War and Peace", "Description");
        Magazine magazine2 = new Magazine(1,"Avon", "Description");

        try{
        printable[0] = book1;
        printable[1] = magazine1;
        printable[2] = book2;
        printable[3] = magazine2;
        printable[4] = book3;
        printable[5] = book4;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }


        for (Printable item: printable) {
            if (item == null){
                break;
            }
            System.out.println(item);
            item.print();
        }
        Book.printBooks(printable);
        Magazine.printMagazines(printable);



    }
}
