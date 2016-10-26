/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demogenerics;

/**
 *
 * @author helen
 * @param <K>
 * @param <V>
 */
public class DemoParamType<K, V> {
    private K myKey;
    private V myValue;
    
    public DemoParamType(K theK, V theV){
        myKey = (K) theK; 
        myValue=(V) theV;
    }
    public K getKey(){
        return myKey;
    }
    public V getValue(){
        return myValue;
    }
    public void setKey(K theK){
        myKey = theK;
    }
    public void setValue(V value){
        myValue = value;
    }

    /**
     * @param demo
     * @return
     */
    public boolean equals(DemoParamType<K,V> demo){
        return (demo.myKey==this.myKey)&&(demo.myValue==this.myValue);
    }
    //bounded type demo //tried either instance and static method
    public static <U extends Number>  void inspect(U theU){
        System.out.println(theU.getClass().getName());
    }
            
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        //testing type inference
        DemoParamType<Integer, String> one = new DemoParamType(1, "one");
        DemoParamType<String, String> two= new DemoParamType("one", "one");
        DemoParamType<String, String> three= new DemoParamType("three", "one");

        System.out.println(one.equals(two));
        System.out.println(DemoParamTypeStaticMethod.toCompare(one, two));
        
        //testing bounded type
        Integer in=10;
        DemoParamType.<Integer>inspect(10); 
        inspect(10);
        //one.inspect(in);
    }
}
