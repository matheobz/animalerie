import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "street")
    private String street;

    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "city")
    private String city;

    @OneToMany(mappedBy = "address")
    private List<PetStore> petStores;

    // Getter and setters
}
