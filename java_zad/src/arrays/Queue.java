package arrays;

public class Queue<T> {
	
	Stack<T> s1 = new Stack<T>();
	Stack<T> s2 = new Stack<T>();
	
	public void put(T t) {
		if (s1.isEmpty() && s2.isEmpty()) {
			s1.push(t);
		}
		else {
			s2.push(t);
		}
	}
	
	public T get() {
		if (s1.isEmpty() && s2.isEmpty()) {
			return null;
		}
		if (s1.isEmpty()) {
			while (!s2.isEmpty()) {
				s1.push(s2.pop());
			}
			return s1.pop();
		}
		else {
			return s1.pop();
		}
	}
	
	
}
