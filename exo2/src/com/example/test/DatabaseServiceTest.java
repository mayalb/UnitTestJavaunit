package com.example.test;

import static org.junit.Assert.*;
import com.example.model.*;
import com.example.service.*;
import com.example.service.DatabaseConnection;
import com.example.service.DatabaseService;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;



import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseServiceTest<connect> {
    static DatabaseConnection db =new DatabaseConnection( "sa","","org.h2.Driver","jdbc:h2:mem:test");
    static Connection con;
    City city ;

    static DatabaseService dataserv = new DatabaseService();


    @Before
    public  void  beforeclass() {

        con= db.connect();
        db.createDb(con);

    }

    @org.junit.Test
    public void addCity() {
        City city = new City(1,"tizi",20,"thamourthiw");

        assertEquals(1,dataserv.addCity(con,city));
    }
    @org.junit.Test
    public void addCity1() {
        boolean bol=false;
        db.disconnect(con);
        City city = new City(1,"tizi",20,"thamourthiw");
        try {

            assertEquals(-1,dataserv.addCity(con,city));
        }catch (Exception ex){

            bol=true;
        }

    }


    @org.junit.Test
    public void getCity() {
        City city1 = new City(1,"tizi",20,"thamourthiw");
        dataserv.addCity(con,city1);
        assertEquals(city1.getIdCity(),dataserv.getCity(con,1).getIdCity());
    }

    @org.junit.Test
    public void getCity1() {
        boolean bol=false;
        City city1 = new City(1,"tizi",20,"thamourthiw");
        dataserv.addCity(con,city1);
        db.disconnect(con);
        try {

            assertEquals(0,dataserv.getCity(con,1).getIdCity());
        }catch (Exception ex){

            bol=true;
        }

    }



    @After
    public  void logout() {
        db.disconnect(con);
    }


}