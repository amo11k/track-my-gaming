package amo11k.com.track_my_gaming.entity;



import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "APP_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    //  // Relación bidireccional (un usuario tiene muchos juegos completados)
    //  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    //  private List<CompletedGame> completedGames;

    // Getters y setters
}
