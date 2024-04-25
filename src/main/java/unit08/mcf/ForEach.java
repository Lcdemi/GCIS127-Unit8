package unit08.mcf;

public class ForEach {
    public static void forArray(String[] array) {
        for(String element : array) {
            System.out.println(element);
        }
    }

    public static void forList(List<String> list) {
        for(String element : list) {
            System.out.println(element);
        }
    }

    public static void forQueue(Queue<String> queue) {
        for(String element : queue) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] strings = {"abc", "def", "ghi"};
        forArray(strings);

        List<String> list = new ArrayList<>();
        list.append("zzz");
        list.append("xxx");
        list.append("qqq");
        forList(list);

        Queue<String> queue = new NodeQueue<>();
        queue.enqueue("dog");
        queue.enqueue("cat");
        queue.enqueue("bird");
        forQueue(queue);
    }
}
