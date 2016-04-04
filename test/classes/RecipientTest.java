package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author ChrisJDCorp
 */
public class RecipientTest {
    
    
    
    
    Recipient recep1,recep2;
    
    
    
    public RecipientTest() {
    }
    
    @Before
    public void initialiser()
    {
    
     Recipient recep1=new Recipient();
     Recipient recep2=new Recipient();
     
    recep1.setCapacite(100);
    recep2.setCapacite(100);
    recep1.setQuantite(90);
    recep2.setQuantite(20);
   
    
    }
    
    
    @Test
    public void testgetQuantite()
    {
    
    assertEquals(90,recep1.getQuantite());
    assertEquals(20,recep2.getQuantite());
        
        
    }
    @Test
    public void testgetCapacite()
    {
 
    assertEquals(100,recep1.getCapacite());
    assertEquals(100,recep2.getCapacite());     
    }  
    
    
      @Test
    public void testgetEspaceLibre()
    {
  
    assertEquals(10,recep1.getEspaceLibre());
    assertEquals(80,recep2.getEspaceLibre());     
        
    }  
    
       @Test
    public void testEstVide()
    {
       
    assertEquals(false,recep1.estVide());
    assertEquals(false,recep2.estVide());     
          
    }  
        @Test
    public void testEstPlein()
    {
    assertEquals(false,recep1.estPlein());
    assertEquals(false,recep2.estPlein());     
        
    }  
    
        @Test
    public void testViderDans()
    {
        
        recep1.viderDans(recep2);
    assertEquals(true,recep1.estVide());
    assertEquals(true,recep2.estPlein());     
        
    }  
        @Test
    public void testRemplir()
    {
      recep1.remplir(recep2);
      
    assertEquals(false,recep1.estVide());
    assertEquals(true,recep2.estPlein());  
    assertEquals(100,recep2.getQuantite());  
    assertEquals(10,recep1.getQuantite());  
    
        
    }  
       @Test
    public void testMettreUnDans()
    {
    recep1.mettreUnDans(recep2);
    
    assertEquals(89,recep1.getQuantite());
    assertEquals(21,recep2.getQuantite());   
    
        
    }  

   
}
