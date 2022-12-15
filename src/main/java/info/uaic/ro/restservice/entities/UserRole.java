package info.uaic.ro.restservice.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "user_role")
public class UserRole implements Serializable {
    @Id
    @Column(name = "user_name")
    private String username;

    @Column(name = "role_name")
    private String userRole;
}
