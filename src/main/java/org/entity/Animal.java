import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Animal")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "birth")
    private Date birth;

    @Column(name = "couleur")
    private String couleur;

    // Getters and setters
}
