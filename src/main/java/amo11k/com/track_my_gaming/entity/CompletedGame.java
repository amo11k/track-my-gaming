package amo11k.com.track_my_gaming.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class CompletedGame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @ManyToOne
    // @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    // private User user;

    @Column(nullable = false)
    private String gameName;

    private Integer completionTime;

    @Column(nullable = false)
    private Integer score;

    @Column(length = 140)
    private String review;

    @Temporal(TemporalType.DATE)
    private Date completedAt;

    // Getters y setters
}

