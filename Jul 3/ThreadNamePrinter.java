
class HelloWorldPrinter extends Thread{
    @Override
    public void run(){
        System.out.println("current thread name :- "+ currentThread().getName());
    }
}

class NumberPrinter extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("thread name = "+currentThread().getName()+" , number = "+i);
        }
    }
}

class DemoThread extends Thread{

    int number;

    public DemoThread(int n){
        this.number=n;
    }
    @Override
    public void run(){
        System.out.println(" thread name = "+currentThread().getName()+" , number = "+this.number);
    }
}

public class ThreadNamePrinter {


    public static void main(String[] args) {
        
        // Thread currentThread = Thread.currentThread();
        // System.out.println("Current thread name: " + currentThread.getName());

        // HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        // helloWorldPrinter.start();

        // HelloWorldPrinter helloWorldPrinter2 = new HelloWorldPrinter();
        // helloWorldPrinter2.start();

        // NumberPrinter numberPrinter = new NumberPrinter();
        // numberPrinter.start();

        // NumberPrinter numberPrinter2 = new NumberPrinter();
        // numberPrinter2.start();


        for(int i=1;i<=100;i++){
            DemoThread thread = new DemoThread(i);
            thread.start();
        }
    }
}