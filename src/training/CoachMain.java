package training;

public class CoachMain {

	public static void main(String[] args) {

		Еxercise topic = new Еxercise();
		Customers urs1 = new ExerciseCustomers("Георги Димов");
		Customers urs2 = new ExerciseCustomers("Маряна Попова");
		Customers urs3 = new ExerciseCustomers("Спас Гърневски");
		
		topic.training(urs1);
		topic.training(urs2);
		topic.training(urs3);
		
		topic.setExercise("30бр. лицеви опори");
		
		topic.setExercise("Коремни преси до припадък");

	}

}
