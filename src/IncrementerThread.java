public class IncrementerThread extends Thread{

    private StorageForX storage;

    public IncrementerThread(StorageForX storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized(storage){
                //System.out.println("Текущий поток захватил власть над объектом objectLock...");
                //System.out.println("И не отдаст этот ресурс никакому другому потоку пока не дойдет до закрывающей фигурной скобки.");
                //System.out.println("Если другой поток попытается захватить власть над этим же объетом, то он встанет в очередь ожидающих этот ресурс.");
                storage.x += 1;
                //System.out.println("И вот наконец мы сделали без вмешательства других потоков свои дела - увеличили переменную на 1, и можем отдать ресурс.");
                //System.out.println("Как только мы дойдем до закрывающей фигурной скобки (до конца критической секции) в следующей строке - ресурс вновь будет свободен.");
            }
        }
    }
}
