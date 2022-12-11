package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <T extends Transport> {

    private Queue<T> queue = new LinkedList<>();

    public void addTransport(T transport) {
        queue.offer(transport);
    }
    public void makeService() {
        T transport = queue.poll();
        if (transport != null) {
            System.out.println("Проведено техническое облуживание: " + transport);
            makeService();
        } else {
            System.out.println("Автомобили для техобслуживания отсутсвуют");
        }
    }

    public int queueSize() {
        return queue.size();
    }
}
