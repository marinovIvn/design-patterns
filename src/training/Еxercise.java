package training;

import java.util.ArrayList;
import java.util.List;

public class Еxercise implements Observable {

	private List<Customers> observers;
	private String topic;
	
	public Еxercise() {
		this.observers = new ArrayList<>();
	}

	public void setExercise(String newExercise) {
		this.topic = newExercise;
		this.notifyObservers();
	}
	
	@Override
	public void training(Customers topicExercise) {
		this.observers.add(topicExercise);
		topicExercise.setExercise(this);
	}


	@Override
	public void notifyObservers() {
		for(Customers observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.topic;
	}

}
