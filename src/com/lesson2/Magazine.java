package com.lesson2;

/**
 * @author yuriismac on 2020-11-12.
 * @project lesson2_abstract_and_interface
 */
public class Magazine implements Printable {

    private int id;
    private String magazineName;
    private String description;

    public Magazine(int id, String magazineName, String description) {
        this.id = id;
        this.magazineName = magazineName;
        this.description = description;
    }

    public Magazine() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMagazineName() {
        return magazineName;
    }

    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", magazineName='" + magazineName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public static void printMagazines(Printable[] printables){
        for (Printable valueOfArray: printables){
            if (valueOfArray instanceof Magazine){
                System.out.println(valueOfArray + "; \n-------------------------------------------------------");
            }
        }
    }

    @Override
    public void print() {
        System.out.printf("Журнал №%s\nНазва журналу: %s; \nОпис: %s;\n--------------------------------------\n\"",
        id, magazineName, description);
    }
}
