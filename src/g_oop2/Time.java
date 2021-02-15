package g_oop2;

public class Time {
	AccessModifier am = new AccessModifier();
	
	private int hour;
	private int minute;
	private int second;
	
	public int getHour(){
		return hour;
	}
	public int getHMinuter(){
		return minute;
	}
	
	public void setMinute(int minute){
		this.minute = minute;
	}
	public int getSecond(){
		return second;
	}
	public void setSecond(int second){
		this.second =second;
	}
	
	
	
	
	
	String getTime(){
		return hour + ":" + minute + ":" + second;
	}
	
	void clock(){
		while(true){
			System.out.println(getTime());
			stop(1000);
			setSecond(second+1);
			
		}
	}
	
	
	void stop (int interval){
		try {
			Thread.sleep(interval);//예외처리 : ctrl +1
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
