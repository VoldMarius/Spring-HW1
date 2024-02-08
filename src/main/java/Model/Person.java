package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person implements Externalizable {
    private String firstName;
    private String lastName;
    private int age;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getFirstName());
        out.writeObject(this.getLastName());
        out.writeInt(this.getAge());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        firstName = (String) in.readObject();
        lastName = (String) in.readObject();
        age = in.readInt();
    }
}