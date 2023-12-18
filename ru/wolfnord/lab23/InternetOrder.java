package ru.wolfnord.lab23;

public class InternetOrder {

    private class ListNode {
        private Item item;
        private ListNode next;
        private ListNode previous;

        public ListNode(Item item) {
            this.item = item;
            this.next = null;
            this.previous = null;
        }
    }

    private ListNode head;
    private int size;

    public InternetOrder() {
        this.head = new ListNode(null);
        this.head.next = this.head;
        this.head.previous = this.head;
        this.size = 0;
    }

    public InternetOrder(Item[] items) {
        this();
        for (Item item : items)
            addPosition(item);
    }

    public boolean addPosition(Item item) {
        ListNode newNode = new ListNode(item);
        newNode.next = head;
        newNode.previous = head.previous;
        head.previous.next = newNode;
        head.previous = newNode;
        size++;
        return true;
    }

    public boolean removePositionByName(String name) {
        ListNode node = head.previous;
        while (node != head) {
            if (node.item.getName().equals(name)) {
                node.previous.next = node.next;
                node.next.previous = node.previous;
                size--;
                return true;
            }
            node = node.previous;
        }
        return false;
    }

    public int removeAllPositionsByName(String name) {
        int count = 0;
        ListNode node = head.previous;
        while (node != head) {
            if (node.item.getName().equals(name)) {
                node.previous.next = node.next;
                node.next.previous = node.previous;
                count++;
                size--;
            }
            node = node.previous;
        }
        return count;
    }

    public Item[] getPositions() {
        Item[] positions = new Item[size];
        ListNode node = head.next;
        int index = 0;
        while (node != head) {
            positions[index++] = node.item;
            node = node.next;
        }
        return positions;
    }
}
