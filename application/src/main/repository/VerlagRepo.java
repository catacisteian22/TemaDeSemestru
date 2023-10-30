package main.repository;

import main.model.Verlag;

import java.util.List;

public class VerlagRepo {
    List<Verlag> verlagList;

    public VerlagRepo(List<Verlag> verlagList) {

        this.verlagList = verlagList;
    }

//    @Override
    public void add(Verlag b){
        verlagList.add(b);
    }

    //    @Override
    public Verlag getById(String email) {
        for (Verlag Verlag : verlagList) {
            if (Verlag.getEmail() == email) {
                return Verlag;
            }
        }
        return null;
    }

    public void delete(String email) {
        for (Verlag Verlag : verlagList) {
            if (Verlag.getEmail() == email) {
                verlagList.remove(Verlag);
            }
        }

    }

    public Verlag update(String email, Verlag newVerlag) {
        for (int i = 0; i < verlagList.size(); i++) {
            Verlag Verlag = verlagList.get(i);
            if (Verlag.getEmail().equals(email)) {
                verlagList.set(i, newVerlag);
                return newVerlag;
            }
        }
        return null;
    }

    public List<Verlag> getAll() {
        return verlagList;
    }
}
