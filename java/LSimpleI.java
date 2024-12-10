// public class LSimpleI {
//     private NodoI p;
//     public LSimpleI(){
//         p=null;
//     }
//     public NodoI getP() {
//         return p;
//     }
//     public void setP(NodoI p) {
//         this.p = p;
//     }
//     public void adicionar(Inversor x){
//         NodoI q=new NodoI();
//         q.setInversor(x);
//         if(p==null){
//             p=q;
//         }else{
//             NodoI t=p;
//             while(t.getSig()!=null){
//                 t=t.getSig();
//             }
//             t.setSig(q);
//         }
//     }
//     public void mostrar(){
//         NodoI t=getP();
//         while(t!=null){
//             t.getInversor().mostrar();
//             t=t.getSig();
//         }
//     }    
// }
