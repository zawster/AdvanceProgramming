import java.util.Arrays;
public class Assignment_1 {
	public static void sort_array(int[] array)
	{
		Arrays.sort(array);   
        System.out.println("Elements of array sorted in ascending order: ");  
        //prints array using the for loop  
        for (int i = 0; i < array.length; i++)   
        {       
            System.out.println(array[i]);
        }
	}
	public static void main(String[] args) {
        int [] array = new int[]{90, 23, 5, 109, 12, 22, 67, 34};  
		sort_array(array);
	}
}
