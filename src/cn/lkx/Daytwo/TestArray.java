package cn.lkx.Daytwo;

public class TestArray {
    public static void main(String[] args) {
        int[] a=new int[4];
        for(int i=0;i<a.length;i++){
            a[i]=100*i;

        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("##########");
        //foreach循环 专门用来读取数组或集合所有的元素 即对数组进行遍历
        //循环遍历数组 把元素取出来放到m中打印出来
        for(int m:a){
            System.out.println(m);
        }
        String[] ss={
                "aaaa","bbb","ccc"
        };
        for(String e:ss){
            System.out.println(e);
        }

    }



}
