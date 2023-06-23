package reactivecouchbase.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User {
    @Id
    @GeneratedValue
    private String id;
    private String firstName;
    private String lastName;
    private Role roles;
    private String email;
}
