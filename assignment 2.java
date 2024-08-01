import java.util.ArrayList;

class CustomStack {
    private int size;
    private ArrayList<Integer> arr;

    public CustomStack(int maxSize) {
        size = maxSize;
        arr = new ArrayList<>();
    }

    public void push(int x) {
        if (arr.size() < size) {
            arr.add(x);
        }
    }

    public int pop() {
        if (arr.isEmpty()) {
            return -1;
        } else {
            return arr.remove(arr.size() - 1);
        }
    }

    public void increment(int k, int val) {
        int x = Math.min(k, arr.size());
        for (int i = 0; i < x; i++) {
            arr.set(i, arr.get(i) + val);
        }
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(3);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop()); // prints 2
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.increment(5, 100);
        stack.increment(2, 100);
        System.out.println(stack.pop()); // prints 103
        System.out.println(stack.pop()); // prints 202
        System.out.println(stack.pop()); // prints 201
        System.out.println(stack.pop()); // prints -1
    }
}

