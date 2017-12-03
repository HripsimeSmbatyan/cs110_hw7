import Animals.Puppy;
import Utils.Math;
import Utils.ArrayUtils;


public class Driver {
    public static void main(String[] args) {
        
        Puppy Joey = new Puppy("Joey");
        
        Puppy Chandler = new Puppy("Chandler");
        
        Puppy Ross = new Puppy("Ross");

        
System.out.println(Joey.getName());
        
System.out.println(Chandler.getName());
        
System.out.println(Ross.getName());


int[] arr = {9, 20, 3, 44, 88, 300};
		
		int[] Reverse = ArrayUtils.reverse(arr);
		
		System.out.println(ArrayUtils.stringifyArray(Reverse));


double Factorialize = 15.4;
        System.out.println(Math.factorial((int) Factorialize));
        System.out.println(Math.factorialLoop((int) Factorialize));
    }
}