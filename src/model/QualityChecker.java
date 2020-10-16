package model;
public class QualityChecker implements Worker{
	
	private int stressLevel;
	
	
	
	public void work() {
		if (this.stressLevel >= 5) sleep();
		System.out.println("Checking a product");
	}
	
	public void increaseStress() {
		this.stressLevel++;
	}
	
	
	public int getStressLevel() {
		return stressLevel;
	}

	private void sleep(){
		System.out.println("Zzzzz");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stressLevel = 1;
	}
	

}
