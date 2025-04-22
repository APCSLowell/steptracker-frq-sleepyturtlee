import java.util.ArrayList;
public class StepTracker
{
 private int stepsActive;
 private ArrayList<Integer> steps;
 public StepTracker(int uStepsActive) {
  stepsActive = uStepsActive;
  steps = new ArrayList<Integer>();
 }

 // remember return type is void
 public void addDailySteps(int daySteps) {
  steps.add(daySteps);
 }
 public int activeDays() {
  int count = 0;
  for(int i = 0; i < steps.size(); i++) {
   if(steps.get(i) >= stepsActive) {
    count++;
   }
  }
  return count;
 }
 
 // address zero case
 public double averageSteps() {
  if(steps.size() == 0) {
   return 0;
  }
  double avgSteps = 0;
  for(int i = 0; i < steps.size(); i++) {
   avgSteps += steps.get(i);
  }
  return avgSteps / steps.size();
 }
} 
