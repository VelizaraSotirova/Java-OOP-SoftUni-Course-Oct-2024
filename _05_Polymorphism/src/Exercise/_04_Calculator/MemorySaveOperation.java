package Exercise._04_Calculator;

import java.util.ArrayDeque;
import java.util.Deque;

public class MemorySaveOperation implements Operation {

    private Deque<Integer> memory;

    public MemorySaveOperation() {
        this.memory = new ArrayDeque<>();
    }

    @Override
    public void addOperand(int operand) {
        memory.push(operand);
    }

    @Override
    public int getResult() {
        return memory.pop();
    }

    @Override
    public boolean isCompleted() {
        return false;
    }
}