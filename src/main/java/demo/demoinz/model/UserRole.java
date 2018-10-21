package demo.demoinz.model;

import javax.persistence.*;

@Entity
@Table(name = "USER_ROLE",
        uniqueConstraints = {
                @UniqueConstraint(name = "USER_ROLE_UK", columnNames = { "USER_ID", "ROLE_ID" }) })
public class UserRole {

    @Id
    @GeneratedValue
    @Column(name = "ID" , nullable = false)
    private Long Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    private AppUser appUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROLE_ID", nullable = false)
    private AppRole appRole;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public AppRole getAppRole() {
        return appRole;
    }

    public void setAppRole(AppRole appRole) {
        this.appRole = appRole;
    }
}
