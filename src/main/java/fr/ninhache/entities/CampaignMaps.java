package fr.ninhache.entities;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.json.JsonObject;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name = "campaign_maps")
public class CampaignMaps extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private String id;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "map_data", nullable = false)
    private JsonObject mapData;

}
