//package main.repository;
//
//import main.model.Person;
//import java.util.List;
//
//public class PersonRepo implements InMemoryRepo<Person> {
//
//    List<Person> personList;
//
//    public PersonRepo(List<Person> personList) {
//        this.personList = personList;
//    }
//
//    //    @Override
//    public void add(Person b){
//        personList.add(b);
//    }
//
//    //    @Override
//    public Person getById(String id) {
//        for (Person person : personList) {
//            if (person.getCnp() == id) {
//                return person;
//            }
//        }
//        return null;
//    }
//
//    public void delete(String id) {
//        for (Person person : personList) {
//            if (person.getCnp() == id) {
//                personList.remove(person);
//            }
//        }
//
//    }
//
//    public List<Person> getAll() {
//        return personList;
//    }
//}
