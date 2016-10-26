/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogenerics;

/**
 *
 * @author helen
 */
public class DemoParamTypeStaticMethod {
    public static <K,L,V> boolean toCompare(DemoParamType<K,V> one, DemoParamType<L,V> two){
        return (one.getKey()==two.getKey())&&(one.getValue()==two.getValue());
    }
}
