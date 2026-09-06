package GerericInterface;

public interface ThreeVarGI<T,F,R> {
    R takevar(T t,F f);
    // T=1st parameter F=2nd parameter r=return type
    public static void main(String[] args) {
        //internally made String takevar(Interger,String)
//       ThreeVarGI<Integer,String,String> t1=(i,j)->{
//        return "kedar";
//       };
//       String love=t1.takevar(23,"mk");

        ThreeVarGI<int[],int[],Integer> t1=(i,j)->{
            System.out.println(i[0]);
            return 900;
        };
        int x=t1.takevar(new int[] {12,35,87},null);
        System.out.println(x);

    }
}
