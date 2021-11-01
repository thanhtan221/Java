package Stack;

public class Stack<T> {
    int size;
    int top;
    char[] a = {1,2,3,4,5,6,7,8,9};

    //chức năng kiểm tra xem ngăn xếp có trống không
   public boolean isEmpty()
    {
        return (top < 0);
    }

    Stack(int n)
    {
        top = -1;
        size = n;
        a = new char[size];
    }

    //chức năng đẩy phần tử trong ngăn xếp
   public boolean push(char x)
    {
        if (top >= size)
        {
            System.out.println("Tràn ngăn xếp");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }

    //hàm để bật phần tử từ ngăn xếp
   public char pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            char x = a[top--];
            return x;
        }
    }
}


// Mã trình điều khiển
class Main
{
    //chức năng đảo ngược chuỗi
    public static void reverse(StringBuffer str)
    {
        // Tạo một ngăn xếp công suất
        // Tạo công suất xếp hạng
        int n = str.length();
        Stack obj = new Stack(n);

        // Đẩy tất cả các ký tự của chuỗi
        // xếp chồng lên nhau
        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));
    }

    //driver function 
    public static void main(String args[])
    {
        //create a new string 
        StringBuffer s= new StringBuffer("Vo Vong");
        //call reverse method 
        reverse(s);

        //print the reversed string 
        System.out.println("Chuỗi đảo ngược là " + s);
    }

}
