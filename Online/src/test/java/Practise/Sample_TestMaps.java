package Practise;

import java.util.HashMap;
import java.util.Map;
public class Sample_TestMaps{
  public static void main(String[] args){
    Map<String, String> objMap = new HashMap<String, String>();
    objMap.put("Name", "Suzuki");
    objMap.put("Power", "220");
    objMap.put("Type", "2-wheeler");
    objMap.put("Price", "85000");
    //System.out.println("Elements of the Map:");
    //System.out.println(objMap);
   // System.out.println(objMap.keySet());
    //System.out.println(objMap.keySet());
    // Latest Changes done from GIT Repository by DILEEP from Chrome Browser 
    //-Same query updated by Dileep from Eclipse IDE back to GIT Repository
    //New Changes done by User2-Pushkal Machine 
objMap.remove("Price");

System.out.println(objMap);

    
    
    


    
  
  }
}
