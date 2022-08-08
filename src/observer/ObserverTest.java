package observer;

public class ObserverTest {
    public static void main(String[] args) {
        Topic topic = new Topic();
        SubjectObserver a = new TopicSubscriber("a", topic);
        SubjectObserver b = new TopicSubscriber("b", topic);
        SubjectObserver c = new TopicSubscriber("c", topic);

        topic.register(a);
        topic.register(b);
        topic.register(c);

        topic.postMessage("hi");
    }
}
