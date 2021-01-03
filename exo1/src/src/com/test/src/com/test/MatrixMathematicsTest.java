package src.com.test;


import src.com.exception.NoSquareException;
import src.com.model.Matrix;
import src.com.service.MatrixMathematics;

import java.util.Arrays;


import static org.junit.Assert.*;

public class MatrixMathematicsTest {
    //double[][] data= new double[2][2];

    //MatrixMathematics mat =new MatrixMathematics();
    @org.junit.Test
    public void determinant() throws NoSquareException {
        double[][] data = {
                {2, 1},
                {1, 1},
        };
        Matrix matrice= new Matrix(data);
        assertEquals(1, MatrixMathematics.determinant(matrice),0);


    }

    @org.junit.Test
    public void determinant1() throws NoSquareException {
        Matrix matrice = new Matrix(3,2);
        boolean bol=false;
        try {
            double n = MatrixMathematics.determinant(matrice);
        }catch (NoSquareException ex){
            bol=true;
        }
        assertTrue(bol);
    }

    @org.junit.Test
    public void determinant2() throws NoSquareException {
        double[][] data = {
                {2, 1},
        };
        Matrix matrice= new Matrix(data);
        boolean bol=false;
        try {
            double n = MatrixMathematics.determinant(matrice);
        }catch (NoSquareException ex){
            bol=true;
        }
        assertTrue(bol);
    }

    @org.junit.Test
    public void determinant3() throws NoSquareException {
        double[][] data = {
                {1, 0,0},
                {1, 0,1},
                {1, 1,0},
        };
        Matrix matrice= new Matrix(data);
        assertEquals(-1, MatrixMathematics.determinant(matrice),0);
    }
}