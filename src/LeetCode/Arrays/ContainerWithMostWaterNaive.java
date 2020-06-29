package LeetCode.Arrays;

public class ContainerWithMostWaterNaive {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
            // int arr = [[1,8,6,2,5,4,8,3,7]]
            // if i = 1 and j = 7, smaller one is 1 * 8-1 = 8
            // if i = 8 and j = 7 then smaller is 7 so 7*7 = 49
            int left_pointer=0;
            int right_pointer=height.length-1;
            int area = 0;
            for(int i = 0;i<height.length; i++){
                if(height[left_pointer]<height[right_pointer]){

                    int sum = height[left_pointer] * (right_pointer-left_pointer);
                   // System.out.println(sum);

                    left_pointer++;
                   // System.out.println(left_pointer);
                    if(sum > area){
                      // System.out.println(area);
                        area = sum;
                    }
                } else if(height[left_pointer]>height[right_pointer]){

                    int sum = height[right_pointer] * (right_pointer-left_pointer);
                    //System.out.println(sum);
                    right_pointer--;
                    if(sum > area){
                        area = sum;
                    }
                }
            }
            return area;
        }
    }

