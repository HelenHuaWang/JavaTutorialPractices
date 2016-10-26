/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopnt;

/**
 *
 * @author helen
 */
public class DemoRec {
    private DemoPnt myPnt;
    private int recA;
    private int recB; 
    
    public DemoRec(){
        myPnt = new DemoPnt();
        recA=0;
        recB=0;
    }
    
    public DemoRec(DemoPnt pnt, int x, int y){
        myPnt = pnt;
        recA =x;
        recB =y;
    }
}
