
package exam.task2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class streamAPIreader {
    public static void main(String[] args) {

        Gson gson=new Gson();

        TypeToken typeToken= TypeToken.getParameterized(List.class,Student.class);
        try {
            List<Student> students = gson.fromJson(Files.readString(Path.of("D:\\Personal development procces(PDP)\\Back_end\\untitled8\\students.json")), typeToken.getType());
            double avg=students.stream()
                    .mapToInt(student->student.getAge())
                    .average()
                    .orElse(0.0);
            System.out.println("Average : "+avg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
}}
