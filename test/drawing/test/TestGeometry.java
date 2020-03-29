package drawing.test;

import drawing.model.Point;

public class TestGeometry {
    public static void main (String [] args) {
        Point p3 = new Point(5,6);
        Point p4 = new Point(10,20, true);

//      Ispisati na konzolu vrednosti svih promenljivih tačke p3
        System.out.println("Point p3: X=" + p3.getX() + " Y=" + p3.getY() + " selected=" + p3.isSelected());

//        Postaviti obeležje selected tačke na koju ukazuje referenca p3 na trenutnu
//        vrednost obeležja selected tačke na koju ukazuje referenca p4 .
        p3.setSelected(p4.isSelected());

//     Deklarisati referencu p5 tipa Point i dodeliti joj vrednost reference p3 .
        Point p5 = p3;

//      Tački na koju ukazuje referenca p3 postaviti koordinatu x na vrednost 9. Potom
//        ispisati na konzolu vrednost x tačke na koju ukazuje referenca p5 .
        p3.setX(9);
        System.out.println("Point p5: X=" + p5.getX());

//       Kreirati novi objekat klase Point i dodeliti ga referenci p6 . Prilikom poziva
//       konstruktora proslediti vrednosti koordinata x i y tačke na koju ukazuje referenca p3 .
        Point p6 = new Point(p3.getX(),p3.getY());
    }
}
