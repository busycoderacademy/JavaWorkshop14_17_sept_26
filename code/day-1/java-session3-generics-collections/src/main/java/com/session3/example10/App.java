package com.session3.example10;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Generic Class ===");
        MyObject<String> stringObject = new MyObject<>();
        stringObject.setMyObject("Java");
        System.out.println(stringObject.getMyObject());

        MyObject<Integer> integerObject = new MyObject<>();
        integerObject.setMyObject(22);
        System.out.println(integerObject.getMyObject());

        // stringObject.setMyObject(22); // Compile-time error.

        System.out.println();
        System.out.println("=== Generic Method ===");
        System.out.println("Max: " + GenericMethods.max(10, 50, 30));
        System.out.println("Max: " + GenericMethods.max("Java", "Spring", "AWS"));

        System.out.println();
        System.out.println("=== Generic Stack ===");
        GenericStack<String> stack = new GenericStack<>(5);
        stack.push("Java");
        stack.push("Spring");
        stack.push("AWS");
        System.out.println("pop(): " + stack.pop());
        System.out.println("pop(): " + stack.pop());

        System.out.println();
        System.out.println("=== Generic DAO ===");
        GenericDao<User, Long> userDao = new InMemoryGenericDao<>();

        userDao.save(new User(1L, "Amit", "Delhi"));
        userDao.save(new User(2L, "Vijay", "Mumbai"));
        userDao.save(new User(3L, "Karan", "Delhi"));

        System.out.println("findById(2): " + userDao.findById(2L));
        System.out.println("findByProperty(city, Delhi): "
                + userDao.findByProperty("city", "Delhi"));

        userDao.update(new User(2L, "Vijay Updated", "Pune"));
        System.out.println("After update: " + userDao.findById(2L));

        userDao.delete(1L);
        System.out.println("After delete(1): " + userDao.findById(1L));
    }
}
