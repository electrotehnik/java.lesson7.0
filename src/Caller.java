public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
    }
    public void run() {
        synchronized(target) {
            target.call(msg);
        }
    }
}
