package scope;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //ghi đè, chỉ giống nhau ms ghi đè, còn đã khác mà ghi đề thì lỗi
//    @Override
    public boolean equals(Dog dog) {
        if(this.age == dog.age && this.name.equals(dog.name))// nếu dùng == ở name thì sẽ có trg hợp sai
        return true;
        return false;
    }
}
