package assignment3;

import java.util.List;

public interface Store {
	public String storeName();
	public List<String> findAll();
	public void addItem(String item);
	public void deleteItem(String item);
	public int countItem();
    
}
