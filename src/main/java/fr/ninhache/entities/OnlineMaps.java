package fr.ninhache.entities;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.json.JsonObject;
import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.sql.Date;

@Entity
@Table(name = "online_maps", indexes = {
		@Index(columnList = "id"),
		@Index(columnList = "creator_id")
})
public class OnlineMaps extends PanacheEntityBase {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "id")
	private String id;

	@JdbcTypeCode(SqlTypes.JSON)
	@Column(name = "map_data", nullable = false)
	private JsonObject mapData;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "creator_id", nullable = false)
	private User creator;

	@Column(name = "created_at", nullable = false)
	private Date createdAt;

	@Column(name = "updated_at", nullable = false)
	private Date updatedAt;

	@Column(name = "difficulty", nullable = false)
	private Integer difficulty;

}
