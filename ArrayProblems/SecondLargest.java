public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5,20,12,20,8};
        int n = arr.length;
        int res = -1;
        int largest = 0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[largest]){
                res = largest;
                largest = i;
            }else if(arr[i]!=arr[largest]){
                if(res==-1 || arr[i]>arr[res]){
                    res = i;
                }
            }
        }
        System.out.println(arr[res]);
    }
}
