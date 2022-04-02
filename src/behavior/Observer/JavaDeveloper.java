package behavior.Observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloper implements Observed{
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addVacancie(String vacancie){
        vacancies.add(vacancie);
        notifyObservers();
    }

    public void removeVacancie(String vacancie){
        vacancies.remove(vacancie);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer v: subscribers){
            v.hendkeEvent(vacancies);
        }
    }
}
