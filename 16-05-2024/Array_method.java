public  class Array_method {
    public static void main(String[] args){
        String[] color={"red","blue","green","white","black"};
        System.out.println(color[3]);
        System.out.println(color.length);
        for(int i=0; i<color.length; i++){
            System.out.println(color[i]);
        }
        // Multidimension array
        String[][] a={{"a","d","p"},{"h","t","o"}};
        System.out.println(a[0][1]);
        System.out.println(a[1][2]);
        System.out.print(a[1][2]+a[0][1]);

    }
    
}