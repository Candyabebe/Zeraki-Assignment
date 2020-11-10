

public class Solution3 {
    //Question 3

     static int numberOfSteps(int distance, int spacing) {
        int steps = distance / spacing;
        if ((distance % spacing) > 0) {
            steps += 1;
        }
        return steps;

    }

    public  static void main(String[] args) {
        try {
        int distance=0;
        int space= 0;
        int step=0;
        if(args.length>1){
            distance=Integer.parseInt(args[0]);
            space=Integer.parseInt(args[1]);
             step=numberOfSteps(distance,space);
        }
            System.out.println("The number of steps are : "+step);

        } catch (Exception e) {
            System.out.println("Wong Argument.");
        }
    }
}
