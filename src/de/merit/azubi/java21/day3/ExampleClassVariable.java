package de.merit.azubi.java21.day3;

public class ExampleClassVariable {

    public static void main(String[] args) {
        FamilyMember dad = new FamilyMember();

        System.out.println("Family's surname is: " + dad.surname);

        System.out.println("Family's surname is: " + FamilyMember.surname);

        FamilyMember child1 = new FamilyMember();
        child1.name = "Carl";

        System.out.println("Kind 1 heißt: " + child1.name + " " + child1.surname);


    }
}
