//3. Write a Java program to calculate the average of a list of numbers using a do-while loop
public class Average {
    public static void main(String[] args) {
        
        int[] n = {23,34,2,54,23,54};
    
        float sum = 0.0f;
        int size = n.length;
        int i=0;
        do{
            sum+= n[i];
            i++;
        }while(i<size);
        float average = sum/size;
        System.out.println(average);

        
    }

    
}
