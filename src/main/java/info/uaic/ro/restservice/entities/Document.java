package info.uaic.ro.restservice.entities;

import lombok.*;
import org.primefaces.model.file.UploadedFile;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "documents")
@NamedQueries({
        @NamedQuery(name = "Document.findAll", query = "SELECT d FROM Document d")
})
public class Document implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "registration_number")
    private Integer registrationNumber;

    @Column(name = "author")
    private String author;

    @Column(name = "document")
   private UploadedFile document;

    public Document(UploadedFile document) {
        this.document = document;
    }
}
