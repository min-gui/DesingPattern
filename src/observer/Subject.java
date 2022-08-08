package observer;

import java.util.Observer;

interface Subject {
    public void register(SubjectObserver obj);
    public void removeRegister(SubjectObserver obj);
    public void notifyObservers();
    public Object getUpdate(SubjectObserver obj);

}
