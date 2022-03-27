package ru.synergy.construktorsTest;


public class Main {

    public static void main(String [] args) {
        Fraction fr = new Fraction(1, 2);
        fr.add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator().add1ToNumerator();


        Person evgenu = new Person("Makarenkov","Evgenu", 'm');
        System.out.println(evgenu);

        Employee olga = new Employee("Svetova", "Olga,", 'f', "buhgalter");

        System.out.println(olga);
        olga.tellMeAreu();

        Person olga2 = olga;

        System.out.println(olga2);
        ((Employee) olga2).tellMeAreu();
        // Employee evgenu2= evgenu;
    }
}

class Fraction {
    private int numerator; // числитель
    private int denominator; //знаменатель

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public Fraction add1ToNumerator(){
        this.numerator++;
        return this;
    }
    public Fraction getObjectCurrent(){

        return this;
    }
}
    class Person {
    protected String firstName;
    protected String lastName;
    protected char gender; // m -male, f -female

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public char getGender() {
            return gender;
        }

        public void setGender(char gender) {
            this.gender = gender;
        }

        public Person(){
            this("", "", '-');
        }
        public Person (String lastName){
            this(lastName,"",'-');
        }

        public Person(String lastName, String firstName, char gender){
            this(lastName, firstName);
            this.gender = gender;
        }

        public Person(String lastName, String firstName){
            this.firstName = firstName;
            this.lastName = lastName;

        }

        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    class Employee extends Person{
    protected String doljnost;

        public Employee(String lastName, String firstName, char gender, String doljnost) {
            super(lastName, firstName, gender);
            this.doljnost = doljnost;
        }



        @Override
        public String toString() {
            return "Employee{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", gender=" + gender +
                    ", doljnost='" + doljnost + '\'' +
                    '}';
        }

        public void tellMeAreu(){
            System.out.println("Hello, i am employee, and my class is" + this.getClass());
        }
    }


