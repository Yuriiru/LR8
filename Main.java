package com.company;

import java.util.Scanner;

class FormylException extends Exception{

    private double y;
    public double getY(){
        return y;
    }
    public FormylException(String massage, double y){
        super(massage);
        this.y = y;
    }
}

class Example {
    public static double getExample (double x, double y) throws FormylException{
        double result;
        if(y == -1) throw new  FormylException("Вы ввели -1, знаменатель = 0!", y);
        result = (x + y)/(y + 1);
        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x: ");
        double x = in.nextDouble();
        System.out.print("Введите число y: ");
        double y = in.nextDouble();

        try {
            double result = Example.getExample(x, y);
            System.out.printf("x+y/y+1 = %f", result);
        } catch (FormylException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getY());
        }
    }
}
