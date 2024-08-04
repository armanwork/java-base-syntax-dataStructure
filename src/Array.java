public class Array {
     private int[] Array;
     private int count;
     public Array(int index){
          Array = new int[index];
     }
     public void print (){
          for(int i = 0; i <count; i++){
               System.out.println(Array[i]);
          }
     }
     public void Insert(int item){
          // if space not exist create new array with twice the size
          if(Array.length == count){
               int[]newarr= new int[count * 2];

//          copy from old array
               for(int i = 0 ; i < count; i++){
                    newarr[i]=Array[i];

               }
// if space is exist add item
          // set items in new array
               Array=newarr;
          }
          Array[count++]=item;
     }

     public void removeAt(int index){
          if(index <0 || index>=count){

               throw new IllegalArgumentException();
          }
          for(int i = index; i < count; i++){
               Array[i]=Array[i+1];

          }
          count--;
     }


}
