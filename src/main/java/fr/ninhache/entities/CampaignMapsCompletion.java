package fr.ninhache.entities;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "campaign_maps_completion")
public class CampaignMapsCompletion extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "map_id", nullable = false)
    private CampaignMaps maps;

    @Column(name = "completion_time")
    private Date completionTime;

    @Temporal(TemporalType.DATE)
    @Column(name = "completion_date")
    private Date completionDate;

}
