package ru.wolfnord.lab4.task2;

public class Head {
    private String hairColor;
    private String eyesColor;

    public Head(String hairColor, String eyesColor) {
        this.hairColor = hairColor;
        this.eyesColor = eyesColor;
    }

    public String getEyeColor() {
        return eyesColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setNumberOfEyes(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    @Override
    public String toString() {
        return "Head {" +
                "hairColor='" + hairColor + '\'' +
                ", eyesColor='" + eyesColor + '\'' +
                '}';
    }
}
