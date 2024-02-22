import javax.persistence.*;

@Entity
@Table(name = "Cat")
public class Cat extends Animal {
    @Column(name = "chipId")
    private String chipId;

    @ManyToOne
    @JoinColumn(name = "petStore_id")
    private PetStore petStore;

    // Getters and setters
}
