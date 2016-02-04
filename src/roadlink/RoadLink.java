/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadlink;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Kieron
 */
public class RoadLink {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = null;
        EntityManager em = null;
        //ModuleERDiagramPU
        try{
            emf = Persistence.createEntityManagerFactory("RoadLinkPU");
            em = emf.createEntityManager();
            System.out.println("Entity Manager Created: " + emf);
        }catch(Exception e){
            Logger.getLogger(RoadLink.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            if(em != null){
                em.clear();
            }
//            if(em != null){
//                em.close();
//            }
//            if(emf != null){
//                emf.close();
//            }
        }
    }
}
