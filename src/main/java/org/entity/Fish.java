import javax.persistence.*;

@Entity
@Table(name = "Fish")
public class Fish extends Animal {
    @Enumerated(EnumType.STRING)
    @Column(name = "livingEnv")
    private FishLivEnv livingEnv;

    @ManyToOne
    @JoinColumn(name = "petStore_id")
    private PetStore petStore;

    // Getter and setters
}
