import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PetStore")
public class PetStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "managerName")
    private String managerName;

    @OneToMany(mappedBy = "petStore")
    private List<Animal> animals;

    // Getters and setters
}
