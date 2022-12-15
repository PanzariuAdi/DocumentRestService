package info.uaic.ro.restservice.repositories;

import info.uaic.ro.restservice.entities.Document;

import javax.ejb.Stateless;

@Stateless
public class DocumentRepository extends DataRepository<Document> {
    public DocumentRepository() {
        super(Document.class);
    }
}
