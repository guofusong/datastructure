package fun.guofusong.linetable;

public class MyArrayList<T> {
	
	private static int DEFAULT_CAPACITY_SIZE = 12;
	
	private int size;
	
	private Object[] items;
	
	public MyArrayList() {
		items = new Object[DEFAULT_CAPACITY_SIZE];
	}
	
	public MyArrayList(int CAPACITY_SIZE) {
		if(CAPACITY_SIZE < 0) 
			items = new Object[DEFAULT_CAPACITY_SIZE];
		else 
			items = new Object[CAPACITY_SIZE];
	}

	public int size() {
		return size;
	}
	
	public void add(T t) {
		if(size == items.length && size != 0) {
			Object[] templates = new Object[items.length * 2];
			for(int i = 0; i < size; i++) {
				templates[i] = items[i];
			}
			items = templates;
		}
		items[size] = t;
		size ++;
	}
	
	public void add(int index , T t) {
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		if(index == items.length && size != 0) {
			Object[] templates = new Object[items.length * 2];
			for(int i = 0; i < size; i++) {
				templates[i] = items[i];
			}
			items = templates;
		}
		if(size == 0) {
			items[0] = t;
		}else {
			if(index > size / 2) {
				for(int i = size; i >= index; i--) {
					if(i == index) {
						items[i] = t;
					}else {
						items[i] = items[i-1];
					}
				}
			}else {
				for(int i = size - 1; i >= 0; i--) {
					if(i == index) {
						items[i] = t;
					}else {
						items[i] = items[i-1];
					}
				}
			}
		}
		size ++;
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		return (T) items[index];
	}
	
	public void remove(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		for(int i = index ; i < size; i++) {
			items[i] = items[i+1];
		}
		size--;
	}
	
	public boolean contains(T t) {
		for(int i = 0; i < size; i++) {
			if(items[i].equals(t)) {
				return true;
			}
		}
		return false;
	}
	
}
