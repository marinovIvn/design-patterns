package training;

public class ExerciseCustomers implements Customers {

	private String name;
	private Observable exercise;
	
	public ExerciseCustomers(String name) {
		this.setName(name);
	}

	@Override
	public void update() {
		if(this.exercise == null) {
			System.out.println(this.getName() + " в момента може да почива");
			return;
		}
		String updatedExercise = this.exercise.getUpdate();
		System.out.println(this.getName() + " -- ново упражнение: " + updatedExercise);
	}

	@Override
	public void setExercise(Observable exercise) {
		this.exercise = exercise;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
