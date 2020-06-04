package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException(key + " not found in String[] value.");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[] {"test1", "test2", "test3"}, "hello");
        } catch (ElementNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
