// package exceptions;

// public class PropagationException {
//     void m(){
//         int j=9/0;
//     }
//     void n(){
//         m();
//     }
//     void p(){
//         try{
//             n();
//         }catch(Exception e){
//             System.out.println(e);
//         }
//     }

//     public static void main(String[] args) {
//         System.out.println("main method");
//         PropagationException obj = new PropagationException();
//         obj.p();
//         System.out.println("normal flow....");
//     }
// }
