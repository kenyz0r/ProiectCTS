package dam.project.movieproj.data;

public class NavigationDrawerItem {

	private String title;
	private int icon;
	private String count="0";
	private boolean isCounterVisible = false;
	
	public NavigationDrawerItem(){
		
	}
	public NavigationDrawerItem(String title, int icon){
		this.title=title;
		this.icon=icon;
	}
	public NavigationDrawerItem(String title,int icon,boolean isCounterVisible,String count)
	{
		this.title=title;
		this.icon=icon;
		this.isCounterVisible=isCounterVisible;
		this.count=count;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getIcon() {
		return icon;
	}
	public void setIcon(int icon) {
		this.icon = icon;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public boolean isCounterVisible() {
		return isCounterVisible;
	}
	public void setCounterVisible(boolean isCounterVisible) {
		this.isCounterVisible = isCounterVisible;
	}
	
	
}
