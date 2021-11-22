package net.intelie.challenge;

import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class ListNode {
    public final int value;
    public @Nullable ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return limitedToString(10);
    }

    private String limitedToString(int maxSize) {
        ListNode current = this;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxSize && current != null; i++) {
            if (i != 0) {
                sb.append("->");
            }
            sb.append(current.value);
            current = current.next;
            if (i == maxSize - 1 && current != null) {
                sb.append("...");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return value == listNode.value && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }
}
