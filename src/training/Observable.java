package training;

public interface Observable {
	void training(Customers topicExercise);
	void notifyObservers();
	String getUpdate();
}
