import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// class NewThread implements Runnable{
//     ArrayList<Integer> arr;
//     int num;

//     public NewThread(ArrayList<Integer> arr , int n){
//         this.arr=arr;
//         this.num=n;
//     }

//     @Override
//     public void run(){
//         this.arr.add(2*this.num);
//     }
// }


class DoubleListOfNumbers implements Runnable{
    ArrayList<Integer> ans;
    ArrayList<Integer> arr;
    public DoubleListOfNumbers(ArrayList<Integer> arr){
        this.arr=arr;
        this.ans = new ArrayList<>();
    }

    @Override
    public void run(){
        for(int i=0;i<this.arr.size();i++){
            ans.add(2*this.arr.get(i));
        }  
    }

    
}
public class doubleNumber {

    // public static ArrayList<Integer> doubleNumbers(ArrayList<Integer> arr){
        
    //     ArrayList<Integer> ans = new ArrayList<>();

    //     ExecutorService es = Executors.newFixedThreadPool(2);
    //     for(int i=0;i<arr.size();i++){
    //         es.submit(new NewThread(ans, arr.get(i)));
    //     }

    //     return ans;
    // }



    public static void print(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        DoubleListOfNumbers d = new DoubleListOfNumbers(numbers);
        Thread newThread = new Thread(d);
        newThread.start();
        Thread.sleep(1);
        ArrayList<Integer> ans = d.ans;
        print(ans);
    }
}
