public class ArrayUt{
    public void printArray(int[] arr){
        int n=arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int [] myArray=new int[5];
        myArray[0]=21;
        myArray[1]=23;
        myArray[2]=25;
        myArray[3]=27;
        myArray[4]=29;
        printArray(myArray);
        System.out.println((myArray.length));
        System.out.println(myArray[myArray.length-1]);
    }
    public static void main(String[] args) {
        ArrayUtil arraUtil=new ArrayUtil();
        arrayUtil.arrayDemo();
    }
}