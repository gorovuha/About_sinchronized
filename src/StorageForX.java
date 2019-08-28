public class StorageForX {
    public int x = 0;

    public static void main(String[] args) throws InterruptedException {
        StorageForX storageForX = new StorageForX();
        System.out.println("x=" + storageForX.x);

        IncrementerThread thread1 = new IncrementerThread(storageForX);
        IncrementerThread thread2 = new IncrementerThread(storageForX);

        System.out.println("Start counting");

        thread1.start();
        System.out.println("Thread1 started...");

        thread2.start();
        System.out.println("Thread2 started...");

        thread1.join();
        thread2.join();
        System.out.println("Threads ended their work!");
        System.out.println("x=" + storageForX.x);
    }
}
