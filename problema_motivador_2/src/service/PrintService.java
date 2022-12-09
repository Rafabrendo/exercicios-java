package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	private List<T> list = new ArrayList<>();

	public List<T> getList() {
		return list;
	}
	
	public void addList(T value) {
		list.add(value);
	}
	
	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int lastElement = list.size() - 1;
		sb.append("[");
		for(T value: list) {
			sb.append(value);
			if(value != list.get(lastElement)) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
