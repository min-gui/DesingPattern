package observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {
    private List<SubjectObserver> subjectObservers;
    private String message;

    public Topic() {
        this.subjectObservers = new ArrayList<>();
        this.message = "";
    }

    @Override
    public void register(SubjectObserver obj) {
        if (!subjectObservers.contains(obj)) subjectObservers.add(obj);
    }

    @Override
    public void removeRegister(SubjectObserver obj) {
        subjectObservers.remove(obj);

    }

    @Override
    public void notifyObservers() {
        this.subjectObservers.forEach(SubjectObserver::update);
    }

    @Override
    public Object getUpdate(SubjectObserver obj) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("보낸 메시지 : " + msg);
        this.message = msg;
        notifyObservers();
    }
}
