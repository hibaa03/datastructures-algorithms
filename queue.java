/* import java.util.Queue;

class QueueUsingArray {
    int front_Q, rear_Q;
    int capacityofQueue;
    static int[] q1;

    QueueUsingArray(int size) {
        capacityofQueue = size;
        q1 = new int[capacityofQueue];

    }
}
void enqueue(int value) {
    if (rear_Q == capacityofQueue) {
        System.out.println("queue is full");
    }
    else {
        q1[rear_Q] = value;
        rear_Q++;
        System.out.println();
    }
}

void dequeue() {
    if (rear_Q == 0) {
        System.out.println("queue empty");
}
    else {
        for (int i = 0; i < rear_Q - 1; rear_Q++) {
            q1[i] = q1[i + 1];
        }
        rear_Q--;
}

void display() {
        if (rear_Q == 0) {
            System.out.println("empty");
        }
        else {
            for (int i = 0; i < rear_Q; i++) {
                System.out.print(q1[i]);
            }
        }
    }
}

    public class queue {
        public static void main(String[] args) {
            QueueUsingArray q2 = new QueueUsingArray(5);
            q2.enqueue(2);
            q2.enqueue(4);
            q2.display();
        }
    }
}
*/