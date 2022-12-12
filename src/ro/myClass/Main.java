package ro.myClass;

import ro.myClass.models.*;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Masina masina = new Masina("Cristian", "Audi", 2009, "benzina");
        Student student = new Student("Popescu", "Alex", 22, 8.40, 1);

//        int[] a  ;
//        String s   ;
//        Collection<Integer> c   ;
//        int i = Integer.parseInt(s);
//        a[i] = s.length();
//        double d = 10.0/i;
//        List<Integer>  ceva= (List<Integer>) c;


//        int x=10/0;


//        try{
//            int t=10/0;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        System.out.println("aici");
//    }

        try {
//
//         int c = 100 / 0; // arithmetic exception
//
//         Object t = student;
//         Masina x = (Masina) t; //ClassCastException
//
//         String text = null;
//         text.toString(); //NullPointerException


        } catch (ArithmeticException e) {
            e.printStackTrace();

        } catch (ClassCastException e) {

            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("intra orice ar fi");
        }




    }

}