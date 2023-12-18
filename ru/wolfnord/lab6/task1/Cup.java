package ru.wolfnord.lab6.task1;

class Cup extends Dish {
    private boolean hasHandle;

    public Cup(String material, int capacity, boolean hasHandle) {
        super(material, capacity);
        this.hasHandle = hasHandle;
    }

    @Override
    public void use() {
        System.out.println("Использование кружки...");
    }

    public boolean hasHandle() {
        return hasHandle;
    }
}

