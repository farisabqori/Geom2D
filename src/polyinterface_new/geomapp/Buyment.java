package polyinterface_new.geomapp;

import polyinterface_new.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Buyment {

    public Geom2D Buy (int i){

        Scanner sc = new Scanner(System.in);
        int input1 = 0;
        int input2 = 0;
        int input3 = 0;
        int input4 = 0;
        int conditional = 0;
        Geom2D geom2D = null;
        switch(i) {
            case 1:
                System.out.print("Radius? ");
                input1 = sc.nextInt();
                geom2D = makeCircle(input1);
                break;
            case 2:
                System.out.print("Long Diagonal? ");
                input1 = sc.nextInt();
                System.out.print("Short Diagonal? ");
                input2 = sc.nextInt();
                System.out.print("Top Side? ");
                input3 = sc.nextInt();
                System.out.print("Bottom Side? ");
                input4 = sc.nextInt();
                geom2D = this.makeKite(input1, input2, input3, input4);
                break;
            case 3:
                System.out.println("Apakah ada sisi miringnya?");
                System.out.println("0. tidak ada");
                System.out.println("1. Ada");
                conditional = sc.nextInt();
                if(conditional == 0){
                    System.out.print("Panjang sisinya? ");
                    input1 = sc.nextInt();
                    System.out.print("Tingginya? ");
                    input2 = sc.nextInt();
                    geom2D = makeParallelogramWithoutItalic(input1, input2);
                } else {
                    System.out.print("Panjang sisinya? ");
                    input1 = sc.nextInt();
                    System.out.print("Tingginya? ");
                    input2 = sc.nextInt();
                    System.out.print("Sisinya? ");
                    input3 = sc.nextInt();
                    geom2D = makeParallelogramWithItalic(input1, input2, input3);
                }
                break;
            case 4:
                System.out.print("Panjangnya? ");
                input1 = sc.nextInt();
                System.out.print("Lebarnya? ");
                input2 = sc.nextInt();
                geom2D = makeRectangle(input1, input2);
                break;
            case 5:
                System.out.print("Sisinya? ");
                input1 = sc.nextInt();
                geom2D = makeSquare(input1);
                break;
            case 6:
                System.out.println("Apakah ada sisi miringnya?");
                System.out.println("0. tidak ada");
                System.out.println("1. Ada");
                conditional = sc.nextInt();
                if(conditional == 0){
                    System.out.print("Sisi Atas? ");
                    input1 = sc.nextInt();
                    System.out.print("Sisi Bawah? ");
                    input2 = sc.nextInt();
                    System.out.println("Tingginya? ");
                    input3 = sc.nextInt();
                    geom2D = makeTrapezoidWithoutItalic(input1, input2, input3);
                } else {
                    System.out.print("Sisi Atas? ");
                    input1 = sc.nextInt();
                    System.out.print("Sisi Bawah? ");
                    input2 = sc.nextInt();
                    System.out.print("Tingginya? ");
                    input3 = sc.nextInt();
                    System.out.print("Sisi miringnya? ");
                    input4 = sc.nextInt();
                    geom2D = makeTrapezoidWithItalic(input1, input2, input3, input4);
                }
                break;
            case 7:
                System.out.println("Apakah ada sisi miringnya?");
                System.out.println("0. tidak ada");
                System.out.println("1. Ada");
                conditional = sc.nextInt();
                if(conditional == 0){
                    System.out.print("Sisi Bawah? ");
                    input1 = sc.nextInt();
                    System.out.print("Tingginya? ");
                    input2 = sc.nextInt();
                    geom2D = makeTriangleWithoutItalic(input1, input2);
                } else {
                    System.out.print("Sisi Bawah? ");
                    input1 = sc.nextInt();
                    System.out.print("Tingginya? ");
                    input2 = sc.nextInt();
                    System.out.print("Sisi miringnya? ");
                    input3 = sc.nextInt();
                    geom2D = makeTriangleWithItalic(input1, input2, input3);
                }
                break;
        }
        return geom2D;
    }
    public Geom2D makeCircle(int radius){
        return new Circle(radius);
    }

    public Geom2D makeKite(double longDiagonal, double shortDiagonal, double topSide, double bottomSide){
        return new Kite(longDiagonal, shortDiagonal, topSide, bottomSide);
    }

    public Geom2D makeParallelogramWithItalic(double Height, double Italic, double Side){
        return new Parallelogram(Height, Italic, Side);
    }

    public Geom2D makeParallelogramWithoutItalic(double Height, double Side){
        return new Parallelogram(Height, Side);
    }

    public Geom2D makeRectangle(int length, int wide){
        return new Rectangle(length, wide);
    }

    public Geom2D makeSquare(int side){
        return new Square(side);
    }

    public Geom2D makeTrapezoidWithItalic(double bottom, double top, double height, double italic){
        return new Trapezoid(bottom, top, height, italic);
    }

    public Geom2D makeTrapezoidWithoutItalic(double bottom, double top, double height){
        return new Trapezoid(bottom, top, height);
    }

    public Geom2D makeTriangleWithItalic(double bottom, double height, double italic){
        return new Triangle(bottom, height, italic);
    }

    public Geom2D makeTriangleWithoutItalic(double bottom, double height){
        return new Triangle(bottom, height);
    }
}
