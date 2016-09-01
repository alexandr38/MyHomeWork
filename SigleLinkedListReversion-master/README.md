Дано интерфейс А у которого 2 метода:
    void setNext(A<T> next);
    A<T> getNext();

На основе этого интерфейса, с помощью метода ListUtils.createStringList() построен односвязный список заполненый буквами
        A -> B -> C -> D -> E -> F -> G

Ваша задача реализовать метод public static<T> A<T> reversion(A<T> node), который будет принимать ссылку
 на первый узел односвязного списка и на выходе возвращал ссылку на первый елемент этого же списка, но после трансформации
 ( метод должен развернуть список, т.е, чтобы его крайний элемент стал первым, предпоследний вторым,
  и т.д, и в конце концов, первый элемент стал бы крайним элементом.)

  и в конечном итоге ваш список должен стать G -> F -> E -> D -> C -> B -> A

  Условием выполнения задачи будет прохождения теста в классе /src/test/java/ua/com/artcode/TestReversion.java
  
 
  Implement own ArrayList
  Implement own LinkedList
  Implement own BinarySearchTree
  Implement own HashMap

http://faculty.washington.edu/moishe/javademos/ch06%20Code/
http://info.javarush.ru/translation/2014/04/27/%D0%9A%D0%B0%D0%BA-HashMap-%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%B0%D0%B5%D1%82-%D0%B2-Java-.html


// http://javatalks.ru/topics/45327?page=1#232369
// http://javist.ru/svyazannyj-spisok-realizacii-v-java/
// http://www.sql.ru/forum/710113/realizaciya-iterator
// https://habrahabr.ru/post/127864/