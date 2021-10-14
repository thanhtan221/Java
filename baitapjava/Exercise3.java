package mang;

public class Exercise3 {
    public static void main(String[] args) {
        int [] Array={1,2,3,4,5};
        int [] newArray = {11,12,13,14,15};
        int [] mergeArray=new int[Array.length+newArray.length];//khai bao mảng Array + mảng newArray lại
        int count = 0;
        for(int i = 0 ; i < Array.length ; i++) { // dùng vòng lặp for thêm phần tử vào mảng Array
            mergeArray[i]=Array[i];
            count++;

        }
        for (int j = 0 ; j < newArray.length;j++){ // dùng vòng lặp for thêm phần từ vào mảng newArray
            mergeArray[count++]=newArray[j];
        }
        for (int i = 0; i < mergeArray.length; i++){// tạo mảng Thứ 3  cho thêm phần từ Array và newArray vào mảng 3
            System.out.println(mergeArray[i] + "");
        }


    }
}
