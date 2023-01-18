package AnujBhaiyaDSA;

public class Video_16_TrappingRainWater {
    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        //if we focus on values ,we find that at height[i], the answer will be
        // (minimum value of max value of left side and max value of right side)- heigth[i];
        // for this we use another spaces to create two array
        // one array contains left side max value for hight[i]
        // 2nd array contains right side max value for hight[i]


        //left
        int maxLeftSoFar = 0;
        int[] maxLeft = new int[height.length];
        maxLeft[0]=height[0];
        for (int i=1; i<maxLeft.length; i++){
            maxLeft[i]=Math.max(height[i-1],maxLeftSoFar);
            maxLeftSoFar= Math.max(maxLeft[i],maxLeftSoFar);
        }
        // System.out.println(Arrays.toString(maxLeft));

        //right
        int maxRightSoFar = 0;
        int[] maxRight = new int[height.length];
        maxRight[maxRight.length-1]=height[height.length-1];
        for (int i=maxRight.length-2; i>=0; i--){
            maxRight[i] = Math.max(height[i+1],maxRightSoFar);
            maxRightSoFar=Math.max(maxRight[i],maxRightSoFar);
        }
        // System.out.println(Arrays.toString(maxRight));

        // now take minimum of left max and right max - arr[i]
        int maxValue = 0;
        for (int i=0; i<height.length; i++){
            int temp = Math.min(maxLeft[i],maxRight[i])-height[i];
            if (temp<0){
                maxValue += 0;
            }else{
                maxValue += temp;
            }
        }

        //final output
        // System.out.println(maxValue);

        System.out.println(maxValue);

    }
}
