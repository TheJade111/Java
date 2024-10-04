class newThread extends Thread{
    public static void main(String[] args) {
        newThread thread=new newThread();
        thread.start();
    }
    public void run(){
        System.out.println("thread executed");
    }
}