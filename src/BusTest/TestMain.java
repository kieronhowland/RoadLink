/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusTest;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Test.Bus;
import Test.Line;
import Test.Route;
import Test.Schedule;
import Test.Stop;

/**
 *
 * @author Kieron
 */
public class TestMain {

  static EntityManagerFactory emf = Persistence.createEntityManagerFactory("RoadLinkPU");
  static EntityManager em = emf.createEntityManager();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        em.getTransaction().begin();
        
// STOPS   
        // Stop Instances        
        Stop stop1 = new Stop();
        Stop stop2 = new Stop();
        Stop stop3 = new Stop();
        Stop stop4 = new Stop();
        Stop stop5 = new Stop();
        Stop stop6 = new Stop();
        Stop stop7 = new Stop();
        Stop stop8 = new Stop();
        Stop stop9 = new Stop();
        Stop stop10 = new Stop();
        Stop stop11 = new Stop();
        Stop stop12 = new Stop();
        stop1.setStopCode("1a");
        stop2.setStopCode("1b");
        stop3.setStopCode("1c");
        stop4.setStopCode("1d");
        stop5.setStopCode("1e");
        stop6.setStopCode("1f");
        stop7.setStopCode("2a");
        stop8.setStopCode("2b");
        stop9.setStopCode("2c");
        stop10.setStopCode("2d");
        stop11.setStopCode("2e");
        stop12.setStopCode("2f");
        
        //store stops
        em.persist(stop1);
        em.persist(stop2);
        em.persist(stop3);
        em.persist(stop4);
        em.persist(stop5);
        em.persist(stop6);
        em.persist(stop7);
        em.persist(stop8);
        em.persist(stop9);
        em.persist(stop10);
        em.persist(stop11);
        em.persist(stop12);

        //create stop lists
        List<Stop> stopSeq1 = new ArrayList();
        stopSeq1.add(stop1);
        stopSeq1.add(stop2);
        stopSeq1.add(stop3);
        
        List<Stop> stopSeq2 = new ArrayList();
        stopSeq2.add(stop4);
        stopSeq2.add(stop5);
        stopSeq2.add(stop6);
        
        List<Stop> stopSeq3 = new ArrayList();
        stopSeq3.add(stop7);
        stopSeq3.add(stop8);
        stopSeq3.add(stop9);
        
        List<Stop> stopSeq4 = new ArrayList();
        stopSeq4.add(stop10);
        stopSeq4.add(stop11);
        stopSeq4.add(stop12);   
        
        
// ROUTES   
        // Route Instances
        Route route1 = new Route();
        route1.setRouteName("City - Cape Jarvis");
        route1.setStopCodes(stopSeq1);
        
        Route route2 = new Route();
        route2.setRouteName("Cape Jarvis - City");
        route2.setStopCodes(stopSeq2);
        
        Route route3 = new Route();
        route3.setRouteName("City - Kilkenny");
        route3.setStopCodes(stopSeq3);
        
        Route route4 = new Route();
        route4.setRouteName("Kilkenny - City");
        route4.setStopCodes(stopSeq4);        

//        
//        for (int i = 0; i < stopSeq1.size(); i++) {
//            List<Stop> list1 = route1.getStopSeq();
//            System.out.println(list1.get(i));
//        }
              
        //Store routes
        em.persist(route1);
        em.persist(route2);
        em.persist(route3);
        em.persist(route4);

        
        //create route lists
        List<Route> routeList1 = new ArrayList();
        routeList1.add(route1);
        routeList1.add(route2);
        
        List<Route> routeList2 = new ArrayList();
        routeList2.add(route3);
        routeList2.add(route4);

        
        
// BUSES    
        // Bus Instances        
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        Bus bus3 = new Bus();
        bus1.setBusId(1);
        bus2.setBusId(2);
        bus3.setBusId(3);
        
        // store buses
        em.persist(bus1);
        em.persist(bus2);
        em.persist(bus3);
        
        //create buses lists
        List<Bus> busList1 = new ArrayList();
        busList1.add(bus1);
        busList1.add(bus3);
        
        List<Bus> busList2 = new ArrayList();
        busList2.add(bus2);
        busList2.add(bus3);
        

        
// LINES
        // Line instances
        Line line1 = new Line();
        line1.setLineNum(1);
        line1.setRoutes(routeList1);
        line1.setBuses(busList1);
        
        Line line2 = new Line();
        line2.setLineNum(2);
        line2.setRoutes(routeList2);
        line2.setBuses(busList2);

        //Store lines
        em.persist(line1);
        em.persist(line2);
        
//        //create lines lists
//        List<Line> lineList1 = new ArrayList();
//        lineList1.add(line1);
//        
//        List<Line> lineList2 = new ArrayList();
//        lineList2.add(line2);
//
//        List<Line> lineList3 = new ArrayList();
//        lineList3.add(line1);
//        lineList3.add(line2);


        
// SCHEDULES
        // Schedule instances
        Schedule schedule1 = new Schedule();
        schedule1.setScheduleId(1);
        schedule1.setArrTime(12.45);
        schedule1.setBus(bus1);
        
        Schedule schedule2 = new Schedule();
        schedule2.setScheduleId(2);
        schedule2.setArrTime(23.15);
        schedule2.setBus(bus2);
        
        Schedule schedule3 = new Schedule();
        schedule3.setScheduleId(3);
        schedule3.setArrTime(23.15);
        schedule3.setBus(bus3);

        Schedule schedule4 = new Schedule();
        schedule4.setScheduleId(4);
        schedule4.setArrTime(12.45);
        schedule4.setBus(bus3);
        
        //Store schedules
        em.persist(schedule1);
        em.persist(schedule2);  
        em.persist(schedule3);
        em.persist(schedule4);
        
        
        // console output
        System.out.println(stop1.getStopCode());
        System.out.println(stop2.getStopCode());
        System.out.println(stop3.getStopCode());
        
        System.out.println(route1.getRouteName());
        System.out.println(route1.getStopCodes());
        
        System.out.println(line1.getLineNum());
        System.out.println(line2.getLineNum());
        
//        System.out.println(bus1.getBusId());
//        System.out.println(bus2.getBusId());
//        System.out.println(bus3.getBusId());
        
        
        //find bus id's
//        Bus b1 = em.find(Bus.class, bus1.getBusId());    
//        System.out.println(b1);
//        
//        Bus b2 = em.find(Bus.class, bus2.getBusId());    
//        System.out.println(b2);

        //find route names
        Route r1 = em.find(Route.class, route1.getRouteName());    
        System.out.println(r1);


        
        
        
        em.flush();
        
        //commit and close
        em.getTransaction().commit();
          
        em.close();
        emf.close();
    }    
}

