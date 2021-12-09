/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bandeau;

import java.util.List;

/**
 *
 * @author romai
 */
public class monThread extends Thread {
    Bandeau myB;
    List<ScenarioElement> myE;
    
  public monThread(List<ScenarioElement> myElements, Bandeau b){
      myB = b;
      
      myE = myElements;
  }
  @Override
  public void run() {
      synchronized(myB){
          for (ScenarioElement element : myE) {
            for (int repeats = 0; repeats < element.repeats; repeats++) {
                element.effect.playOn(myB);
            }
        }  
      }
      }
            
}
