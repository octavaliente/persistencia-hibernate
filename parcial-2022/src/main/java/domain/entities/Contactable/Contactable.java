package domain.entities.Contactable;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class Contactable {

    @Id
    @GeneratedValue
    private Long id;

    public abstract String emailPreferido();
    public abstract String numeroPreferido();
}
