package ru.synergy;

public  class Rect {
    double width;
    double height;
    String nameOfRect;


    double getArea (){
        return width*height;
    }

    void mignify(double koeff){
        width *= koeff;
        height *= koeff;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                ", nameOfRect='" + nameOfRect + '\'' +
                '}';
    }
}


